package com.trevor.android.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DataEntryChooserActivity extends AppCompatActivity {

    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentThatStartedThisActivity = getIntent();
        int clickedItemIndex = intentThatStartedThisActivity.getIntExtra("clickedItemIndex", 0);

        if (intentThatStartedThisActivity.hasExtra("clickedItemIndex")) {

        }
    }

}
