package com.trevor.android.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.toLowerCase;

/**
 * Created by Trevor on 6/25/2017.
 */

public class EnterDateActivity extends AppCompatActivity {


    private TextView mDisplayTextView;
    private TextView mDisplayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentThatStartedThisActivity = getIntent();
        int pointers[] = intentThatStartedThisActivity.getIntArrayExtra("pointers");
        int activityTitle = pointers[0];
        setContentView(R.layout.activity_text_entry);

        setTitle("Choose date of " + toLowerCase(SQLUtils.getFieldNames()[activityTitle]) + " below");

        mDisplayTextView = (TextView) findViewById(R.id.text_view_get_date);
        mDisplayTextView.setVisibility(View.VISIBLE);
        mDisplayTextView.setText("Enter text here.");

        mDisplayButton = (TextView) findViewById(R.id.button_get_date_done);
        mDisplayButton.setVisibility(View.VISIBLE);
        mDisplayButton.setText("Done");


    }
}