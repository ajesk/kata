package io.acode.codewars;

public class ClockAngle {
    public static String whatTimeIsIt(final double angle) {
        int hour = (int)(angle / 30);
        int minute = (int) Math.floor(Math.abs((angle - (hour * 30))) * 2);
        if (hour == 0) hour = 12;
        return String.format("%02d", hour) + ":" + String.format("%02d", minute);
    }
}
