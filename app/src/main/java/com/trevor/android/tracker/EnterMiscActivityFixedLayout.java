package com.trevor.android.tracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.trevor.android.tracker.data.StringHelper;

/**
 * Created by Trevor on 6/25/2017.
 */

public class EnterMiscActivityFixedLayout extends AppCompatActivity {

    TextView workHoursLabelView;
    TextView focusLabelView;
    TextView spottingLabelView;

    EditText workHoursEntryView;
    EditText sleepTimeEntryView;
    RadioButton focusNo;
    RadioButton focusYes;

    TextView emotionLabelView;
    RadioButton emotionZero;
    RadioButton emotionOne;
    RadioButton emotionTwo;
    RadioButton emotionThree;
    RadioButton emotionFour;

    TextView energyLabelView;
    RadioButton energyZero;
    RadioButton energyOne;
    RadioButton energyTwo;
    RadioButton energyThree;
    RadioButton energyFour;

    Button nextButton;
    private String[] mLabels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set outer wrapper view xml for layout
        setContentView(R.layout.activity_misc_data);
        mLabels = StringHelper.getMiscLabels();
        setTitle(mLabels[0]);


        workHoursLabelView = (TextView) findViewById(R.id.text_view_work_hours_label);
        workHoursLabelView.setText(mLabels[1]);
        workHoursEntryView = (EditText) findViewById(R.id.edit_text_work_hours_label);
        workHoursEntryView.setHint("How many workHours today?");

        emotionLabelView = (TextView) findViewById(R.id.text_view_emotion_label);
        emotionLabelView.setText(mLabels[3]);
        emotionZero = (RadioButton) findViewById(R.id.emotion_zero);
        emotionOne = (RadioButton) findViewById(R.id.emotion_one);
        emotionTwo = (RadioButton) findViewById(R.id.emotion_two);
        emotionThree = (RadioButton) findViewById(R.id.emotion_three);
        emotionFour = (RadioButton) findViewById(R.id.emotion_four);
        emotionZero.setSelected(true);

        focusLabelView = (TextView) findViewById(R.id.text_view_focus_label);
        focusLabelView.setText(mLabels[4]);
        focusNo = (RadioButton) findViewById(R.id.focus_no);
        focusYes = (RadioButton) findViewById(R.id.focus_yes);
        emotionZero.setSelected(true);
        focusNo.setText("No");
        focusYes.setText("Yes");

        energyLabelView = (TextView) findViewById(R.id.text_view_energy_label);
        energyLabelView.setText(mLabels[5]);
        energyZero = (RadioButton) findViewById(R.id.energy_zero);
        energyOne = (RadioButton) findViewById(R.id.energy_one);
        energyTwo = (RadioButton) findViewById(R.id.energy_two);
        energyThree = (RadioButton) findViewById(R.id.energy_three);
        energyFour = (RadioButton) findViewById(R.id.energy_four);
        energyZero.setSelected(true);

        nextButton = (Button) findViewById(R.id.button_show_summary);
        nextButton.setText(R.string.next);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.focus_no:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.focus_yes:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.energy_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.energy_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.energy_two:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.energy_three:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.energy_four:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.emotion_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.emotion_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.emotion_two:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.emotion_three:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.emotion_four:
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
        Context context = EnterMiscActivityFixedLayout.this;

        // show a Toast with the label of the button and return true to tell Android that I've handled this menu click

        switch (item.getItemId()) {
            case R.id.bar_button:
                textToShow = getString(R.string.bar_button_text) + " Tapped";
                Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_delete_all_entries:
                textToShow = getString(R.string.delete_all_entries) + " Tapped";
                Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_insert_data:
                //textToShow = getString(R.string.insert_dummy_data) + " Tapped";
                //Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
        }
        //ElseIf we do NOT handle the menu click,
        // return super.onOptionsItemSelected to let Android handle the menu click
        return super.onOptionsItemSelected(item);
    }

    public void button_show_summary(View view) {
        /*
         * Storing the Context in a variable in this case is redundant since we could have
         * just used "this" or "EnterMenstrualActivity.this" in the method call below. However, we
         * wanted to demonstrate what parameter we were using "EnterMenstrualActivity.this" for as
         * clear as possible.
         */
        Context context = EnterMiscActivityFixedLayout.this;
        // pointer[0] = clickedItemIndex, pointer[1] = , pointer[2] = ,
        int pointers[] = {0, 0, 0};
        Class destinationActivity = MainActivity.class;

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


}