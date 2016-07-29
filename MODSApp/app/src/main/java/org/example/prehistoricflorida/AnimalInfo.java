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
    int animal = 1; // sets animal number to 1

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        animals();

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next_button:
                animal++; // calls next animal
                animals();
                break;
            case R.id.back_button:
                animal--; // calls previous animal
                animals();
                break;
            case R.id.home_button:
                Intent i = new Intent(this, PrehistoricFlorida.class);
                startActivity(i); // goes to the home page
                break;
        }
    }

    public void animals() {

        if (animal == 1) {
            setContentView(R.layout.archelon);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 2) {
            setContentView(R.layout.tiger);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 3) {
            setContentView(R.layout.phorusrhacidae);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 4) {
            setContentView(R.layout.megatherium);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 5) {
            setContentView(R.layout.mastodon);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 6) {
            setContentView(R.layout.horse);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 7) {
            setContentView(R.layout.casteriode);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 8) {
            setContentView(R.layout.bear);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 9) {
            setContentView(R.layout.megalodon);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 10) {
            setContentView(R.layout.mammoth);

 ///           View nextButton = findViewById(R.id.next_button);
 ///           nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);

        }




    }
}
