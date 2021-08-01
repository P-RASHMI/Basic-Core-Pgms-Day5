package com.day5assign.swaptwonum;

import java.util.Scanner;

public class SwapTwoNum {
	public static final Scanner scanner = new Scanner(System.in);
    public static int first,second;
    public static void main(String[] args) {
        System.out.print("Enter your first Number : ");
        first = scanner.nextInt();
        System.out.print("Enter your second Number : ");
        second = scanner.nextInt();
        SwapNum();
    }
    public static void SwapNum(){
        int temp=first;
        first=second;
        second=temp;
        System.out.println("\nAfter Swapping");
        System.out.println("the first number became as : " + first);
        System.out.println("the second number became as : " + second);
    }
}
