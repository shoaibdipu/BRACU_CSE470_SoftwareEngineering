package com.dineout.viewtest;

import org.junit.Before;
import org.junit.Test;
import com.dineout.code.view.admin.NotificationsAdapter;
import com.dineout.code.controller.admin.NotificationClass;
import android.content.Context;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NotificationsAdapterTest {

    NotificationsAdapter nAdapter;
    private Context context;
    private ArrayList<NotificationClass> list = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        nAdapter = new NotificationsAdapter(context, list);
    }

    @Test
    public void getItemCount() {
        assertEquals(0, nAdapter.getItemCount());
    }
}