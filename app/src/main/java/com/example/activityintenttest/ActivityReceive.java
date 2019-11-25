package com.example.activityintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityReceive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        TextView textR=(TextView)findViewById(R.id.text_receive);
        Intent intent =getIntent();
        String data=intent.getStringExtra("data");
        textR.setText(data);
    }
}
