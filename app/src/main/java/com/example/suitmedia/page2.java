package com.example.suitmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class page2 extends AppCompatActivity {

    private TextView name;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        name = findViewById(R.id.text_name);
        title = findViewById(R.id.eventTitle);

        String event;
        String username = getIntent().getStringExtra("keyname");
        event = getIntent().getStringExtra("eventTitle");
        name.setText(username);
        title.setText(event);
    }


    public void toEvent(View view){
        String username = getIntent().getStringExtra("keyname");
        Intent toEvent = new Intent(page2.this, eventPage.class);
        toEvent.putExtra("keyname1", username);
        System.out.println(username);
        startActivity(toEvent);
    }

    public void toGuest(View view){
        Intent toGuest = new Intent(page2.this, Guest.class);
        startActivity(toGuest);
    }
}