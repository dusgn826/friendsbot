package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by 박연후 on 2017-06-27.
 */

public class Login extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        EditText id=(EditText)this.findViewById(R.id.inputid);
        EditText pw=(EditText)this.findViewById(R.id.password);

        Button btn=(Button)this.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), Choice.class);
                startActivity(intent);
            }
        });
    }
}
