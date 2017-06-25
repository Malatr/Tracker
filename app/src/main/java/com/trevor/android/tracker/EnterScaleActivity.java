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

public class EnterScaleActivity extends AppCompatActivity {

    private TextView mDisplayCurrent;
    private TextView mButtonOne;
    private TextView mButtonTwo;
    private TextView mButtonThree;
    private TextView mButtonFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentThatStartedThisActivity = getIntent();
        int pointers[] = intentThatStartedThisActivity.getIntArrayExtra("pointers");
        int activityTitle = pointers[0];
        int numberOfButtons = pointers[1];
        setContentView(R.layout.activity_scale_entry);

        // TODO SQL Query for data

        setTitle("Intensity of " + toLowerCase(SQLUtils.getFieldNames()[activityTitle]) + " today?");

        mDisplayCurrent = (TextView) findViewById(R.id.text_view_get_scale_zero);
        mDisplayCurrent.setVisibility(View.VISIBLE);
        mDisplayCurrent.setText("0");

        mButtonOne = (TextView) findViewById(R.id.text_view_get_scale_one);
        mButtonOne.setVisibility(View.VISIBLE);
        mButtonOne.setText("1");

        mButtonTwo = (TextView) findViewById(R.id.text_view_get_scale_two);
        mButtonTwo.setVisibility(View.VISIBLE);
        mButtonTwo.setText("2");

        if (numberOfButtons > 2) {
            mButtonThree = (TextView) findViewById(R.id.text_view_get_scale_three);
            mButtonThree.setVisibility(View.VISIBLE);
            mButtonThree.setText("3");

            if (numberOfButtons > 3) {
                mButtonFour = (TextView) findViewById(R.id.text_view_get_scale_four);
                mButtonFour.setVisibility(View.VISIBLE);
                mButtonFour.setText("4");
            }
        }
    }
}