package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;

import com.dineout.code.model.kitchen.models.Dish;
import com.dineout.code.model.kitchen.models.DishDb;

import static org.junit.Assert.*;

public class DishDbTest {

    DishDb dishD;

    @Before
    public void setUp() throws Exception {
        dishD = new DishDb("LambRoast", "00:30:00", "500", "Roast");
    }

    @Test
    public void testgetDishName() {
        assertEquals("LambRoast", dishD.getDishName());
    }

    @Test
    public void testsetDishName() {
        dishD.setDishName("MuttonBiriyani");
        assertEquals("MuttonBiriyani", dishD.getDishName());

    }

    @Test
    public void testgetEstimatedTime() {
        assertEquals("00:30:00", dishD.getEstimatedTime());
    }


    @Test
    public void testsetEstimatedTime() {
        dishD.setEstimatedTime("00:40:00");
        assertEquals("00:40:00", dishD.getEstimatedTime());
    }

    @Test
    public void testgetPrice() {
        assertEquals("500", dishD.getPrice());
    }

    @Test
    public void testsetPrice() {
        dishD.setPrice("550");
        assertEquals("550", dishD.getPrice());
    }

    @Test
    public void testgetType() {
        assertEquals("Roast", dishD.getType());

    }

    @Test
    public void testsetType() {
        dishD.setType("Mutton");
        assertEquals("Mutton", dishD.getType());
    }
}