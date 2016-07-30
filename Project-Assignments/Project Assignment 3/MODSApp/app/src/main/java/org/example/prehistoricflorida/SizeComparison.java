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

public class SizeComparison extends Activity implements OnClickListener {
    private static final String TAG = "PrehistoricFlorida";

    int animal = 1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sizecomparison();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next_button:
                animal++;
                sizecomparison();
                break;
            case R.id.back_button:
                animal--;
                sizecomparison();
                break;
            case R.id.home_button:
                Intent i = new Intent(this, PrehistoricFlorida.class);
                startActivity(i);
                break;
        }
    }


    public void sizecomparison() {


        if (animal == 1) {
            setContentView(R.layout.megatherium_size);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

//        if (animal == 2) {
//            setContentView(R.layout.dugong_size);
//
//            View nextButton = findViewById(R.id.next_button);
//            nextButton.setOnClickListener(this);
//            View backButton = findViewById(R.id.back_button);
//            backButton.setOnClickListener(this);
//            View homeButton = findViewById(R.id.home_button);
//            homeButton.setOnClickListener(this);
//        }

        if (animal == 2) {
            setContentView(R.layout.mammoth_size);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 3) {
            setContentView(R.layout.archelon_size);

            View nextButton = findViewById(R.id.next_button);
            nextButton.setOnClickListener(this);
            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);
        }

        if (animal == 4) {
            setContentView(R.layout.megalodon_size);

            View backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(this);
            View homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(this);

        }
    }
}