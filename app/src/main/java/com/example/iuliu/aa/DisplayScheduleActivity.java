package com.example.iuliu.aa;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ExpandableListView;

/**
 * Created by Iuliu on 2016-09-23.
 */
public class DisplayScheduleActivity extends Activity {

    SparseArray<Schedule> groups = new SparseArray<Schedule>();
    ExpandableListView listView;
    ScheduleExpandableListAdapter adapter;

    @Override

//tttttt
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        this.createData();
        listView = (ExpandableListView) findViewById(R.id.listView);
        adapter = new ScheduleExpandableListAdapter(this, groups);
        System.out.println(adapter.getGroupCount());
        System.out.println(listView.getVisibility());
        listView.setAdapter(adapter);

    }

    public void createData() {
        for (int j = 0; j < 7; j++) {
            Schedule group = new Schedule("Time slot:" + j);
            for (int i = 0; i < 1; i++) {
                group.children.add("Customer:" + i);
            }
            groups.append(j, group);
        }
    }
}

