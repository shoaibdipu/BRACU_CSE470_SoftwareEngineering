package com.dineout.controllertest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.controller.admin.IngredientRow;

import static org.junit.Assert.*;

public class IngredientRowTest {

    IngredientRow irow;

    @Before
    public void setUp() throws Exception {
        irow = new IngredientRow("vinegar", "500ml");
    }

    @Test
    public void testgetName() {
        assertEquals("vinegar",   irow.getName());
    }

    @Test
    public void testsetName() {
        irow.setName("yogurt");
        assertEquals("yogurt",   irow.getName());
    }

    @Test
    public void testgetQuantity() {
        assertEquals("500ml",   irow.getQuantity());
    }

    @Test
    public void testsetQuantity() {
        irow.setQuantity("750ml");
        assertEquals("750ml",   irow.getQuantity());
    }
}