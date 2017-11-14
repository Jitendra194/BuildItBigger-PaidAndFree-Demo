package com.example.android.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    private TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        String joke = getIntent().getExtras().getString("joke");

        mJokeTextView = (TextView) findViewById(R.id.joke_text_view);
        mJokeTextView.setText(joke);
    }
}
