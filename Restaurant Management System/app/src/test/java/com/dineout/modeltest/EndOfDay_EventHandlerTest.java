package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.reporting.EndOfDay_EventHandler;

import static org.junit.Assert.*;

public class EndOfDay_EventHandlerTest {

    EndOfDay_EventHandler eod;

    @Before
    public void setUp() throws Exception {
        eod = new EndOfDay_EventHandler(
                20000, 3000, 1500);
    }

    @Test
    public void testgetWeekDayIndex() {
        assertEquals(1, eod.GetWeekDayIndex("Saturday"));
    }

    @Test
    public void testgetDayOfWeek() {
        assertEquals("Saturday", eod.getDayOfWeek(1));
    }

    @Test
    public void testgetProfit() {
        assertEquals(20000-3000-1500, eod.getProfit());
    }
}