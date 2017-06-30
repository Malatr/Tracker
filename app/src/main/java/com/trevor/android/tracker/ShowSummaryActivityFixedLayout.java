package com.trevor.android.tracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.trevor.android.tracker.data.StringHelper;
import com.trevor.android.tracker.data.dbHelper;

/**
 * Created by Trevor on 6/25/2017.
 */

public class ShowSummaryActivityFixedLayout extends AppCompatActivity {

    Button doneButton;
    private TextView dateLabel;
    private Button dateResult;
    private TextView periodStartLabel;
    private Button periodStartResult;
    private TextView periodEndLabel;
    private Button periodEndResult;
    private TextView crampsLabel;
    private TextView spottingLabel;
    private Button spottingResult;
    private Button crampsResult;
    private TextView headacheLabel;
    private Button headacheResult;
    private TextView shoulderPainLabel;
    private Button shoulderPainResult;
    private TextView soreThroatLabel;
    private Button soreThroatResult;
    private TextView diarrheaLabel;
    private Button diarrheaResult;
    private TextView foodCravingsLabel;
    private Button foodCravingsResult;
    private TextView unreasonableHungerLabel;
    private Button unreasonableHungerResult;
    private TextView sexPIVLabel;
    private Button sexPIVResult;
    private TextView sexPIALabel;
    private Button sexPIAResult;
    private TextView sexOralLabel;
    private Button sexOralResult;
    private TextView highSexDriveLabel;
    private Button highSexDriveResult;
    private TextView herpesOutbreakLabel;
    private Button herpesOutbreakResult;
    private TextView stepsLabel;
    private Button stepsResult;
    private TextView sleepLabel;
    private Button sleepResult;
    private TextView insomniaLabel;
    private Button insomniaResult;
    private TextView nightmaresLabel;
    private Button nightmaresResult;
    private TextView nightCallsLabel;
    private Button nightCallsResult;
    private TextView workHoursLabel;
    private Button workHoursResult;
    private TextView emotionLabel;
    private Button emotionResult;
    private TextView focusLabel;
    private Button focusResult;
    private TextView energyLabel;
    private Button energyResult;
    private String[] mLabels;
    private String[] mMenstruationLabels;
    private String[] mPainLabels;
    private String[] mGastrointestinalLabels;
    private String[] mSexualLabels;
    private String[] mSleepLabels;
    private String[] mMiscLabels;
    private String[] mRowValuesStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set outer wrapper view xml for layout
        setContentView(R.layout.activity_show_summary);
        setTitle("Summary");
        mMenstruationLabels = StringHelper.getMenstruationLabels();
        mPainLabels = StringHelper.getPainLabels();
        mGastrointestinalLabels = StringHelper.getGastrointestinalLabels();
        mSexualLabels = StringHelper.getSexualLabels();
        mSleepLabels = StringHelper.getSleepLabels();
        mMiscLabels = StringHelper.getMiscLabels();
        mRowValuesStrings = StringHelper.rowValuesStrings;

        dateLabel = (TextView) findViewById(R.id.text_view_get_date_label);
        dateLabel.setText(mMenstruationLabels[1]);
        dateResult = (Button) findViewById(R.id.button_get_date_done_result);
        dateResult.setText(mRowValuesStrings[1]);
        periodStartLabel = (TextView) findViewById(R.id.text_view_period_start_label);
        periodStartLabel.setText(mMenstruationLabels[2]);
        periodStartResult = (Button) findViewById(R.id.button_period_start_result);
        periodStartResult.setText(mRowValuesStrings[2]);
        periodEndLabel = (TextView) findViewById(R.id.text_view_period_end_label);
        periodEndLabel.setText(mMenstruationLabels[2]);
        periodEndResult = (Button) findViewById(R.id.button_period_end_result);
        periodEndResult.setText(mRowValuesStrings[3]);
        spottingLabel = (TextView) findViewById(R.id.text_view_spotting_label);
        spottingLabel.setText(mMenstruationLabels[3]);
        spottingResult = (Button) findViewById(R.id.button_spotting_result);
        spottingResult.setText(mRowValuesStrings[4]);
        crampsLabel = (TextView) findViewById(R.id.text_view_cramps_label);
        crampsLabel.setText(mMenstruationLabels[4]);
        crampsResult = (Button) findViewById(R.id.button_cramps_result);
        crampsResult.setText(mRowValuesStrings[5]);

