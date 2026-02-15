package DateAndTimeAPI;

import java.time.*;

public class Test5
{
    public static void main(String[] args)
    {
        LocalDate birthday = LocalDate.of(2003, 4, 15);
        LocalDate today = LocalDate.now();

        Period p = Period.between(birthday, today);

        System.out.printf(
            "Age is %d Years %d Months %d Days",
            p.getYears(),
            p.getMonths(),
            p.getDays()
        );
    }
}
