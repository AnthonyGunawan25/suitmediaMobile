package com.example.suitmedia;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private Button toPage2;
    private TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        toPage2 = findViewById(R.id.toPage2);
        textViewStatus = findViewById(R.id.textViewStatus);

        toPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString();

                Intent intent = new Intent(MainActivity.this, page2.class);
                intent.putExtra("keyname", username);
                intent.putExtra("eventTitle", "Pilih Event");
                startActivity(intent);
            }
        });
    }

    public void buttonCheckPalindrome (View view){
            char[] charInput = name.getText().toString().toCharArray();
            int intLength = charInput.length;
            boolean isPalindrome = true;

            for (int i = 0; i < intLength / 2; i++) {
                if (charInput[i] != charInput[intLength - 1 - i]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                textViewStatus.setText("isPalindrome");
            } else {
                textViewStatus.setText("not palindrome");
            }
        }
    }
