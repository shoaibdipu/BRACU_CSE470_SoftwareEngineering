package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.hall.DB.Inventory;

import static org.junit.Assert.*;

public class InventoryTest {

    Inventory ivt;

    @Before
    public void setUp() throws Exception {
        ivt = new Inventory("yogurt", 250, 3, 2);
    }

    @Test
    public void testgetItemname() {
        assertEquals("yogurt", ivt.getItemname());
    }

    @Test
    public void testsetItemname() {
        ivt.setItemname("vinegar");
        assertEquals("vinegar", ivt.getItemname());
    }

    @Test
    public void testgetPrice() {
        assertEquals(250, ivt.getPrice());
    }

    @Test
    public void testsetPrice() {
        ivt.setPrice(300);
        assertEquals(300, ivt.getPrice());
    }

    @Test
    public void testgetQuantity() {
        assertEquals(3, ivt.getQuantity());
    }

    @Test
    public void testsetQuantity() {
        ivt.setQuantity(5);
        assertEquals(5, ivt.getQuantity());
    }

    @Test
    public void testgetMinthreshold() {
        assertEquals(2, ivt.getMinthreshold());
    }

    @Test
    public void testsetMinthreshold() {
        ivt.setMinthreshold(3);
        assertEquals(3, ivt.getMinthreshold());
    }
}