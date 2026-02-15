package DateAndTimeAPI;

import java.time.*;   // Java 8 Date and Time API package

public class Test1
{
    public static void main(String[] args)
    {
        // Get the current system time
        LocalTime time = LocalTime.now();

        // Extract hour from current time (0–23)
        int hour = time.getHour();

        // Extract minute from current time (0–59)
        int minute = time.getMinute();

        // Extract second from current time (0–59)
        int second = time.getSecond();

        // Extract nanosecond from current time
        int nano = time.getNano();

        // Print time in custom format: hour:minute:second:nanosecond
        System.out.printf("%d:%d:%d:%d", hour, minute, second, nano);
    }
}

