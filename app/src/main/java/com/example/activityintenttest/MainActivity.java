package com.example.activityintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send = (Button)findViewById(R.id.bt_send);
        send.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bt_send){
            EditText textS=(EditText) findViewById(R.id.text_send);
            String str=textS.getText().toString();
//            String str = "Changed";
            Intent intent = new Intent(MainActivity.this,ActivityReceive.class);
            intent.putExtra("data",str);
            startActivity(intent);
        }
    }
}
