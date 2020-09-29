package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.admin.Table;

import static org.junit.Assert.*;

public class TableTest {

    Table table;

    @Before
    public void setUp() throws Exception {
        table = new Table("1001", "full", "8");
    }

    @Test
    public void testgetTableID() {
        assertEquals("1001", table.getTableID());
    }


    @Test
    public void testsetTableID() {
        table.setTableID("2001");
        assertEquals("2001", table.getTableID());
    }

    @Test
    public void testgetStatus() {
        assertEquals("full", table.getStatus());
    }

    @Test
    public void testsetStatus() {
        table.setStatus("free");
        assertEquals("free", table.getStatus());
    }

    @Test
    public void testgetCapacity() {
        assertEquals("8", table.getCapacity());
    }

    @Test
    public void testsetCapacity() {
        table.setCapacity("12");
        assertEquals("12", table.getCapacity());
    }
}