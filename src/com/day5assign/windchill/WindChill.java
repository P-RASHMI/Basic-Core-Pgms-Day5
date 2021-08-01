package com.day5assign.windchill;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a temperature between -58F and 
		// 41F and a wind speed greater than or equal to 2.
		System.out.print("Enter the temperature in Fahrenheit less than 50 ");
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed in miles per hour between 3 to 120: ");
		double speed = input.nextDouble();

		// Compute the wind chill index
		double windChill = 35.74 + 0.6215 * temperature -35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

		// Display result
		if (temperature > 50 || speed > 120 || speed < 3)
		{
			System.out.println("given input is not valid");
		}
		else {
		System.out.println("The wind chill index is " + windChill);
		}
	input.close();	
	}
	

}
