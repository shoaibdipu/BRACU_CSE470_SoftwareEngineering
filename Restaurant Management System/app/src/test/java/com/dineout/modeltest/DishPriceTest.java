package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.billing.DishPrice;
import com.dineout.code.model.kitchen.models.Dish;

import static org.junit.Assert.*;

public class DishPriceTest {

    DishPrice dishP;

    @Before
    public void setUp() throws Exception {
        dishP = new DishPrice("ChickenSoup", "200", "15:00", "Chicken");
    }

    @Test
    public void testgetDishname() {
        assertEquals("ChickenSoup", dishP.getDishname());
    }

    @Test
    public void testsetDishname() {
        dishP.setDishname("CornSoup");
        assertEquals("CornSoup", dishP.getDishname());
    }

    @Test
    public void testgetPrice() {
        assertEquals("200", dishP.getPrice());
    }

    @Test
    public void testsetPrice() {
        dishP.setPrice("250");
        assertEquals("250", dishP.getPrice());
    }

    @Test
    public void testgetEstimatedtime() {
        assertEquals("15:00", dishP.getEstimatedtime());
    }

    @Test
    public void testsetEstimatedtime() {
        dishP.setEstimatedtime("18:00");
        assertEquals("18:00", dishP.getEstimatedtime());
    }

    @Test
    public void testgetTypeofdish() {
        assertEquals("Chicken", dishP.getTypeofdish());
    }

    @Test
    public void testsetTypeofdish() {
        dishP.setTypeofdish("Corn");
        assertEquals("Corn", dishP.getTypeofdish());
    }
}