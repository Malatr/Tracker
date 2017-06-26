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

public class EnterBooleanActivity extends AppCompatActivity {

    private TextView mButtonOne;
    private TextView mButtonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentThatStartedThisActivity = getIntent();
        int pointers[] = intentThatStartedThisActivity.getIntArrayExtra("pointers");
        int activityTitle = pointers[0];
        setContentView(R.layout.activity_enter_booleans);

        setTitle("Any " + toLowerCase(SQLUtils.getFieldNames()[activityTitle]) + " today?");

        mButtonOne = (TextView) findViewById(R.id.text_view_get_boolean_one);
        mButtonOne.setVisibility(View.VISIBLE);
        mButtonOne.setText("Yes");

        mButtonTwo = (TextView) findViewById(R.id.text_view_get_boolean_two);
        mButtonTwo.setVisibility(View.VISIBLE);
        mButtonTwo.setText("No");

    }
}