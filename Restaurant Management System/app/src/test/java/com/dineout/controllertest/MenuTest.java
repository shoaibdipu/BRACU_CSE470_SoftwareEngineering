package com.dineout.controllertest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.controller.admin.Menu;

import static org.junit.Assert.*;

public class MenuTest {

    Menu menu;
    @Before
    public void setUp() throws Exception {
        menu = new Menu("ChickenSoup", "15:00", "Chicken", "200");
    }

    @Test
    public void testgetDishName() {
        assertEquals("ChickenSoup",  menu.getDishName());
    }

    @Test
    public void testsetDishName() {
        menu.setDishName("CornSoup");
        assertEquals("CornSoup",  menu.getDishName());
    }

    @Test
    public void testgetEstimatedTime() {
        assertEquals("15:00",  menu.getEstimatedTime());
    }

    @Test
    public void testsetEstimatedTime() {
        menu.setEstimatedTime("18:00");
        assertEquals("18:00",  menu.getEstimatedTime());
    }

    @Test
    public void testgetType() {
        assertEquals("Chicken",  menu.getType());
    }


    @Test
    public void testsetType() {
        menu.setType("Chilly");
        assertEquals("Chilly",  menu.getType());
    }

    @Test
    public void testgetPrice() {
        assertEquals("200",  menu.getPrice());
    }

    @Test
    public void testsetPrice() {
        menu.setPrice("250");
        assertEquals("250",  menu.getPrice());
    }
}