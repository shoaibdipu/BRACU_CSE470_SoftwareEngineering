package com.dineout.modeltest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.model.hall.DB.Assignment;

import static org.junit.Assert.*;

public class AssignmentTest {

    Assignment asst;

    @Before
    public void setUp() throws Exception {
        asst = new Assignment("E001", "TBL001", "TBLT001");
    }

    @Test
    public void testgetEmployeeid() {
        assertEquals("E001", asst.getEmployeeid());
    }

    @Test
    public void testsetEmployeeid() {
        asst.setEmployeeid("E002");
        assertEquals("E002", asst.getEmployeeid());
    }

    @Test
    public void testgetTableID() {
        assertEquals("TBL001", asst.getTableID());

    }

    @Test
    public void testsetTableID() {
        asst.setTableID("TBL002");
        assertEquals("TBL002", asst.getTableID());
    }

    @Test
    public void testgetTabletID() {
        assertEquals("TBLT001", asst.getTabletID());
    }

    @Test
    public void setTabletID() {
        asst.setTabletID("TBLT002");
        assertEquals("TBLT002", asst.getTabletID());
    }
}