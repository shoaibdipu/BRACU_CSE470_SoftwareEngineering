package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.hall.DB.Order;

import static org.junit.Assert.*;

public class OrderTest {

    Order od;

    @Before
    public void setUp() throws Exception {
        od = new Order("TBL001", "OD001", 3, "00:15:00");
    }

    @Test
    public void testgetTableID() {
        assertEquals("TBL001", od.getTableID());
    }

    @Test
    public void testsetTableID() {
        od.setTableID("TBL002");
        assertEquals("TBL002", od.getTableID());
    }

    @Test
    public void testgetId() {
        assertEquals("OD001", od.getId());
    }

    @Test
    public void testsetId() {
        od.setId("OD002");
        assertEquals("OD002", od.getId());
    }

    @Test
    public void testgetStatus() {
        assertEquals(3, od.getStatus());
    }

    @Test
    public void testsetStatus() {
        od.setStatus(5);
        assertEquals(5, od.getStatus());

    }

    @Test
    public void testgetTimestamp() {
        assertEquals("00:15:00", od.getTimestamp());
    }

    @Test
    public void testsetTimestamp() {
        od.setTimestamp("00:18:00");
        assertEquals("00:18:00", od.getTimestamp());
    }
}