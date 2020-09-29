package com.dineout.viewtest;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;

import com.dineout.code.model.kitchen.models.Chef;
import com.dineout.code.view.kitchen.RecyclerViewAdapterAttendanceList;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RecyclerViewAdapterAttendanceListTest {

    RecyclerViewAdapterAttendanceList rView;

    private ArrayList<Chef> mChefs = new ArrayList<>();
    private Context mContext;

    @Before
    public void setUp() throws Exception {
        rView = new RecyclerViewAdapterAttendanceList(mContext, mChefs);
    }

    @Test
    public void testgetmChefs() {
        assertEquals(mChefs, rView.getmChefs());
    }

    @Test
    public void testgetItemCount() {
        assertEquals(0, rView.getItemCount());
    }
}