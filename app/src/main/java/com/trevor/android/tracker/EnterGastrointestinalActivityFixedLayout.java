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

/**
 * Created by Trevor on 6/25/2017.
 */

public class EnterGastrointestinalActivityFixedLayout extends AppCompatActivity {

    TextView diarrheaLabelView;
    RadioButton diarrheaZero;
    RadioButton diarrheaOne;
    RadioButton diarrheaTwo;
    RadioButton diarrheaThree;
    RadioButton diarrheaFour;

    TextView food_cravingsLabelView;
    RadioButton food_cravingsZero;
    RadioButton food_cravingsOne;
    RadioButton food_cravingsTwo;
    RadioButton food_cravingsThree;
    RadioButton food_cravingsFour;

    TextView unreasonable_hungerLabelView;
    RadioButton unreasonable_hungerZero;
    RadioButton unreasonable_hungerOne;
    RadioButton unreasonable_hungerTwo;
    RadioButton unreasonable_hungerThree;
    RadioButton unreasonable_hungerFour;

    //Button periodStartEntryView;
    Button nextButton;
    private String[] mLabels;
    private String[] mRowValuesSrtings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set outer wrapper view xml for layout
        setContentView(R.layout.activity_gastrointestinal_data);
        mLabels = StringHelper.getGastrointestinalLabels();
        mRowValuesSrtings = StringHelper.rowValuesStrings;
        setTitle(mLabels[0]);

        diarrheaLabelView = (TextView) findViewById(R.id.text_view_diarrhea_label);
        diarrheaLabelView.setText(mLabels[1]);
        diarrheaZero = (RadioButton) findViewById(R.id.diarrhea_zero);
        diarrheaZero.setSelected(true);
        diarrheaZero.setText("0");
        diarrheaOne = (RadioButton) findViewById(R.id.diarrhea_one);
        diarrheaOne.setText("1");
        diarrheaTwo = (RadioButton) findViewById(R.id.diarrhea_two);
        diarrheaTwo.setText("2");
        diarrheaThree = (RadioButton) findViewById(R.id.diarrhea_three);
        diarrheaThree.setText("3");
        diarrheaFour = (RadioButton) findViewById(R.id.diarrhea_four);
        diarrheaFour.setText("4");

        food_cravingsLabelView = (TextView) findViewById(R.id.text_view_food_cravings_label);
        food_cravingsLabelView.setText(mLabels[2]);
        food_cravingsZero = (RadioButton) findViewById(R.id.food_cravings_zero);
        food_cravingsZero.setSelected(true);
        food_cravingsZero.setText("0");
        food_cravingsOne = (RadioButton) findViewById(R.id.food_cravings_one);
        food_cravingsOne.setText("1");
        food_cravingsTwo = (RadioButton) findViewById(R.id.food_cravings_two);
        food_cravingsTwo.setText("2");
        food_cravingsThree = (RadioButton) findViewById(R.id.food_cravings_three);
        food_cravingsThree.setText("3");
        food_cravingsFour = (RadioButton) findViewById(R.id.food_cravings_four);
        food_cravingsFour.setText("4");

        unreasonable_hungerLabelView = (TextView) findViewById(R.id.text_view_unreasonable_hunger_label);
        unreasonable_hungerLabelView.setText(mLabels[3]);
        unreasonable_hungerZero = (RadioButton) findViewById(R.id.unreasonable_hunger_zero);
        unreasonable_hungerZero.setSelected(true);
        unreasonable_hungerZero.setText("No");
        unreasonable_hungerOne = (RadioButton) findViewById(R.id.unreasonable_hunger_one);
        unreasonable_hungerOne.setText("Yes");

        nextButton = (Button) findViewById(R.id.button_gastrointestinal_next);
        nextButton.setText(R.string.next);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.diarrhea_zero:
                if (checked) mRowValuesSrtings[9] = "0";
                    break;
            case R.id.diarrhea_one:
                if (checked)
                    if (checked) mRowValuesSrtings[9] = "1";
                    break;
            case R.id.diarrhea_two:
                if (checked)
                    if (checked) mRowValuesSrtings[9] = "2";
                    break;
            case R.id.diarrhea_three:
                if (checked)
                    if (checked) mRowValuesSrtings[9] = "3";
                    break;
            case R.id.diarrhea_four:
                if (checked)
                    if (checked) mRowValuesSrtings[9] = "4";
                    break;
            case R.id.food_cravings_zero:
                if (checked)
                    if (checked) mRowValuesSrtings[10] = "0";
                    break;
            case R.id.food_cravings_one:
                if (checked)
                    if (checked) mRowValuesSrtings[10] = "1";
                    break;
            case R.id.food_cravings_two:
                if (checked)
                    if (checked) mRowValuesSrtings[10] = "2";
                    break;
            case R.id.food_cravings_three:
                if (checked)
                    if (checked) mRowValuesSrtings[10] = "3";
                    break;
            case R.id.food_cravings_four:
                if (checked)
                    if (checked) mRowValuesSrtings[10] = "4";
                    break;
            case R.id.unreasonable_hunger_zero:
                if (checked)
                    if (checked) mRowValuesSrtings[11] = "0";
                    break;
            case R.id.unreasonable_hunger_one:
                if (checked)
                    if (checked) mRowValuesSrtings[11] = "1";
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
        Context context = EnterGastrointestinalActivityFixedLayout.this;

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

    public void button_gastrointestinal_next(View view) {
        /*
         * Storing the Context in a variable in this case is redundant since we could have
         * just used "this" or "EnterMenstrualActivity.this" in the method call below. However, we
         * wanted to demonstrate what parameter we were using "EnterMenstrualActivity.this" for as
         * clear as possible.
         */
        Context context = EnterGastrointestinalActivityFixedLayout.this;
        // pointer[0] = clickedItemIndex, pointer[1] = , pointer[2] = ,
        int pointers[] = {0, 0, 0};
        Class destinationActivity = EnterSexualActivityFixedLayout.class;

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