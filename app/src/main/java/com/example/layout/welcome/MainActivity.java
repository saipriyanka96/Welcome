package com.example.layout.welcome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username,email,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username= (EditText) findViewById(R.id.username);
        email=(EditText)findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.button);


        //creating onclicklistener for the button once creating
        // //if we click on login button it goes to the second screen of second activity
        //using bundle we are creating the intent for login screen
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = username.getText().toString();//here String type will the text of email
                Bundle bundle = new Bundle();//creating bundle
                bundle.putString("name", name);//it puts the string value here
                Intent i = new Intent(MainActivity.this, SecondActivity.class);//creating intent obj for this class with the UserDetails class
                i.putExtras(bundle);//in bundle we use i.putExtras
                startActivity(i);//here it starts the activity
            }
        });
    }
    }


