package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.admin.Tablet;

import static org.junit.Assert.*;

public class TabletTest {

    Tablet tablet;

    @Before
    public void setUp() throws Exception {
        tablet = new Tablet("1001", "full");
    }

    @Test
    public void testgetTabletID() {
        assertEquals("1001", tablet.getTabletID());
    }

    @Test
    public void testsetTabletID() {
        tablet.setTabletID("2001");
        assertEquals("2001", tablet.getTabletID());
    }

    @Test
    public void testgetStatus() {
        assertEquals("full", tablet.getStatus());
    }

    @Test
    public void testsetStatus() {
        tablet.setStatus("free");
        assertEquals("free", tablet.getStatus());
    }
}