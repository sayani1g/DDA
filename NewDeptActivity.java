package com.example.android.dda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewDeptActivity extends AppCompatActivity {
    Button GoToNewActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dept2);
        GoToNewActivity=(Button)findViewById(R.id.button3);
        GoToNewActivity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(NewDeptActivity.this,NewHODActivity.class);
                startActivity(intent);
            }
        });
    }
}
