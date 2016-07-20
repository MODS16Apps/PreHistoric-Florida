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

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evolution);

        View nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(this);
        View homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next_button:
                break;
            case R.id.home_button:
                Intent i = new Intent(this, PrehistoricFlorida.class);
                startActivity(i);
                break;
        }
    }
}