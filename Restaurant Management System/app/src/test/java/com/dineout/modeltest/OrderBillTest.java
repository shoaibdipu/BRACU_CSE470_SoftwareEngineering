package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;

import com.dineout.code.model.billing.DishOrder;
import com.dineout.code.model.billing.OrderBill;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OrderBillTest {

    OrderBill ob;
    ArrayList<DishOrder> d = new ArrayList<DishOrder>();

    @Before
    public void setUp() throws Exception {
        ob = new OrderBill("A001", "1001", d, "15:00");
    }

    @Test
    public void testgetTime() {
        assertEquals("15:00", ob.getTime());
    }

    @Test
    public void testsetTime() {
        ob.setTime("18:00");
        assertEquals("18:00", ob.getTime());

    }

    @Test
    public void testgetId() {
        assertEquals("A001", ob.getId());
    }

    @Test
    public void testsetId() {
        ob.setId("B001");
        assertEquals("B001", ob.getId());
    }

    @Test
    public void testgetTable() {
        assertEquals("1001", ob.getTable());
    }

    @Test
    public void testsetTable() {
        ob.setTable("2001");
        assertEquals("2001", ob.getTable());
    }

    @Test
    public void testgetD() {
        assertEquals(d, ob.getD());
    }

    @Test
    public void testsetD() {
        ob.setD(d);
        assertEquals(d, ob.getD());
    }

}