        headacheLabel = (TextView) findViewById(R.id.text_view_headache_label);
        headacheLabel.setText(mPainLabels[1]);
        headacheResult = (Button) findViewById(R.id.button_headache_result);
        headacheResult.setText(mRowValuesStrings[6]);
        shoulderPainLabel = (TextView) findViewById(R.id.text_view_shoulder_pain_label);
        shoulderPainLabel.setText(mPainLabels[2]);
        shoulderPainResult = (Button) findViewById(R.id.button_shoulder_pain_result);
        shoulderPainResult.setText(mRowValuesStrings[7]);
        soreThroatLabel = (TextView) findViewById(R.id.text_view_sore_throat_label);
        soreThroatLabel.setText(mPainLabels[3]);
        soreThroatResult = (Button) findViewById(R.id.button_sore_throat_result);
        soreThroatResult.setText(mRowValuesStrings[8]);

        diarrheaLabel = (TextView) findViewById(R.id.text_view_diarrhea_label);
        diarrheaLabel.setText(mGastrointestinalLabels[1]);
        diarrheaResult = (Button) findViewById(R.id.button_diarrhea_result);
        diarrheaResult.setText(mRowValuesStrings[9]);
        foodCravingsLabel = (TextView) findViewById(R.id.text_view_food_cravings_label);
        foodCravingsLabel.setText(mGastrointestinalLabels[2]);
        foodCravingsResult = (Button) findViewById(R.id.button_food_cravings_result);
        foodCravingsResult.setText(mRowValuesStrings[10]);
        unreasonableHungerLabel = (TextView) findViewById(R.id.text_view_unreasonable_hunger_label);
        unreasonableHungerLabel.setText(mGastrointestinalLabels[3]);
        unreasonableHungerResult = (Button) findViewById(R.id.button_unreasonable_hunger_result);
        unreasonableHungerResult.setText(mRowValuesStrings[11]);

        sexPIVLabel = (TextView) findViewById(R.id.text_view_sex_piv_label);
        sexPIVLabel.setText(mSexualLabels[1]);
        sexPIVResult = (Button) findViewById(R.id.button_sex_piv_result);
        sexPIVResult.setText(mRowValuesStrings[12]);
        sexPIALabel = (TextView) findViewById(R.id.text_view_sex_pia_label);
        sexPIALabel.setText(mSexualLabels[2]);
        sexPIAResult = (Button) findViewById(R.id.button_sex_pia_result);
        sexPIAResult.setText(mRowValuesStrings[13]);
        sexOralLabel = (TextView) findViewById(R.id.text_view_sex_oral_label);
        sexOralLabel.setText(mSexualLabels[3]);
        sexOralResult = (Button) findViewById(R.id.button_sex_oral_result);
        sexOralResult.setText(mRowValuesStrings[14]);
        highSexDriveLabel = (TextView) findViewById(R.id.text_view_high_sex_drive_label);
        highSexDriveLabel.setText(mSexualLabels[4]);
        highSexDriveResult = (Button) findViewById(R.id.button_high_sex_drive_result);
        highSexDriveResult.setText(mRowValuesStrings[15]);
        herpesOutbreakLabel = (TextView) findViewById(R.id.text_view_herpes_outbreak_label);
        herpesOutbreakLabel.setText(mSexualLabels[5]);
        herpesOutbreakResult = (Button) findViewById(R.id.button_herpes_outbreak_result);
        herpesOutbreakResult.setText(mRowValuesStrings[16]);

        stepsLabel = (TextView) findViewById(R.id.text_view_steps_label);
        stepsLabel.setText(mSleepLabels[1]);
        stepsResult = (Button) findViewById(R.id.button_steps_result);
        stepsResult.setText(mRowValuesStrings[17]);
        sleepLabel = (TextView) findViewById(R.id.text_view_sleep_label);
        sleepLabel.setText(mSleepLabels[2]);
        sleepResult = (Button) findViewById(R.id.button_sleep_result);
        sleepResult.setText(mRowValuesStrings[18]);
        insomniaLabel = (TextView) findViewById(R.id.text_view_insomnia_label);
        insomniaLabel.setText(mSleepLabels[4]);
        insomniaResult = (Button) findViewById(R.id.button_insomnia_result);
        insomniaResult.setText(mRowValuesStrings[19]);
        nightmaresLabel = (TextView) findViewById(R.id.text_view_nightmares_label);
        nightmaresLabel.setText(mSleepLabels[5]);
        nightmaresResult = (Button) findViewById(R.id.button_nightmares_result);
        nightmaresResult.setText(mRowValuesStrings[20]);
        nightCallsLabel = (TextView) findViewById(R.id.text_view_night_calls_label);
        nightCallsLabel.setText(mSleepLabels[6]);
        nightCallsResult = (Button) findViewById(R.id.button_night_calls_result);
        nightCallsResult.setText(mRowValuesStrings[21]);

