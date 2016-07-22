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

public class PrehistoricFlorida extends Activity implements OnClickListener {
    private static final String TAG = "PrehistoricFlorida";

    /**
     * Called when the activity is first created.
     */
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
    }

    // ...

    public void onClick(View v) {
        switch (v.getId()) {
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
        }
    }

}