package com.day5assign.distance;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		int x,y;
		Scanner SC = new Scanner(System.in);
		System.out.println("enter the x coordinate");
		x = SC.nextInt();
		System.out.println("enter the y coordinate");
		y = SC.nextInt();
		double dist = Math.sqrt(x*x + y*y);
		System.out.println("distance from("+x+","+y+") to (0,0)=" +dist);
		SC.close();
	}

}
