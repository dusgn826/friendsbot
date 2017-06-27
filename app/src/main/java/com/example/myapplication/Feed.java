package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by 박연후 on 2017-06-27.
 */

public class Feed extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed);

        ArrayList<String> time = new ArrayList<String>();
        time.add("10:59");
        time.add("12.35");

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, time);

        ListView list = (ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);

        Button btn=(Button)this.findViewById(R.id.add);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), Addtime.class);
                startActivity(intent);
            }
        });
    }
}
