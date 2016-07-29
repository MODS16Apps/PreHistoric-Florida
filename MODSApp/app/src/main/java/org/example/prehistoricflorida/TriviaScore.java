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

public class TriviaScore extends Activity implements OnClickListener {

    private static final String TAG = "PrehistoricFlorida";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getIntent().getExtras();
        int points = 0;
        if (b != null) // checks to see if bundle is empty
            points = b.getInt("key"); // assignes bundle key value to points variable
        setContentView(R.layout.trivia_score);

///        String point = Integer.toString(points);
        TextView final_score = (TextView) findViewById(R.id.score); // initializes text view
        final_score.setText(String.valueOf(points + "/10 correct")); // sets string to text view

        View nextButton = findViewById(R.id.home_button);
        nextButton.setOnClickListener(this);


    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_button:
                Intent i = new Intent(this, PrehistoricFlorida.class);
                startActivity(i);
                break;
        }

    }
}