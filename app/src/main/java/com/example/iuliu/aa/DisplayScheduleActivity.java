package com.example.iuliu.aa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import static com.example.iuliu.aa.R.menu.menu_succes;

/**
 * Created by Iuliu on 2016-09-23.
 */
public class DisplayScheduleActivity extends AppCompatActivity {

    SparseArray<Schedule> groups = new SparseArray<Schedule>();
    ExpandableListView listView;
    ScheduleExpandableListAdapter adapter;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        this.createData();
        listView = (ExpandableListView) findViewById(R.id.listView);
        adapter = new ScheduleExpandableListAdapter(this, groups);
        System.out.println(adapter.getGroupCount());
        System.out.println(listView.getVisibility());
        listView.setAdapter(adapter);


        getSupportActionBar().setTitle("Daily Schedule");

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_succes, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.mybutton_calendar) {
            Intent intent = new Intent(DisplayScheduleActivity.this, CalendarActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
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

