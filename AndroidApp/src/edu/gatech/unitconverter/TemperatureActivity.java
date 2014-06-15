package edu.gatech.unitconverter;

public class TemperatureActivity {

		/* writing code for converting celcius to farenheit, which will be 
		implemented in case for radio2*/
		public static String celcToFaren(double celc)
		{
			double faren = (1.8*celc) + 32;
			return String.valueOf(faren);
		}
		
		/* writing code for converting Farenheit to Celcius, which will be 
		implemented in case for radio3*/
		public static String farenToCelc(double faren)
		{
			double celc = (faren-32)*0.556;
			return String.valueOf(celc);
		}
	}
