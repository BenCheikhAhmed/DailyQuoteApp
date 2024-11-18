package com.example.personalizeddailyquoteapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textQuote;
    private Button buttonNewQuote;

    // Array of sample quotes
    private String[] quotes = {
            "Believe you can and you're halfway there.",
            "The only way to do great work is to love what you do.",
            "Success is not final; failure is not fatal: It is the courage to continue that counts.",
            "Dream big and dare to fail.",
            "Do one thing every day that scares you."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind UI elements
        textQuote = findViewById(R.id.textQuote);
        buttonNewQuote = findViewById(R.id.buttonNewQuote);

        // Set initial quote
        textQuote.setText(getRandomQuote());

        // Set button click listener
        buttonNewQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textQuote.setText(getRandomQuote());
            }
        });
    }

    // Method to get a random quote
    private String getRandomQuote() {
        Random random = new Random();
        return quotes[random.nextInt(quotes.length)];
    }
}
