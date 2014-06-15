package edu.gatech.unitconverter;

public class WeightActivity {

		/* writing code for converting Pounds to Kilograms, which will be 
		implemented in case for radio4*/
		public static String poundsToKg(double pounds)
		{
			double kg = pounds * 0.4536;
			return String.valueOf(kg);
		}
		
		/* writing code for converting Kilograms to Pounds, which will be 
		implemented in case for radio5*/
		public static String kgToPounds(double kg)
		{
			double pounds = kg / 0.4536;
			return String.valueOf(pounds);
		}
	}