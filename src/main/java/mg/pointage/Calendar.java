package mg.pointage;

import lombok.Getter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

@Getter
public class Calendar {
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Map<LocalDate, DayTypes> days;

    public Calendar(String startDate, String endDate) {
        this.startDate = LocalDate.parse(startDate);
        this.endDate = LocalDate.parse(endDate);
        this.days = new HashMap<>();
    }

    public void addDay(String date, DayTypes dayType) {
        LocalDate localDate = LocalDate.parse(date);
        if ((localDate.isEqual(startDate) || localDate.isAfter(startDate)) && (localDate.isEqual(endDate) || localDate.isBefore(endDate))) {
            if (localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                days.put(localDate, DayTypes.SUNDAY);
            }
            days.put(localDate, dayType);
        } else {
            throw new RuntimeException("Date " + date + " is not in the range between " + startDate + " and " + endDate);
        }
    }

    public void fillCalendar(String startDate, String endDate) {
        LocalDate day = LocalDate.parse(startDate);
        for (var i = 0; i < ChronoUnit.DAYS.between(LocalDate.parse(startDate), LocalDate.parse(endDate)); i++) {
            days.put(day, DayTypes.NORMAL);
            day = day.plusDays(1);
        }
    }
}