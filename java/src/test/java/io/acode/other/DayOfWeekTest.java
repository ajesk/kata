package io.acode.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeekTest {

    DayOfWeek dow = new DayOfWeek();

    @Test
    public void itShouldReturnTheSameDayPassedIn() {
        assertEquals("Mon", dow.getDay("Mon", 0));
        assertEquals("Tue", dow.getDay("Tue", 0));
        assertEquals("Wed", dow.getDay("Wed", 0));
        assertEquals("Thu", dow.getDay("Thu", 0));
        assertEquals("Fri", dow.getDay("Fri", 0));
        assertEquals("Sat", dow.getDay("Sat", 0));
        assertEquals("Sun", dow.getDay("Sun", 0));
    }
}
