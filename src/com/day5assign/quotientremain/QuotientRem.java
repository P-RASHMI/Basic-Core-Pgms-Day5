package com.day5assign.quotientremain;

import java.util.Scanner;

public class QuotientRem {
	public static Scanner SC = new Scanner(System.in);
     public static void main(String[] args) {
		int dividend,divisor;
		System.out.println("enter dividend");
		dividend = SC.nextInt();
		System.out.println("enter divisor");
	    divisor = SC.nextInt();
	    System.out.println("Quotient is " +dividend/divisor);
	    System.out.println("Remainder is " +dividend%divisor);
     }
}