        workHoursLabel = (TextView) findViewById(R.id.text_view_work_hours_label);
        workHoursLabel.setText(mMiscLabels[1]);
        workHoursResult = (Button) findViewById(R.id.button_work_hours_result);
        workHoursResult.setText(mRowValuesStrings[22]);
        emotionLabel = (TextView) findViewById(R.id.text_view_emotion_label);
        emotionLabel.setText(mMiscLabels[3]);
        emotionResult = (Button) findViewById(R.id.button_emotion_result);
        emotionResult.setText(mRowValuesStrings[24]);
        focusLabel = (TextView) findViewById(R.id.text_view_focus_label);
        focusLabel.setText(mMiscLabels[4]);
        focusResult = (Button) findViewById(R.id.button_focus_result);
        focusResult.setText(mRowValuesStrings[25]);
        energyLabel = (TextView) findViewById(R.id.text_view_energy_label);
        energyLabel.setText(mMiscLabels[5]);
        energyResult = (Button) findViewById(R.id.button_energy_result);
        energyResult.setText(mRowValuesStrings[26]);


        doneButton = (Button) findViewById(R.id.button_save_to_database);
        doneButton.setText(R.string.save_to_db_label);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.nightmares_no:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.nightmares_yes:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.night_calls_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.night_calls_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.night_calls_two:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.night_calls_three:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.night_calls_four:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.insomnia_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.insomnia_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.insomnia_two:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.insomnia_three:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.insomnia_four:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;

        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        //savedInstanceState.putInt(STATE_SCORE, mCurrentScore);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Within onCreateOptionsMenu, use getMenuInflater().inflate to inflate the menu
        getMenuInflater().inflate(R.menu.overflow, menu);
        //Return true to display menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Get the ID of the item that was selected and store it in itemThatWasClicked
        int itemThatWasClicked = item.getItemId();
        String textToShow;
        Context context = ShowSummaryActivityFixedLayout.this;

        // show a Toast with the label of the button and return true to tell Android that I've handled this menu click

        switch (item.getItemId()) {
            case R.id.bar_button:
                textToShow = getString(R.string.bar_button_text) + " Tapped";
                Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_retrieve_entries:
                textToShow = getString(R.string.delete_all_entries) + " Tapped";
                Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_retrieve_data:
                //textToShow = getString(R.string.insert_dummy_data) + " Tapped";
                //Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
        }
        //ElseIf we do NOT handle the menu click,
        // return super.onOptionsItemSelected to let Android handle the menu click
        return super.onOptionsItemSelected(item);
    }

    public void button_date_edit(View view) {
        Class destinationActivity = MainActivity.class;
        editClass(destinationActivity);

    }

    public void button_menstruation_edit(View view) {
        Class destinationActivity = EnterMenstrualActivityFixedLayout.class;
        editClass(destinationActivity);

    }

    public void button_pain_edit(View view) {
    }

    public void button_gastrointestinal_edit(View view) {
    }

    public void button_sexual_edit(View view) {
    }

    public void button_sleep_edit(View view) {
        Class destinationActivity = EnterSleepActivityFixedLayout.class;
        editClass(destinationActivity);
    }

    public void button_misc_edit(View view) {
    }

    public void editClass(Class destinationActivity) {
        /*
         * Storing the Context in a variable in this case is redundant since we could have
         * just used "this" or "EnterMenstrualActivity.this" in the method call below. However, we
         * wanted to demonstrate what parameter we were using "EnterMenstrualActivity.this" for as
         * clear as possible.
         */
        Context context = ShowSummaryActivityFixedLayout.this;
        // pointer[0] = clickedItemIndex, pointer[1] = , pointer[2] = ,
        int pointers[] = {0, 0, 0};
        //Class destinationActivity = EnterMiscActivityFixedLayout.class;

        /*
         * Here, we create the Intent that will start the Activity we specified above in
         * the destinationActivity variable. The constructor for an Intent also requires a
         * context, which we stored in the variable named "context".
         */
        Intent startChildActivityIntent = new Intent(context, destinationActivity);

         /*
         * We use the putExtra method of the Intent class to pass some extra stuff to the
         * Activity that we are starting. Generally, this data is quite simple, such as
         * a String or a number. However, there are ways to pass more complex objects.
         */

        //startChildActivityIntent.putExtra(Intent.EXTRA_TEXT, textEntered);
        startChildActivityIntent.putExtra("pointers", pointers);


         /*
         * Once the Intent has been created, we can use Activity's method, "startActivity"
         * to start the DataEntryChooserActivity.
         */
        startActivity(startChildActivityIntent);
    }

    public void saveToDb(View view) {
        dbHelper.insertRow();
    }
}