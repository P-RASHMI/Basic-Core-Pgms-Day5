package com.day5assign.quadratic;

import java.util.Scanner;

public class Quadratic {
	public static void main(String args[]){
	      double secondRoot = 0, firstRoot = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value of a ::");
	      double a = sc.nextDouble();

	      System.out.println("Enter the value of b ::");
	      double b = sc.nextDouble();

	      System.out.println("Enter the value of c ::");
	      double c = sc.nextDouble();

	      double determinant = (b*b)-(4*a*c);
	      System.out.println("determinant is " +determinant);
	      double sqrt = Math.sqrt(determinant);
	      
	      if(determinant>0){
	         firstRoot = (-b + sqrt)/(2*a);
	         secondRoot = (-b - sqrt)/(2*a);
	         System.out.println("roots are real and distinct");
	         System.out.println("Roots are :: \n first root " + firstRoot +" and second root "+secondRoot);
	      }else if(determinant == 0){
	    	 System.out.println("roots are real and equal");
	         System.out.println("Root is :: "+(-b + sqrt)/(2*a));
	      }
	      else {
	    	  System.out.println("Roots are imaginary");
	      }
	 sc.close();  
	}

}
