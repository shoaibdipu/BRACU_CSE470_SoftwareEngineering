package com.dineout.viewtest;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.view.order.setQuantity;
import static org.junit.Assert.*;

public class setQuantityTest {

    setQuantity setQ;
    View view;

    @Before
    public void setUp() throws Exception {
        setQ = new setQuantity();
    }

    @Test
    public void testincreaseInteger() {
        setQ.increaseInteger();
        assertEquals(2, setQ.getQuantity());
    }

    @Test
    public void testdecreaseInteger() {
        setQ.increaseInteger(); // Initial 1 + 1
        setQ.decreaseInteger(); // 1 + 1 - 1
        assertEquals(1, setQ.getQuantity()); //
    }
}