package com.dineout.controllertest;

import org.junit.Before;
import org.junit.Test;

import com.dineout.code.controller.admin.Item;

import static org.junit.Assert.*;

public class ItemTest {
    Item item;
    @Before
    public void setUp() throws Exception {
        item = new Item("Soup", "200", "3", "5");
    }


    @Test
    public void testgetName(){
        String name = item.getName();
        assertEquals("Soup", name);
    }

    @Test
    public void testgetPrice(){
        String price = item.getPrice();
        assertEquals("200", price);
    }

    @Test
    public void testgetQuantity(){
        String quantity = item.getQuantity();
        assertEquals("3", quantity);
    }

    @Test
    public void testgetThreshold(){
        String th = item.getThreshold();
        assertEquals("5", th);
    }

    @Test
    public void testsetName(){
        item.setName("ChickenSoup");
        assertEquals("ChickenSoup", item.getName());
    }

    @Test
    public void testsetPrice(){
        item.setPrice("350");
        assertEquals("350", item.getPrice());
    }

    @Test
    public void testsetThreshold(){
        item.setThreshold("7");
        assertEquals("7", item.getThreshold());
    }

    @Test
    public void testsetQuantity(){
        item.setQuantity("6");
        assertEquals("6", item.getQuantity());
    }

}