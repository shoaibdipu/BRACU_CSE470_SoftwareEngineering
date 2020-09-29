package com.dineout.viewtest;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;

import com.dineout.code.model.billing.OrderBill;
import com.dineout.code.view.billing.OrdersAdapter;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OrdersAdapterTest {

    OrdersAdapter odrA;
    ArrayList<OrderBill> data = new ArrayList<>();
    private Context c;

    @Before
    public void setUp() throws Exception {
        odrA = new OrdersAdapter(data, 5, c);
    }

    @Test
    public void testgetItemCount() {
        assertEquals(0, odrA.getItemCount());
    }
}