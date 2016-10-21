package com.example.iuliu.aa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 46014 on 2016/10/17.
 */

public class ItemDetails extends AppCompatActivity {
    private TextView customername;
    private TextView personnumber;
    private TextView birthdate;
    private TextView address;
    private TextView requiredmedicines;
    private ListView mlistView;
    // private ItemDbAdapter mDb;
    private Button back;
    private String username;
    private String from;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listrow_info);
        Intent intent = getIntent();
        //final String id = intent.getStringExtra("clickid");
        username = intent.getStringExtra("username");
        from = intent.getStringExtra("from");
        //mlistView=(ListView)findViewById(R.id.listView);
      //  Bundle bundle=getIntent().getExtras();
     //   int id=bundle.getInt("clickid");
        customername = (TextView)findViewById(R.id.text_itemname_id2);
        personnumber = (TextView)findViewById(R.id.textview_itemperson2);
        birthdate = (TextView)findViewById(R.id.textview_itemdate2);
        address = (TextView)findViewById(R.id.textview_itemaddress2);
        requiredmedicines = (TextView)findViewById(R.id.textView_itemmedicine2);


        back = (Button)findViewById(R.id.login_edit_btn_id4);
        //readInfo(id);
        //itemname.setText(username+"\n"+from+"\n"+id);

        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "Back", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
        );

    }


    /*public  void readInfo(String id){
        mDb = new ItemDbAdapter(this);
        mDb.open();
        Cursor cursor = mDb.getAllNotesByid(id);
        while(cursor.moveToNext()){
            String name1 = cursor.getString(cursor.getColumnIndex("name"));
            String description1 = cursor.getString(cursor.getColumnIndex("requiredmedicines"));
            //String item1 = cursor.getString(cursor.getColumnIndex("item"));
            String contact1 = cursor.getString(cursor.getColumnIndex("telephone"));
            String address1 = cursor.getString(cursor.getColumnIndex("address"));
            name.setText(name1);
            telephone.setText(contact1);
            address.setText(address1);
            requiredmedicines.setText(description1);
        }
        cursor.close();
        mDb.closeclose();
    }*/
}


