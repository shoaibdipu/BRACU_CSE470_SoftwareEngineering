package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.hall.DB.Receipt;

import static org.junit.Assert.*;

public class ReceiptTest {

    Receipt rct;

    @Before
    public void setUp() throws Exception {
        rct = new Receipt("OD001", 200, 200);
    }

    @Test
    public void testgetOrderid() {
        assertEquals("OD001", rct.getOrderid());
    }

    @Test
    public void testsetOrderid() {
        rct.setOrderid("OD002");
        assertEquals("OD002", rct.getOrderid());
    }

    @Test
    public void testgetPaid() {
        assertEquals(200, rct.getPaid());
    }

    @Test
    public void testsetPaid() {
        rct.setPaid(300);
        assertEquals(300, rct.getPaid());
    }

    @Test
    public void testgetTotalamount() {
        assertEquals(200, rct.getTotalamount());
    }

    @Test
    public void testsetTotalamount() {
        rct.setTotalamount(300);
        assertEquals(300, rct.getTotalamount());

    }
}