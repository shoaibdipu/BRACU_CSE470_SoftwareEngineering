package com.dineout.viewtest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.view.hall.Adapter;

import android.content.Context;
import com.dineout.code.model.hall.DB.Assignment;
import com.dineout.code.model.hall.DB.BillStatus;
import com.dineout.code.model.hall.DB.Order;
import com.dineout.code.model.hall.DB.Table;
import com.dineout.code.model.hall.DB.Tablet;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AdapterTest {

    Adapter adapter;

    Context context;
    ArrayList<Table> tables = new ArrayList<>();
    ArrayList<Tablet> tablets = new ArrayList<>();
    ArrayList<BillStatus> billstatus = new ArrayList<>();
    ArrayList<Order> serveorder = new ArrayList<>();
    ArrayList<Assignment> track = new ArrayList<>();
    int Flag;

    @Before
    public void setUp() throws Exception {
        adapter = new Adapter(context, 1, tables, tablets, billstatus, serveorder, track);
    }

    @Test
    public void testgetItemCount() {
        assertEquals(0, adapter.getItemCount());
    }

    @Test
    public void testgetItemViewType() {
        assertEquals(1, adapter.getItemViewType(3));
    }

}