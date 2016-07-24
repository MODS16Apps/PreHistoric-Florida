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

import java.util.concurrent.TimeUnit;

public class ScavengerHuntStart extends Activity implements OnClickListener {
    private static final String TAG = "PrehistoricFlorida";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scavengerhuntstart);

        View eButton = findViewById(R.id.start_button);
        eButton.setOnClickListener(this);
        View hButton = findViewById(R.id.home_button);
        hButton.setOnClickListener(this);
    }

    public void onClick(View v) {

        switch (v.getId()){
                case R.id.start_button:
                    Intent j = new Intent(this, ScavengerHunt.class);
                    startActivity(j);
                    break;
                case R.id.home_button:
                    Intent i = new Intent(this, PrehistoricFlorida.class);
                    startActivity(i);
                    break;
            }
    }
}
