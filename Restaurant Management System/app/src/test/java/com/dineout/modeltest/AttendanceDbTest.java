package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.kitchen.models.AttendanceDb;

import static org.junit.Assert.*;

public class AttendanceDbTest {

    AttendanceDb adb;

    @Before
    public void setUp() throws Exception {
        adb = new AttendanceDb("E001", false);
    }

    @Test
    public void testgetId() {
        assertEquals("E001", adb.getId());
    }

    @Test
    public void testsetId() {
        adb.setId("E002");
        assertEquals("E002", adb.getId());
    }

    @Test
    public void testgetPresent() {
        assertEquals(false, adb.getPresent());
    }

    @Test
    public void testsetPresent() {
        adb.setPresent(true);
        assertEquals(true, adb.getPresent());
    }
}