package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.order.cart;

import static org.junit.Assert.*;

public class CartTest {

    cart ct;

    @Before
    public void setUp() throws Exception {
        ct = new cart("CornSoup", 2);
    }

    @Test
    public void testgetAddedname() {
        assertEquals("CornSoup", ct.getAddedname());
    }

    @Test
    public void testsetAddedname() {
        ct.setAddedname("ChiliSoup");
        assertEquals("ChiliSoup", ct.getAddedname());
    }

    @Test
    public void testgetQuantity() {
        assertEquals(2, ct.getQuantity());
    }

    @Test
    public void testsetQuantity() {
        ct.setQuantity(3);
        assertEquals(3, ct.getQuantity());
    }
}