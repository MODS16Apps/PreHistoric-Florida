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

public class Games extends Activity implements OnClickListener {
    private static final String TAG = "PrehistoricFlorida";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games_menu);
        // Set up click listeners for all the buttons
        View continueButton = findViewById(R.id.trivia_button);
        continueButton.setOnClickListener(this);
        View newButton = findViewById(R.id.scavenger_hunt_button);
        newButton.setOnClickListener(this);
    }

    // ...

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.trivia_button:
                Intent i = new Intent(this, Trivia.class);
//                Bundle b = new Bundle();
//                b.putInt("key", 1);
//                i.putExtras(b);
                startActivity(i);
                break;
            case R.id.scavenger_hunt_button:
                Intent j = new Intent(this, ScavengerHuntStart.class);
                startActivity(j);
                break;
        }
    }
}