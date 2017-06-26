package com.trevor.android.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.toLowerCase;
import static com.trevor.android.tracker.StringArrays.RowValuesStrings;
import static com.trevor.android.tracker.data.SQLContract.tableJA.SCALE_LEVEL_NULL;
import static com.trevor.android.tracker.data.SQLContract.tableJA.SCALE_LEVEL_ONE;

/**
 * Created by Trevor on 6/25/2017.
 */

public class EnterBooleanActivity extends AppCompatActivity {

    public static final String YES = "Yes";
    public static final String NO = "No";
    private TextView mButtonOne;
    private TextView mButtonTwo;
    private int mActivityTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentThatStartedThisActivity = getIntent();
        int pointers[] = intentThatStartedThisActivity.getIntArrayExtra("pointers");
        int mActivityTitle = pointers[0];
        setContentView(R.layout.activity_enter_booleans);

        setTitle("Any " + toLowerCase(StringArrays.getFieldNames()[mActivityTitle]) + " today?");

        mButtonOne = (TextView) findViewById(R.id.text_view_get_boolean_one);
        mButtonOne.setVisibility(View.VISIBLE);
        mButtonOne.setText(YES);

        mButtonTwo = (TextView) findViewById(R.id.text_view_get_boolean_two);
        mButtonTwo.setVisibility(View.VISIBLE);
        mButtonTwo.setText(NO);

    }

    public void boolean_activity_false(View view) {
        RowValuesStrings[mActivityTitle] = SCALE_LEVEL_NULL;
    }

    public void boolean_activity_true(View view) {
        RowValuesStrings[mActivityTitle] = SCALE_LEVEL_ONE;
    }
}