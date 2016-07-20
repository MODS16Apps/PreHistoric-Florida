package org.example.prehistoricflorida;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class AnimalInfo extends Activity implements OnClickListener {
    private static final String TAG = "PrehistoricFlorida";
    int animal = 0;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(this);
        View backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(this);
        View homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next_button:
                animal++;
                animals();
                break;
            case R.id.back_button:
                animal--;
                animals();
                break;
            case R.id.home_button:
                Intent i = new Intent(this, PrehistoricFlorida.class);
                startActivity(i);
                break;
        }
    }

    public void animals() {

        if (animal == 1) {
            setContentView(R.layout.triviaq1);
            // Set up click listeners for all the buttons
            View aButton = findViewById(R.id.a1);
            aButton.setOnClickListener(this);
            View bButton = findViewById(R.id.b1);
            bButton.setOnClickListener(this);
            View cButton = findViewById(R.id.c1);
            cButton.setOnClickListener(this);
            View dButton = findViewById(R.id.d1);
            dButton.setOnClickListener(this);
        }
        if (animal == 2) {
            setContentView(R.layout.triviaq2);
            // Set up click listeners for all the buttons
            View a2Button = findViewById(R.id.a2);
            a2Button.setOnClickListener(this);
            View b2Button = findViewById(R.id.b2);
            b2Button.setOnClickListener(this);
            View c2Button = findViewById(R.id.c2);
            c2Button.setOnClickListener(this);
            View d2Button = findViewById(R.id.d2);
            d2Button.setOnClickListener(this);
        }

        if (animal == 3) {
            setContentView(R.layout.triviaq3);
            // Set up click listeners for all the buttons
            View a2Button = findViewById(R.id.a3);
            a2Button.setOnClickListener(this);
            View b2Button = findViewById(R.id.b3);
            b2Button.setOnClickListener(this);
            View c2Button = findViewById(R.id.c3);
            c2Button.setOnClickListener(this);
            View d2Button = findViewById(R.id.d3);
            d2Button.setOnClickListener(this);
        }

        if (animal == 4) {
            setContentView(R.layout.triviaq4);
            // Set up click listeners for all the buttons
            View a2Button = findViewById(R.id.a4);
            a2Button.setOnClickListener(this);
            View b2Button = findViewById(R.id.b4);
            b2Button.setOnClickListener(this);
            View c2Button = findViewById(R.id.c4);
            c2Button.setOnClickListener(this);
            View d2Button = findViewById(R.id.d4);
            d2Button.setOnClickListener(this);
        }

        if (animal == 5) {
            setContentView(R.layout.triviaq5);
            // Set up click listeners for all the buttons
            View a2Button = findViewById(R.id.a5);
            a2Button.setOnClickListener(this);
            View b2Button = findViewById(R.id.b5);
            b2Button.setOnClickListener(this);
            View c2Button = findViewById(R.id.c5);
            c2Button.setOnClickListener(this);
            View d2Button = findViewById(R.id.d5);
            d2Button.setOnClickListener(this);
        }

        if (animal == 6) {
            setContentView(R.layout.triviaq6);
            // Set up click listeners for all the buttons
            View a2Button = findViewById(R.id.a6);
            a2Button.setOnClickListener(this);
            View b2Button = findViewById(R.id.b6);
            b2Button.setOnClickListener(this);
            View c2Button = findViewById(R.id.c6);
            c2Button.setOnClickListener(this);
            View d2Button = findViewById(R.id.d6);
            d2Button.setOnClickListener(this);
        }

        if (animal == 7) {
            setContentView(R.layout.triviaq7);
            // Set up click listeners for all the buttons
            View a2Button = findViewById(R.id.a7);
            a2Button.setOnClickListener(this);
            View b2Button = findViewById(R.id.b7);
            b2Button.setOnClickListener(this);
            View c2Button = findViewById(R.id.c7);
            c2Button.setOnClickListener(this);
            View d2Button = findViewById(R.id.d7);
            d2Button.setOnClickListener(this);
        }

        if (animal == 8) {
            setContentView(R.layout.triviaq8);
            // Set up click listeners for all the buttons
            View a2Button = findViewById(R.id.a8);
            a2Button.setOnClickListener(this);
            View b2Button = findViewById(R.id.b8);
            b2Button.setOnClickListener(this);
            View c2Button = findViewById(R.id.c8);
            c2Button.setOnClickListener(this);
            View d2Button = findViewById(R.id.d8);
            d2Button.setOnClickListener(this);
        }

        if (animal == 9) {
            setContentView(R.layout.triviaq9);
            // Set up click listeners for all the buttons
            View a2Button = findViewById(R.id.a9);
            a2Button.setOnClickListener(this);
            View b2Button = findViewById(R.id.b9);
            b2Button.setOnClickListener(this);
            View c2Button = findViewById(R.id.c9);
            c2Button.setOnClickListener(this);
            View d2Button = findViewById(R.id.d9);
            d2Button.setOnClickListener(this);
        }



    }
}
