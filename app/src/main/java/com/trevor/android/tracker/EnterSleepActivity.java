package com.trevor.android.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Trevor on 6/25/2017.
 */

public class EnterSleepActivity extends AppCompatActivity {

    private int mActivityTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentThatStartedThisActivity = getIntent();
        int pointers[] = intentThatStartedThisActivity.getIntArrayExtra("pointers");
        int mActivityTitle = pointers[0];
        setContentView(R.layout.activity_main);

        setTitle("Sleep Data Page");
    }

}