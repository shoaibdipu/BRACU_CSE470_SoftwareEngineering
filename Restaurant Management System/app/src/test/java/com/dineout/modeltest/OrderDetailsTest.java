package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.hall.DB.OrderDetails;

import static org.junit.Assert.*;

public class OrderDetailsTest {

    OrderDetails odd;

    @Before
    public void setUp() throws Exception {
        odd = new OrderDetails("OD001", "ChickenSoup", 15, 1, 5, 3 );
    }

    @Test
    public void testgetOrderid() {
        assertEquals("OD001", odd.getOrderid());
    }

    @Test
    public void testsetOrderid() {
        odd.setOrderid("OD002");
        assertEquals("OD002", odd.getOrderid());
    }

    @Test
    public void testgetDishname() {
        assertEquals("ChickenSoup", odd.getDishname());
    }

    @Test
    public void testsetDishname() {
        odd.setDishname("CornSoup");
        assertEquals("CornSoup", odd.getDishname());
    }

    @Test
    public void testgetEstimatedtime() {
        assertEquals(15, odd.getEstimatedtime());
    }

    @Test
    public void testsetEstimatedtime() {
        odd.setEstimatedtime(20);
        assertEquals(20, odd.getEstimatedtime());
    }


    @Test
    public void testgetPriority() {
        assertEquals(1, odd.getPriority());
    }

    @Test
    public void testsetPriority() {
        odd.setPriority(2);
        assertEquals(2, odd.getPriority());

    }

    @Test
    public void testgetStatus() {
        assertEquals(5, odd.getStatus());
    }

    @Test
    public void testsetStatus() {
        odd.setStatus(3);
        assertEquals(3, odd.getStatus());
    }

    @Test
    public void testgetServings() {
        assertEquals(3, odd.getServings());
    }

    @Test
    public void testsetServings() {
        odd.setServings(7);
        assertEquals(7, odd.getServings());
    }
}