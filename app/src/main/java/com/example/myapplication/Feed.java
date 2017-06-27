package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 박연후 on 2017-06-27.
 */

public class Feed extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed);

        final ArrayList<String> time = new ArrayList<String>();
        time.add("10:59");
        time.add("12.35");

        final ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, time);

        final ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
        //list.setOnItemClickListener(mItemClickListener);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Feed.this);
                alertDialog.setTitle("Delete");
                alertDialog.setMessage("클릭한 시간을 삭제하시겠습니까?");
                alertDialog.setIcon(R.drawable.dog);

                alertDialog.setPositiveButton("확인",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        int check;
                        check = list.getCheckedItemPosition();

                        /*
                        time.remove(check);
                        list.clearChoices();
                        adapter.notifyDataSetChanged();
                        */
                    }
                });
                alertDialog.setNegativeButton("취소",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            }
        });

        Button btn = (Button) this.findViewById(R.id.add);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Addtime.class);
                startActivity(intent);
            }
        });
    }
}
