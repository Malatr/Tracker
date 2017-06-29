package com.trevor.android.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.trevor.android.tracker.data.StringHelper;

import static android.icu.lang.UCharacter.toLowerCase;
import static com.trevor.android.tracker.data.StringHelper.RowValuesStrings;

/**
 * Created by Trevor on 6/25/2017.
 */

public class EnterTextActivity extends AppCompatActivity {

    private TextView mDisplayTextView;
    private TextView mDisplayButton;
    private int mActivityTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentThatStartedThisActivity = getIntent();
        int pointers[] = intentThatStartedThisActivity.getIntArrayExtra("pointers");
        mActivityTitle = pointers[0];
        setContentView(R.layout.activity_text_entry);

        setTitle("Choose date of " + toLowerCase(StringHelper.getGroupNames()[mActivityTitle]) + " below");

        mDisplayTextView = (TextView) findViewById(R.id.text_view_get_text);
        mDisplayTextView.setVisibility(View.VISIBLE);
        mDisplayTextView.setText("Enter text here.");

        mDisplayButton = (TextView) findViewById(R.id.button_get_text_done);
        mDisplayButton.setVisibility(View.VISIBLE);
        mDisplayButton.setText("Done");


    }

    private void insertColumnEntry() {
        RowValuesStrings[mActivityTitle] = findViewById(R.id.text_view_get_text).toString().trim();
    }
}