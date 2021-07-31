package com.day5assign.leapyear;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args){
	      int year;
	      System.out.println("Enter an Year :: ");
	      Scanner SC = new Scanner(System.in);
	      year = SC.nextInt();
          if (year >999 &&  year <10000)
          {
	      if (((year % 4 == 0) && (year % 100 != 0)) || (year %  400 == 0))
	      {
	         System.out.println( year + " is a leap year");
	      }
	      else
	      {
	    	  System.out.println( year + " is not a leap year");
	      }
	      }
	      else
	      {
	    	  System.out.println("not a year ");
	      }
	 SC.close();  
	}
}
