import mg.pointage.Calendar;
import mg.pointage.Category;
import mg.pointage.CheckIn;
import mg.pointage.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckInPartTwoTest {
    Calendar calendar;
    CheckIn checkIn;
    Category guardian;
    Employee rakoto;
    Employee rabe;

    @BeforeEach
    void setUp() {
        calendar = new Calendar("2024-05-26", "2024-07-06");
        calendar.fillCalendar("2024-05-26", "2024-07-06");
        checkIn = new CheckIn(calendar);
        guardian = new Category("Guardian", 56, 100_000.0);

        rakoto = new Employee("Rakoto", "Rakoto", 0, "1990-01-01", "2010-01-01", "2030-01-01", guardian, checkIn);
        rabe = new Employee("Rabe", "Rabe", 1, "1990-01-01", "2010-01-01", "2030-01-01", guardian, checkIn);
    }

    @Test
    void guardianWorkEveryDay() {
        rakoto.fillChecking("2024-05-26", "2024-07-06", 8, 18);
        rabe.fillChecking("2024-05-26", "2024-07-06", 18, 24);
        rabe.fillChecking("2024-05-26", "2024-07-06", 0, 8);

        assertEquals(420, rakoto.getWorkingHours());
        assertEquals(588, rabe.getWorkingHours());

        assertEquals(100_000, rakoto.getGrossSalary());
    }

}