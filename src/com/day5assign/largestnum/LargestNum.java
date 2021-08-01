package com.day5assign.largestnum;

import java.util.Scanner;

public class LargestNum {
	 public static final Scanner scanner = new Scanner(System.in);
	    public static int first,second,third;
	    public static void main(String[] args) {
	        System.out.print("Enter first number : ");
	        first=scanner.nextInt();
	        System.out.print("Enter second number : ");
	        second=scanner.nextInt();
	        System.out.print("Enter third number : ");
	        third=scanner.nextInt();
	        Largest();
	    }
	    public static void Largest(){
	        if (first>second && first>third) {
	            System.out.println(first + " is the Largest number among 3 numbers");
	        }
	        else if (second>first && second>third){
	                System.out.println(second + " is the Largest number among 3 numbers");
	        }
	        else {
	            System.out.println(third + " is the Largest number among 3 numbers");
	        }
	    }

}
