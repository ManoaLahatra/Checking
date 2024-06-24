package mg.pointage;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Category {

    private String categoryName;
    private Integer regularNumberOfHour;
    private Double regularSalaryPerWeek;

}