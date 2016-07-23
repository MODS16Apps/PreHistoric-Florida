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
import android.widget.EditText;
import android.widget.TextView;

public class ScavengerHunt extends Activity implements OnClickListener {
    private static final String TAG = "PrehistoricFlorida";
    int task = 1;
    EditText mEdit;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hunt();


    }

    public void onClick(View v) {

        if (task == 1) {
            mEdit   = (EditText)findViewById(R.id.answer);
            switch (v.getId()) {
                case R.id.enter_button:
                    String answer = mEdit.getText().toString();
                    String a = answer.toLowerCase();
                    if (a.equals("archelon")) {
                        TextView correct = (TextView) findViewById(R.id.incorrect);
                        correct.setText("Correct");;
                        break;
                    }
                    else {
                        TextView incorrect = (TextView) findViewById(R.id.incorrect);
                        incorrect.setText("Incorrect");
                        break;
                    }
                case R.id.home_button :
                    Intent i = new Intent(this, PrehistoricFlorida.class);
                    startActivity(i);
                    break;
                case R.id.next_button :
                    task++;
                    hunt();
                    break;
            }
        }
        if (task == 2) {
            TextView start  = (TextView) findViewById(R.id.incorrect);
            start.setText("");
            mEdit   = (EditText)findViewById(R.id.answer);
            switch (v.getId()) {
                case R.id.enter_button:
                    String answer = mEdit.getText().toString();
                    String b = answer.toLowerCase();
                    if (b.equals("mosasaur") || b.equals("plesiosaur") || b.equals("pliosaur")) {
                        TextView correct = (TextView) findViewById(R.id.incorrect);
                        correct.setText("Correct");
                        break;
                    }
                    else {
                        TextView incorrect = (TextView) findViewById(R.id.incorrect);
                        incorrect.setText("Incorrect");
                        break;
                    }
                case R.id.home_button :
                    Intent i = new Intent(this, PrehistoricFlorida.class);
                    startActivity(i);
                    break;
                case R.id.next_button :
                    task++;
                    hunt();
                    break;
            }
        }
        if (task == 3) {
            mEdit   = (EditText)findViewById(R.id.answer);
            switch (v.getId()) {
                case R.id.enter_button:
                    String answer = mEdit.getText().toString();
                    String c = answer.toLowerCase();
                    if (c.equals("saber toothed tiger")) {
                        TextView correct = (TextView) findViewById(R.id.incorrect);
                        correct.setText("Correct");
                        break;
                    }
                    else {
                        TextView incorrect = (TextView) findViewById(R.id.incorrect);
                        incorrect.setText("Incorrect");
                        break;
                    }
                case R.id.home_button :
                    Intent i = new Intent(this, PrehistoricFlorida.class);
                    startActivity(i);
                    break;
                case R.id.next_button :
                    task++;
                    hunt();
                    break;
            }
        }
        if (task == 4) {
            mEdit   = (EditText)findViewById(R.id.answer);
            switch (v.getId()) {
                case R.id.enter_button:
                    String answer = mEdit.getText().toString();
                    String d = answer.toLowerCase();
                    if (d.equals("megalodon")) {
                        TextView correct = (TextView) findViewById(R.id.incorrect);
                        correct.setText("Correct");
                        break;
                    }
                    else {
                        TextView incorrect = (TextView) findViewById(R.id.incorrect);
                        incorrect.setText("Incorrect");
                        break;
                    }
                case R.id.home_button :
                    Intent i = new Intent(this, PrehistoricFlorida.class);
                    startActivity(i);
                    break;
            }
        }
    }


    public void hunt() {

        if (task == 1) {
            setContentView(R.layout.scavenger1);
            // Set up click listeners for all the buttons
            View eButton = findViewById(R.id.enter_button);
            eButton.setOnClickListener(this);
            View hButton = findViewById(R.id.home_button);
            hButton.setOnClickListener(this);
            View nButton = findViewById(R.id.next_button);
            nButton.setOnClickListener(this);
        }

        if (task == 2) {
            setContentView(R.layout.scavenger2);
            // Set up click listeners for all the buttons
            View eButton = findViewById(R.id.enter_button);
            eButton.setOnClickListener(this);
            View hButton = findViewById(R.id.home_button);
            hButton.setOnClickListener(this);
            View nButton = findViewById(R.id.next_button);
            nButton.setOnClickListener(this);
        }

        if (task == 3) {
            setContentView(R.layout.scavenger3);
            // Set up click listeners for all the buttons
            View eButton = findViewById(R.id.enter_button);
            eButton.setOnClickListener(this);
            View hButton = findViewById(R.id.home_button);
            hButton.setOnClickListener(this);
            View nButton = findViewById(R.id.next_button);
            nButton.setOnClickListener(this);
        }

        if (task == 4) {
            setContentView(R.layout.scavenger4);
            // Set up click listeners for all the buttons
            View eButton = findViewById(R.id.enter_button);
            eButton.setOnClickListener(this);
            View hButton = findViewById(R.id.home_button);
            hButton.setOnClickListener(this);
            View nButton = findViewById(R.id.next_button);
            nButton.setOnClickListener(this);
        }

    }
}