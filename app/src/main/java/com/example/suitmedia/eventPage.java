package com.example.suitmedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.EventLog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class eventPage extends AppCompatActivity {

    private TextView name;
    String A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_page);
        name = findViewById(R.id.text_name);
    }

    public void eventToPage2(View view){
        TextView eventTitle = (TextView)findViewById(R.id.eventTitle);
        A = eventTitle.getText().toString();
        String username = getIntent().getStringExtra("keyname1");
        Intent eventoPage2 = new Intent(eventPage.this, page2.class);
        eventoPage2.putExtra("keyname", username);
        eventoPage2.putExtra("eventTitle", A);
        startActivity(eventoPage2);
    }

    public void event1ToPage2(View view){
        TextView eventTitle = (TextView)findViewById(R.id.eventTitle1);
        A = eventTitle.getText().toString();
        String username = getIntent().getStringExtra("keyname1");
        Intent eventoPage2 = new Intent(eventPage.this, page2.class);
        eventoPage2.putExtra("keyname", username);
        eventoPage2.putExtra("eventTitle", A);
        startActivity(eventoPage2);
    }

    public void event2ToPage2(View view){
        TextView eventTitle = (TextView)findViewById(R.id.eventTitle2);
        A = eventTitle.getText().toString();
        String username = getIntent().getStringExtra("keyname1");
        Intent eventoPage2 = new Intent(eventPage.this, page2.class);
        eventoPage2.putExtra("keyname", username);
        eventoPage2.putExtra("eventTitle", A);
        startActivity(eventoPage2);
    }

    public void event3ToPage2(View view){
        TextView eventTitle = (TextView)findViewById(R.id.eventTitle3);
        A = eventTitle.getText().toString();
        String username = getIntent().getStringExtra("keyname1");
        Intent eventoPage2 = new Intent(eventPage.this, page2.class);
        eventoPage2.putExtra("keyname", username);
        eventoPage2.putExtra("eventTitle", A);
        startActivity(eventoPage2);
    }

}