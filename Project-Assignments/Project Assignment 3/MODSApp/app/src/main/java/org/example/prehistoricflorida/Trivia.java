/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/eband3 for more book information.
 ***/
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
import android.widget.TextView;

public class Trivia extends Activity implements OnClickListener {
    private static final String TAG = "PrehistoricFlorida";
    int question = 1;// sets question #  equal to 1
    int points = 0; // creates points
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        triviaGame();


    }

    // ...

    public void onClick(View v) {

        if (question == 1) {
            switch (v.getId()) {
                case R.id.a1:
                    question++; // clls next question
                    incorrect("Penguin");// calls incorrect function with argument
                    triviaGame();
                    break;
                case R.id.b1:
                    question++;
                    incorrect("Penguin");
                    triviaGame();
                    break;
                // More buttons go here (if any) ...
                case R.id.c1:
                    points++;
                    question++;
                    correct(); // calls correct function
                    triviaGame();
                    break;
                case R.id.d1:
                    question++;
                    incorrect("Penguin");
                    triviaGame();
                    break;
            }
        }

        if (question == 2) {
            switch (v.getId()) {
                case R.id.a2:
                    question++;
                    incorrect("Dinosaur");
                    triviaGame();
                    break;
                case R.id.b2:
                    question++;
                    incorrect("Dinosaur");
                    triviaGame();
                    break;
                // More buttons go here (if any) ...
                case R.id.c2:
                    question++;
                    incorrect("Dinosaur");
                    triviaGame();
                    break;
                case R.id.d2:
                    points++;
                    question++;
                    correct();
                    triviaGame();
                    break;
            }


        }

        if (question == 3) {
            switch (v.getId()) {
                case R.id.a3:
                    question++;
                    incorrect("530 million years ago");
                    triviaGame();
                    break;
                case R.id.b3:
                    question++;
                    incorrect("530 million years ago");
                    triviaGame();
                    break;
                // More buttons go here (if any) ...
                case R.id.c3:
                    question++;
                    incorrect("530 million years ago");
                    triviaGame();
                    break;
                case R.id.d3:
                    points++;
                    question++;
                    correct();
                    triviaGame();
                    break;
            }
        }

        if (question == 4) {
            switch (v.getId()) {
                case R.id.a4:
                    question++;
                    incorrect("sea turtle");
                    triviaGame();
                    break;
                case R.id.b4:
                    question++;
                    incorrect("sea turtle");
                    triviaGame();
                    break;
                // More buttons go here (if any) ...
                case R.id.c4:
                    points++;
                    question++;
                    correct();
                    triviaGame();
                    break;
                case R.id.d4:
                    question++;
                    incorrect("sea turtle");
                    triviaGame();
                    break;
            }
        }

        if (question == 5) {
            switch (v.getId()) {
                case R.id.a5:
                    question++;
                    incorrect("2.6 million");
                    triviaGame();
                    break;
                case R.id.b5:
                    points++;
                    question++;
                    correct();
                    triviaGame();
                    break;
                // More buttons go here (if any) ...
                case R.id.c5:
                    question++;
                    incorrect("2.6 million");
                    triviaGame();
                    break;
                case R.id.d5:
                    question++;
                    incorrect("2.6 million");
                    triviaGame();
                    break;
            }
        }

        if (question == 6) {
            switch (v.getId()) {
                case R.id.a6:
                    question++;
                    incorrect("Florida was underwater when dinosaurs lived.");
                    triviaGame();
                    break;
                case R.id.b6:
                    points++;
                    question++;
                    correct();
                    triviaGame();
                    break;
                // More buttons go here (if any) ...
                case R.id.c6:
                    question++;
                    incorrect("Florida was underwater when dinosaurs lived.");
                    triviaGame();
                    break;
                case R.id.d6:
                    question++;
                    incorrect("Florida was underwater when dinosaurs lived.");
                    triviaGame();
                    break;
            }
        }

        if (question == 7) {
            switch (v.getId()) {
                case R.id.a7:
                    question++;
                    incorrect("saber toothed tiger");
                    triviaGame();
                    break;
                case R.id.b7:
                    question++;
                    incorrect("saber toothed tiger");
                    triviaGame();
                    break;
                // More buttons go here (if any) ...
                case R.id.c7:
                    points++;
                    question++;
                    correct();
                    triviaGame();
                    break;
                case R.id.d7:
                    question++;
                    incorrect("saber toothed tiger");
                    triviaGame();
                    break;
            }
        }

        if (question == 8) {
            switch (v.getId()) {
                case R.id.a8:
                    question++;
                    incorrect("0");
                    triviaGame();
                    break;
                case R.id.b8:
                    question++;
                    incorrect("0");
                    triviaGame();
                    break;
                // More buttons go here (if any) ...
                case R.id.c8:
                    points++;
                    question++;
                    correct();
                    triviaGame();
                    break;
                case R.id.d8:
                    question++;
                    incorrect("0");
                    triviaGame();
                    break;
            }
        }

        if (question == 9) {
            switch (v.getId()) {
                case R.id.a9:
                    question++;
                    incorrect("alligators");
                    triviaGame();
                    break;
                case R.id.b9:
                    points++;
                    question++;
                    correct();
                    triviaGame();
                    break;
                // More buttons go here (if any) ...
                case R.id.c9:
                    question++;
                    incorrect("alligators");
                    triviaGame();
                    break;
                case R.id.d9:
                    question++;
                    incorrect("alligators");
                    triviaGame();
                    break;
            }
        }

        if (question == 10) {
            switch (v.getId()) {
                case R.id.atrue:
                    points++;
                    correct();
                    Intent i = new Intent(this, TriviaScore.class);
                    Bundle b = new Bundle();
                    b.putInt("key", points);
                    i.putExtras(b);
                    startActivity(i);
                    break;
                case R.id.bfalse:
                    incorrect("True");
                    Intent j = new Intent(this, TriviaScore.class);
                    Bundle c = new Bundle(); // creates bundle
                    c.putInt("key", points); // adds points variable to bundle
                    j.putExtras(c); // adds bundle to intent
                    startActivity(j);
                    break;
            }
        }
    }

    public void triviaGame() {

        if (question == 1) {
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
        if (question == 2) {
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

        if (question == 3) {
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

        if (question == 4) {
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

        if (question == 5) {
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

        if (question == 6) {
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

        if (question == 7) {
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

        if (question == 8) {
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

        if (question == 9) {
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

        if (question == 10) {
            setContentView(R.layout.triviaq10);
            // Set up click listeners for all the buttons
            View a2Button = findViewById(R.id.atrue);
            a2Button.setOnClickListener(this);
            View b2Button = findViewById(R.id.bfalse);
            b2Button.setOnClickListener(this);
        }


    }

    public void incorrect(final String answer) {
//        TextView incorrect = (TextView) findViewById(R.id.response);
//        incorrect.setText("Incorrect. Answer: " + answer);
        AlertDialog.Builder Incorrect = new AlertDialog.Builder(this); // displays alert dialog with argument

                Incorrect.setTitle(R.string.answer);
                Incorrect.setMessage(("Incorrect.\n Answer: " + answer));

                Incorrect.setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) { // sets next button
                        triviaGame();

                    }
                });

                Incorrect.show();
    }

    public void correct() {
//        TextView correct = (TextView) findViewById(R.id.response);
//        correct.setText("Correct!");
        AlertDialog.Builder Correct = new AlertDialog.Builder(this); // displays alert dialog

        Correct.setTitle(R.string.answer);
        Correct.setMessage(("Correct!"));
        Correct.setPositiveButton("Next", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                triviaGame();

            }
        });

        Correct.show();

    }

}
