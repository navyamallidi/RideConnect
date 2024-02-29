package com.n.connection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {

    private Button driverButton;
    private Button customerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        driverButton = (Button) findViewById(R.id.driver);
        customerButton = (Button) findViewById(R.id.customer);

        driverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginregisterintent =  new Intent(welcome.this, driverlogin.class);
                startActivity(loginregisterintent);
            }
        });

        customerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginregisterintent =  new Intent(welcome.this, customerlogin.class);
                startActivity(loginregisterintent);
            }
        });
    }
}