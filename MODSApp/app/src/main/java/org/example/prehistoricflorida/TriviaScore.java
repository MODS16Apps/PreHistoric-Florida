package org.example.prehistoricflorida;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jacob on 7/19/16.
 */
public class TriviaScore extends Activity {

    private static final String TAG = "PrehistoricFlorida";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getIntent().getExtras();
        int points = 0; // or other values
        if(b != null)
            points = b.getInt("key");
        setContentView(R.layout.trivia_score);

///        String point = Integer.toString(points);
        TextView final_score = (TextView) findViewById(R.id.score);
        final_score.setText(String.valueOf(points+"/10 correct"));
    }
}
