package com.dineout.controllertest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.controller.admin.NotificationClass;

import static org.junit.Assert.*;

public class NotificationClassTest {

    NotificationClass nc;

    @Before
    public void setUp() throws Exception {
        nc = new NotificationClass("ChickenSoup", "15:00", false);
    }

    @Test
    public void testgetItemName() {
        assertEquals("ChickenSoup",  nc.getItemName());
    }

    @Test
    public void testsetItemName() {
        nc.setItemName("CornSoup");
        assertEquals("CornSoup",   nc.getItemName());
    }

    @Test
    public void testgetTime() {
        assertEquals("15:00",  nc.getTime());
    }

    @Test
    public void testsetTime() {
        nc.setItemName("CornSoup");
        assertEquals("CornSoup",   nc.getItemName());
    }

    @Test
    public void testisRead() {
        assertEquals(false,   nc.isRead());
    }

    @Test
    public void testsetRead() {
        nc.setRead(true);
        assertEquals(true,   nc.isRead());

    }
}