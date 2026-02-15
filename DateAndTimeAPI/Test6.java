package DateAndTimeAPI;

import java.time.*;

public class Test6
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

        LocalDate deathday = LocalDate.of(2003+60,04,15);
        Period p1 = Period.between(today, deathday);

        int d = p1.getYears()*365 + p1.getMonths()*30 + p1.getDays();

        System.out.printf(
            "\nYou will be on the earth only %d Days..Hurry up to do more imp Things",
            d
        );
    }
}
