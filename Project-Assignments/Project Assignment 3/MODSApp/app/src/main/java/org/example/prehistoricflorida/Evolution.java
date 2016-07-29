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

public class Evolution extends Activity implements OnClickListener {
    private static final String TAG = "PrehistoricFlorida";
    int animal = 1; // sets animal # to 1

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        evolution();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next_button:
                animal++; // calls next animal
                evolution();
                break;
            case R.id.back_button: {
                animal--; // calls previous animal
                evolution();
                break;
            }
            case R.id.home_button:
                Intent i = new Intent(this, PrehistoricFlorida.class);
                startActivity(i); // goes to main menu
                break;
        }
    }

    public void evolution() {


        if (animal == 1) {
            setContentView(R.layout.elephant_evolution);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 2) {
            setContentView(R.layout.horse_evolution);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

    }
}
