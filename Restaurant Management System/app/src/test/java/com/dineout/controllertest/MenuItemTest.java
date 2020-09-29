package com.dineout.controllertest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.controller.admin.MenuItem;

import static org.junit.Assert.*;

public class MenuItemTest {

    MenuItem mitm;

    @Before
    public void setUp() throws Exception {
        mitm = new MenuItem("ChickenSoup", "Chicken", "3");
    }

    @Test
    public void testgetQuantity() {
        assertEquals("3",  mitm.getQuantity());
    }

    @Test
    public void testsetQuantity() {
        mitm.setQuantity("5");
        assertEquals("5",  mitm.getQuantity());
    }

    @Test
    public void testgetDishName() {
        assertEquals("Chicken",  mitm.getDishName());
    }

    @Test
    public void testsetDishName() {
        mitm.setDishName("CornSoup");
        assertEquals("CornSoup",  mitm.getDishName());
    }

    @Test
    public void testgetIngredientName() {
        assertEquals("Chicken",  mitm.getIngredientName());
    }

    @Test
    public void testsetIngredientName() {
        mitm.setIngredientName("Corn");
        assertEquals("Corn",  mitm.getIngredientName());
    }
}