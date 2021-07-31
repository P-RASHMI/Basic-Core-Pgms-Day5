package com.day5assign.power;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner SC = new Scanner(System.in);
		int range = SC.nextInt();
		if (range < 31) {
			for (int i = 0; i <= range; i++) {
				System.out.println((int) Math.pow(2, i));
			}
		}

		else {
			System.out.println("enter the range less than 31");
		}
		SC.close();
	}
}
