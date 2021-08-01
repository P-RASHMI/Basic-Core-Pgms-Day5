package com.day5assign.evenodd;

import java.util.Scanner;

public class EvenOdd {
	
    public static void main(String[] args) {
    	 Scanner SC = new Scanner(System.in);
        System.out.print("Enter Number to check Even or Odd : ");
        int Input = SC.nextInt();
        if (Input % 2 == 0) {
            System.out.println(Input + " is Even Number");
        } else {
            System.out.println(Input + " is Odd Number");
        }
    SC.close();
    }

}
