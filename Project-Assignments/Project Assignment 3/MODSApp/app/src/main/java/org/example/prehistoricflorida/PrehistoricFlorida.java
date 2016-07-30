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
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

public class PrehistoricFlorida extends Activity implements OnClickListener {
    private static final String TAG = "PrehistoricFlorida";
    int rating;
    static final String exhibit = "Prehistoric Florida";
    String comment;
    private Tracker mTracker; // creates analytics tracker


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // Set up click listeners for all the buttons
        View continueButton = findViewById(R.id.animals_button);
        continueButton.setOnClickListener(this);
        View newButton = findViewById(R.id.games_button);
        newButton.setOnClickListener(this);
        View aboutButton = findViewById(R.id.map_button);
        aboutButton.setOnClickListener(this);
        View exitButton = findViewById(R.id.sea_level_button);
        exitButton.setOnClickListener(this);
        View feedbackButton = findViewById(R.id.feedback_button);
        feedbackButton.setOnClickListener(this);

        googleAnalytics application = (googleAnalytics) getApplication(); // initializes tracker
        mTracker = application.getDefaultTracker();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater(); //creates credits menu
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.credits:
                Intent k = new Intent(this, Credits.class);
                startActivity(k);
                break;
            // More items go here (if any) ...
        }
        return false;
    }

    // ...

    public void onClick(View v) {
        switch (v.getId()) { // waits for button press
            case R.id.animals_button:
                Intent j = new Intent(this, Animals.class);
                startActivity(j);
                break;
            case R.id.map_button:
                Intent i = new Intent(this, Map.class);
                startActivity(i);
                break;
            // More buttons go here (if any) ...
            case R.id.games_button:
                Intent k = new Intent(this, Games.class);
                startActivity(k);
                break;
            case R.id.sea_level_button:
                Intent l = new Intent(this, SeaLevel.class);
                startActivity(l);
                break;
            case R.id.feedback_button:
                rating();
                break;
        }
    }

    public void rating() { // opens rating dialog
            new AlertDialog.Builder(this)
                    .setTitle(R.string.rating)
                    .setItems(R.array.rating,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialoginterface,
                                                    int i) {
                                    rating = i + 1;
                                    String rate = Integer.toString(rating);
                                    Log.d(TAG, rate);
                                    comment();
                                    mTracker.send(new HitBuilders.EventBuilder() //sends rating to google analyics
                                            .setCategory("Event")
                                            .setLabel("Rating")
                                            .setAction(rate)
//                                            .setValue(rating)
                                            .build());
                                            Log.d(TAG, "analytics");


                                }
                            })
                    .show();



    }

    public void comment() {
        final EditText edittext = new EditText(this);
        new AlertDialog.Builder(this)

                .setTitle("Comments")
                .setView(edittext)

                .setPositiveButton("Enter", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String comment = edittext.getText().toString();
                        Log.d(TAG, comment);
                        mTracker.send(new HitBuilders.EventBuilder() // sends comment to google analytics
                                .setCategory("Event")
                                .setLabel("Comment")
                                .setAction(comment)
//                                .setValue(rating)
                                .build());
                                Log.d(TAG, "analytics");

                    }
                })

                .show();
    }
}
