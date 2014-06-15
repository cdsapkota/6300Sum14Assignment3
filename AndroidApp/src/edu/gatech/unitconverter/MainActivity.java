package edu.gatech.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// We use the handleClick to switch between different conversions
	public void handleClick(View view)
	{
		// Checking the status of the button if it's checked or not
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText txt = (EditText) findViewById(R.id.text1);
		
		/* We are reading the value that was entered in the text box
		 Also the text entered in the text box and converting to string
		 using the toString and then using parseDouble to convert into a double */
		double value = Double.parseDouble(txt.getText().toString());
		
		// Now we need to figure out which radio button was actually clicked
		switch (view.getId()){
		
		/*Matching the ID we use the class R and use the id of radio0, 
		which is miles in this case.*/
		case R.id.radio0:
		if(checked)
			/* If the radio0 i.e the miles is clicked then we are converting the value
			that was in text box to miles, using kmToMiles which is being called 
			from class DistanceActivity */
			txt.setText(DistanceActivity.kmToMiles(value));
		break;
		
		/*If it's the radio1 button clicked i.e. Kilometers, then we call the Distance 
		activity class to convert miles to kilometer*/
		case R.id.radio1:
			if(checked)
				txt.setText(DistanceActivity.milesToKm(value));
		break;
		
		//Checking the third button
		case R.id.radio2:
		if(checked)
			txt.setText(TemperatureActivity.farenToCelc(value));
		break;
		
		//Checking the fourth button
		case R.id.radio3:
		if(checked)
			txt.setText(TemperatureActivity.celcToFaren(value));
		break;
		
		//Checking the fifth button
		case R.id.radio4:
		if(checked)
			txt.setText(WeightActivity.kgToPounds(value));
		break;
		
		//Checking the sixth button
		case R.id.radio5:
		if(checked)
			txt.setText(WeightActivity.poundsToKg(value));
		break;
			
			}
		}
	}

