package com.trevor.android.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Trevor on 6/25/2017.
 */

public class EnterTextActivity extends AppCompatActivity {

    private TextView mDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentThatStartedThisActivity = getIntent();
        int clickedItemIndex = intentThatStartedThisActivity.getIntExtra("intentOriginator", 0);

        setContentView(R.layout.activity_text_entry);

        setTitle("TextEntry");

        mDisplay = (TextView) findViewById(R.id.text_view_get_text);
        mDisplay.setVisibility(View.VISIBLE);
        mDisplay.setText("Enter text here.");


    }
}