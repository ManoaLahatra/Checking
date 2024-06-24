package mg.pointage;

import lombok.Getter;

import java.time.LocalDate;

import static mg.pointage.DayTypes.*;

@Getter
public class Employee {

    private final String firstname, lastname;
    private final Integer registrationNumber;
    private final LocalDate birthDate, hireDate, dateEndOfContract;
    private Double grossSalary, netSalary;
    private final Category category;
    private final CheckIn checkIn;
    private Integer workingHours;

    public Employee(
            String firstname,
            String lastname,
            Integer registrationNumber,
            String birthDate,
            String hireDate,
            String dateEndOfContract,
            Category category,
            CheckIn checkIn
    ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.registrationNumber = registrationNumber;
        this.birthDate = LocalDate.parse(birthDate);
        this.hireDate = LocalDate.parse(hireDate);
        this.dateEndOfContract = LocalDate.parse(dateEndOfContract);
        this.category = category;
        this.grossSalary = this.category.getRegularSalaryPerWeek();
        this.netSalary = this.grossSalary - this.grossSalary * 0.2;
        this.checkIn = checkIn;
        this.workingHours = 0;
    }

    public void work(String date, Integer startHour, Integer endHour) {
        LocalDate localDate = LocalDate.parse(date);
        workingHours += endHour - startHour;
        DayTypes dayType = checkIn.getDayOfCalendar(localDate);
        double standardHourlyRate = category.getRegularSalaryPerWeek() / category.getRegularNumberOfHour();
        double dailySalary = 0.0;

        // Calculate day and night hours
        int dayHours = 0;
        int nightHours = 0;

        for (int hour = startHour; hour < endHour; hour++) {
            if (hour >= 18 || hour < 6) {
                nightHours++;
            } else {
                dayHours++;
            }
        }

        // Calculate salary for day hours
        if (dayHours > 0) {
            dailySalary += calculateDailySalary(dayHours, standardHourlyRate, dayType);
        }

        // Calculate salary for night hours
        if (nightHours > 0) {
            double nightHourlyRate = standardHourlyRate * 1.3;
            dailySalary += calculateDailySalary(nightHours, nightHourlyRate, dayType);
        }

        grossSalary += dailySalary;
        netSalary = grossSalary * 0.8;
    }

    private double calculateDailySalary(int hours, double hourlyRate, DayTypes dayType) {
        double dailySalary = 0.0;

        if (hours <= category.getRegularNumberOfHour()) {
            dailySalary += hours * hourlyRate * getDayTypeMultiplier(dayType);
        } else {
            dailySalary += category.getRegularNumberOfHour() * hourlyRate * getDayTypeMultiplier(dayType);
            int supplementaryHours = hours - category.getRegularNumberOfHour();

            if (supplementaryHours <= 8) {
                dailySalary += supplementaryHours * hourlyRate * 1.3;
            } else if (supplementaryHours <= 20) {
                dailySalary += 8 * hourlyRate * 1.3;
                dailySalary += (supplementaryHours - 8) * hourlyRate * 1.5;
            }
        }

        return dailySalary;
    }

    private double getDayTypeMultiplier(DayTypes dayType) {
        return switch (dayType) {
            case NORMAL -> 1.0;
            case SUNDAY -> 1.4;
            case FEAST -> 1.5;
        };
    }

}