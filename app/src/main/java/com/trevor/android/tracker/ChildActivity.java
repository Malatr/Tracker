package com.trevor.android.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private TextView mDisplayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        /* Typical usage of findViewById... */
        mDisplayText = (TextView) findViewById(R.id.text_view_child_display);

        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
         
            String textEntered = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);

            mDisplayText.setText(textEntered);
        }
    }
}
