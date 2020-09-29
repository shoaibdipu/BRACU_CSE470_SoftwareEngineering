package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.hall.DB.BillStatus;

import static org.junit.Assert.*;

public class BillStatusTest {

    BillStatus billS;

    @Before
    public void setUp() throws Exception {
        billS = new BillStatus("TBL001", "OD001", 2, "full");
    }

    @Test
    public void testgetTableID() {
        assertEquals("TBL001", billS.getTableID());
    }

    @Test
    public void testsetTableID() {
        billS.setTableID("TBL002");
        assertEquals("TBL002", billS.getTableID());
    }

    @Test
    public void testgetOrderID() {
        assertEquals("OD001", billS.getOrderID());
    }

    @Test
    public void testsetOrderID() {
        billS.setOrderID("OD002");
        assertEquals("OD002", billS.getOrderID());
    }

    @Test
    public void testgetAmount() {
        assertEquals(2, billS.getAmount());
    }

    @Test
    public void testsetAmount() {
        billS.setAmount(4);
        assertEquals(4, billS.getAmount());
    }

    @Test
    public void testgetStatus() {
        assertEquals("full", billS.getStatus());
    }

    @Test
    public void testsetStatus() {
        billS.setStatus("free");
        assertEquals("free", billS.getStatus());
    }
}