package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by 박연후 on 2017-06-15.
 */

public class RobotChoice extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robot_choice);

        ArrayAdapter<CharSequence> adapter;
        adapter = ArrayAdapter.createFromResource(this, R.array.robot, android.R.layout.simple_expandable_list_item_1);

        ListView list=(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(mItemClickListener);
    }

AdapterView.OnItemClickListener mItemClickListener=new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getApplicationContext(), Menu.class);
        startActivity(intent);
    }
};
}
