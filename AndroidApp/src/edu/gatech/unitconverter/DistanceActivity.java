package edu.gatech.unitconverter;

public class DistanceActivity {

			/* writing code for converting miles to Kilometers, which will be 
			implemented in case for radio0*/
			public static String milesToKm(double miles)
			{
				double km = miles * 1.609;
				return String.valueOf(km);
			}
			
			/* writing code for converting kilometers to mile, which will be 
			implemented in case for radio1 */
			public static String kmToMiles(double km)
			{
				double miles = km/1.609;
				return String.valueOf(miles);
			}
		}

