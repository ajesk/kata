package io.acode.other;

import java.util.Arrays;

public class DayOfWeek {

    String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    String getDay(String start, int noOfDays) {
        return days[(noOfDays + Arrays.asList(days).indexOf(start)) % days.length];
    }
}
