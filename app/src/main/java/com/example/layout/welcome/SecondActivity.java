package com.example.layout.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {
  TextView name;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        //created viewid for the Textview
        name=(TextView)findViewById(R.id.textView);

        //it gets the intent
        Bundle getbundle =this.getIntent().getExtras();
        String n = getbundle.getString("name");
        name.setText("Welcome "+n);//here it displays the welcome username which we declared in the first activity
        Toast.makeText(getApplicationContext(),"Welcome to LoginScreen",Toast.LENGTH_SHORT).show();//it displays the toast here


    }
}
