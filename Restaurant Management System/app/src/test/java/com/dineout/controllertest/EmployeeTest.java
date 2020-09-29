package com.dineout.controllertest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.controller.admin.Employee;
import static org.junit.Assert.*;

public class EmployeeTest {
    Employee emp;
    @Before
    public void setUp() throws Exception {
        emp = new Employee("01", "Thomas", "thomas@gmail.com", "test20", "QA", "20000", "regular");
    }

    @Test
    public void testgetId() {
        assertEquals("01", emp.getId());
    }

    @Test
    public void testsetId() {
        emp.setId("02");
        assertEquals("02", emp.getId());
    }

    @Test
    public void testgetName() {
        assertEquals("Thomas", emp.getName());
    }

    @Test
    public void testsetName() {
        emp.setName("Cormen");
        assertEquals("Cormen", emp.getName());
    }

    @Test
    public void testgetEmail() {
        assertEquals("thomas@gmail.com", emp.getEmail());
    }

    @Test
    public void testsetEmail() {
        emp.setEmail("cormen@gmail.com");
        assertEquals("cormen@gmail.com", emp.getEmail());
    }

    @Test
    public void testgetPassword() {
        assertEquals("test20", emp.getPassword());
    }

    @Test
    public void testsetPassword() {
        emp.setPassword("test20Changed");
        assertEquals("test20Changed", emp.getPassword());
    }

    @Test
    public void testgetSpecialty() {
        assertEquals("QA", emp.getSpecialty());
    }

    @Test
    public void testsetSpecialty() {
        emp.setSpecialty("SystemArchitect");
        assertEquals("SystemArchitect",  emp.getSpecialty());
    }

    @Test
    public void testgetSalary() {
        assertEquals("20000",  emp.getSalary());
    }

    @Test
    public void testsetSalary() {
        emp.setSalary("25000");
        assertEquals("25000",  emp.getSalary());
    }

    @Test
    public void testgetType() {
        assertEquals("regular",  emp.getType());
    }

    @Test
    public void testsetType() {
        emp.setType("contractual");
        assertEquals("contractual",  emp.getType());
    }
}