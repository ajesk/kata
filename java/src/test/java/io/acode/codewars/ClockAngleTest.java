package io.acode.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockAngleTest {

    @Test
    public void test1200() {
        assertEquals("12:00", ClockAngle.whatTimeIsIt(0));
        assertEquals("12:00", ClockAngle.whatTimeIsIt(360));
    }

    @Test
    public void test0300() {
        assertEquals("03:00", ClockAngle.whatTimeIsIt(90));
    }

    @Test
    public void test0600() {
        assertEquals("06:00", ClockAngle.whatTimeIsIt(180));
    }

    @Test
    public void test0900() {
        assertEquals("09:00", ClockAngle.whatTimeIsIt(270));
    }

    @Test
    public void test1025() {
        assertEquals("10:25", ClockAngle.whatTimeIsIt(312.6976136934428));
    }

    @Test
    public void test0120() {
        assertEquals("01:20", ClockAngle.whatTimeIsIt(40));
    }

    @Test
    public void test029dot8665d() {
        assertEquals("12:59", ClockAngle.whatTimeIsIt(29.8665d));
    }
}
