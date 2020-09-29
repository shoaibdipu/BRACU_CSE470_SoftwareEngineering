package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.kitchen.models.Chef;
import com.dineout.code.model.kitchen.models.Order;
import com.dineout.code.model.kitchen.models.OrderDetailsDb;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ChefTest {

    Chef chef;
    ArrayList<Order> mOrder = new ArrayList<>();
    ArrayList<OrderDetailsDb> chefQueue = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        chef = new Chef("Alex", "C001", mOrder, "Baker", chefQueue, false);
    }

    @Test
    public void testgetChefQueue() {
        assertEquals(chefQueue, chef.getChefQueue());
    }

    @Test
    public void testisCooking() {
        assertEquals(false, chef.isCooking());
    }

    @Test
    public void testreturnCookingTime() {
        assertEquals(0, chef.returnCookingTime());
    }

    @Test
    public void testreturnWaitingTime() {
        assertEquals(0, chef.returnWaitingTime());
    }

    @Test
    public void testisPresent() {
        assertEquals(false, chef.isPresent());
    }

    @Test
    public void testgetSpecialty() {
        assertEquals("Baker", chef.getSpecialty());
    }

    @Test
    public void testsetSpecialty() {
        chef.setSpecialty("Roaster");
        assertEquals("Roaster", chef.getSpecialty());
    }


    @Test
    public void testsetPresent() {
        chef.setPresent(true);
        assertEquals(true, chef.isPresent());
    }

    @Test
    public void testgetId() {
        assertEquals("C001", chef.getId());
    }

    @Test
    public void testsetId() {
        chef.setId("C002");
        assertEquals("C002", chef.getId());
    }

    @Test
    public void testgetName() {
        assertEquals("Alex", chef.getName());
    }

    @Test
    public void testsetName() {
        chef.setName("Robert");
        assertEquals("Robert", chef.getName());
    }

}