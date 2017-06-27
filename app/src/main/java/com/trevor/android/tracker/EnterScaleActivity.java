package com.trevor.android.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.trevor.android.tracker.data.StringArrays;

import static android.icu.lang.UCharacter.toLowerCase;
import static com.trevor.android.tracker.data.SQLContract.tableJA.SCALE_LEVEL_FOUR;
import static com.trevor.android.tracker.data.SQLContract.tableJA.SCALE_LEVEL_NULL;
import static com.trevor.android.tracker.data.SQLContract.tableJA.SCALE_LEVEL_ONE;
import static com.trevor.android.tracker.data.SQLContract.tableJA.SCALE_LEVEL_THREE;
import static com.trevor.android.tracker.data.SQLContract.tableJA.SCALE_LEVEL_TWO;
import static com.trevor.android.tracker.data.StringArrays.RowValuesStrings;

/**
 * Created by Trevor on 6/25/2017.
 */

public class EnterScaleActivity extends AppCompatActivity {

    private TextView mDisplayCurrent;
    private TextView mButtonOne;
    private TextView mButtonTwo;
    private TextView mButtonThree;
    private TextView mButtonFour;
    private int mActivityTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentThatStartedThisActivity = getIntent();
        int pointers[] = intentThatStartedThisActivity.getIntArrayExtra("pointers");
        int mActivityTitle = pointers[0];
        setContentView(R.layout.activity_scale_entry);

        RowValuesStrings[mActivityTitle] = SCALE_LEVEL_NULL;


        setTitle("Intensity of " + toLowerCase(StringArrays.getFieldNames()[mActivityTitle]) + " today?");

        mDisplayCurrent = (TextView) findViewById(R.id.text_view_get_scale_zero);
        mDisplayCurrent.setVisibility(View.VISIBLE);
        mDisplayCurrent.setText(SCALE_LEVEL_NULL);

        mButtonOne = (TextView) findViewById(R.id.text_view_get_scale_one);
        mButtonOne.setVisibility(View.VISIBLE);
        mButtonOne.setText(SCALE_LEVEL_ONE);

        mButtonTwo = (TextView) findViewById(R.id.text_view_get_scale_two);
        mButtonTwo.setVisibility(View.VISIBLE);
        mButtonTwo.setText(SCALE_LEVEL_TWO);

        mButtonThree = (TextView) findViewById(R.id.text_view_get_scale_three);
        mButtonThree.setVisibility(View.VISIBLE);
        mButtonThree.setText(SCALE_LEVEL_THREE);

        mButtonFour = (TextView) findViewById(R.id.text_view_get_scale_four);
        mButtonFour.setVisibility(View.VISIBLE);
        mButtonFour.setText(SCALE_LEVEL_FOUR);

    }

    public void scaleLevelOne(View view) {
        RowValuesStrings[mActivityTitle] = SCALE_LEVEL_ONE;
    }

    public void scaleLevelTwo(View view) {
        RowValuesStrings[mActivityTitle] = SCALE_LEVEL_TWO;
    }

    public void scaleLevelThree(View view) {
        RowValuesStrings[mActivityTitle] = SCALE_LEVEL_THREE;
    }

    public void scaleLevelFour(View view) {
        RowValuesStrings[mActivityTitle] = SCALE_LEVEL_FOUR;
    }

}