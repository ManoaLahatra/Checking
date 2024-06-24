import mg.pointage.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckInTest {

    private CheckIn checkIn;

    @BeforeEach
    void setUp() {
        Calendar june = new Calendar("2024-06-01", "2024-06-30");
        june.addDay("2024-06-01", DayTypes.NORMAL);
        june.addDay("2024-06-02", DayTypes.NORMAL);
        june.addDay("2024-06-03", DayTypes.NORMAL);
        june.addDay("2024-06-04", DayTypes.NORMAL);
        june.addDay("2024-06-05", DayTypes.NORMAL);
        june.addDay("2024-06-06", DayTypes.NORMAL);
        june.addDay("2024-06-07", DayTypes.NORMAL);
        june.addDay("2024-06-08", DayTypes.NORMAL);
        june.addDay("2024-06-09", DayTypes.NORMAL);
        june.addDay("2024-06-10", DayTypes.NORMAL);
        june.addDay("2024-06-11", DayTypes.NORMAL);
        june.addDay("2024-06-12", DayTypes.NORMAL);
        june.addDay("2024-06-13", DayTypes.NORMAL);
        june.addDay("2024-06-14", DayTypes.NORMAL);
        june.addDay("2024-06-15", DayTypes.NORMAL);
        june.addDay("2024-06-16", DayTypes.NORMAL);
        june.addDay("2024-06-17", DayTypes.FEAST);
        june.addDay("2024-06-18", DayTypes.NORMAL);
        june.addDay("2024-06-19", DayTypes.NORMAL);
        june.addDay("2024-06-20", DayTypes.NORMAL);
        june.addDay("2024-06-21", DayTypes.NORMAL);
        june.addDay("2024-06-22", DayTypes.NORMAL);
        june.addDay("2024-06-23", DayTypes.NORMAL);
        june.addDay("2024-06-24", DayTypes.NORMAL);
        june.addDay("2024-06-25", DayTypes.FEAST);
        june.addDay("2024-06-26", DayTypes.FEAST);
        june.addDay("2024-06-27", DayTypes.NORMAL);
        june.addDay("2024-06-28", DayTypes.NORMAL);
        june.addDay("2024-06-29", DayTypes.NORMAL);
        june.addDay("2024-06-30", DayTypes.NORMAL);

        checkIn = new CheckIn(june);
    }

    @Test
    void juneCalendar() {
        Category guadian = new Category("Guardian", 56, 110_000.0);
        Employee rakoto = new Employee("Rakoto", "Rakoto", 0, "1990-01-01", "2010-01-01", "2030-01-01", guadian, checkIn);
        Employee rabe = new Employee("Rabe", "Rabe", 1, "1990-01-01", "2010-01-01", "2030-01-01", guadian, checkIn);

        rakoto.work("2024-06-01", 6, 14);
        rakoto.work("2024-06-02", 6, 14);
        rakoto.work("2024-06-03", 6, 14);
        rakoto.work("2024-06-04", 6, 14);
        rakoto.work("2024-06-05", 6, 14);
        rakoto.work("2024-06-06", 6, 14);
        rakoto.work("2024-06-07", 6, 14);
        rakoto.work("2024-06-08", 6, 14);
        rakoto.work("2024-06-09", 6, 14);
        rakoto.work("2024-06-10", 6, 14);
        rakoto.work("2024-06-11", 6, 14);
        rakoto.work("2024-06-12", 6, 14);
        rakoto.work("2024-06-13", 6, 14);
        rakoto.work("2024-06-14", 6, 14);
        rakoto.work("2024-06-15", 6, 14);
        rakoto.work("2024-06-16", 6, 14);
        rakoto.work("2024-06-17", 6, 14);
        rakoto.work("2024-06-18", 6, 14);
        rakoto.work("2024-06-19", 6, 14);
        rakoto.work("2024-06-20", 6, 14);
        rakoto.work("2024-06-21", 6, 14);
        rakoto.work("2024-06-22", 6, 14);
        rakoto.work("2024-06-23", 6, 14);
        rakoto.work("2024-06-24", 6, 14);
        // rakoto doesn't work 2024-06-25 2024-06-26
        rakoto.work("2024-06-27", 6, 14);
        rakoto.work("2024-06-28", 6, 14);
        rakoto.work("2024-06-29", 6, 14);
        rakoto.work("2024-06-30", 6, 14);

        rabe.work("2024-06-01", 0, 6);
        rabe.work("2024-06-01", 14, 24);
        rabe.work("2024-06-02", 0, 6);
        rabe.work("2024-06-02", 14, 24);
        rabe.work("2024-06-03", 0, 6);
        rabe.work("2024-06-03", 14, 24);
        rabe.work("2024-06-04", 0, 6);
        rabe.work("2024-06-04", 14, 24);
        rabe.work("2024-06-05", 0, 6);
        rabe.work("2024-06-05", 14, 24);
        rabe.work("2024-06-06", 0, 6);
        rabe.work("2024-06-06", 14, 24);
        rabe.work("2024-06-07", 0, 6);
        rabe.work("2024-06-07", 14, 24);
        rabe.work("2024-06-08", 0, 6);
        rabe.work("2024-06-08", 14, 24);
        rabe.work("2024-06-09", 0, 6);
        rabe.work("2024-06-09", 14, 24);
        rabe.work("2024-06-10", 0, 6);
        rabe.work("2024-06-10", 14, 24);
        rabe.work("2024-06-11", 0, 6);
        rabe.work("2024-06-11", 14, 24);
        rabe.work("2024-06-12", 0, 6);
        rabe.work("2024-06-12", 14, 24);
        rabe.work("2024-06-13", 0, 6);
        rabe.work("2024-06-13", 14, 24);
        rabe.work("2024-06-14", 0, 6);
        rabe.work("2024-06-14", 14, 24);
        rabe.work("2024-06-15", 0, 6);
        rabe.work("2024-06-15", 14, 24);
        rabe.work("2024-06-16", 0, 6);
        rabe.work("2024-06-16", 14, 24);
        rabe.work("2024-06-17", 0, 6);
        rabe.work("2024-06-17", 14, 24);
        rabe.work("2024-06-18", 0, 6);
        rabe.work("2024-06-18", 14, 24);
        rabe.work("2024-06-19", 0, 6);
        rabe.work("2024-06-19", 14, 24);
        rabe.work("2024-06-20", 0, 6);
        rabe.work("2024-06-20", 14, 24);
        rabe.work("2024-06-21", 0, 6);
        rabe.work("2024-06-21", 14, 24);
        rabe.work("2024-06-22", 0, 6);
        rabe.work("2024-06-22", 14, 24);
        rabe.work("2024-06-23", 0, 6);
        rabe.work("2024-06-23", 14, 24);
        rabe.work("2024-06-24", 0, 6);
        rabe.work("2024-06-24", 14, 24);
        rabe.work("2024-06-25", 0, 24);
        rabe.work("2024-06-26", 0, 24);
        rabe.work("2024-06-27", 0, 6);
        rabe.work("2024-06-27", 14, 24);
        rabe.work("2024-06-28", 0, 6);
        rabe.work("2024-06-28", 14, 24);
        rabe.work("2024-06-29", 0, 6);
        rabe.work("2024-06-29", 14, 24);
        rabe.work("2024-06-30", 0, 6);
        rabe.work("2024-06-30", 14, 24);

        assertEquals(224, rakoto.getWorkingHours());
        assertEquals(496, rabe.getWorkingHours());
    }
}