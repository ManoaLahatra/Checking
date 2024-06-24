package mg.pointage;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class CheckIn {
    private final Calendar calendar;

    public DayTypes getDayOfCalendar(LocalDate date) {
        return calendar.getDays().getOrDefault(date, DayTypes.NORMAL);
    }
}