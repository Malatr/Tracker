package com.trevor.android.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class DataEntryActivity extends AppCompatActivity {

    private TextView mDisplayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intentThatStartedThisActivity = getIntent();
        int clickedItemIndex = intentThatStartedThisActivity.getIntExtra("clickedItemIndex", 0);
        String buttonText = "Odd";
        String textText = "Even";

        if (intentThatStartedThisActivity.hasExtra("clickedItemIndex")) {

        }
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
         
            String textEntered = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);

            if ((clickedItemIndex & 1) == 0) {
                setContentView(R.layout.activity_text_entry);
                mDisplayText = (TextView) findViewById(R.id.text_view_get_text);
                mDisplayText.setVisibility(View.VISIBLE);
                mDisplayText.setText(textText);
            } else {
                setContentView(R.layout.activity_boolean_entry);
                mDisplayText = (TextView) findViewById(R.id.text_view_get_boolean_yes);
                mDisplayText.setVisibility(View.VISIBLE);
                mDisplayText.setText(buttonText);

            }
        }
    }
}
