package com.day5assign.harmonicnum;

import java.util.Scanner;

public class HarmonicNum {
	public static final Scanner scanner = new Scanner(System.in);
    public static int Input;
    public static float harmonicnum;
    public static void main(String[] args) {
        System.out.print("Enter value of N  : ");
        Input= scanner.nextInt();
        harmonic();
    }
    public static void harmonic(){
        if (Input == 0){
            System.out.println("given n value should not be Zero");
        }
        else {
            for (float i = 1; i <= Input; i++) {
                harmonicnum = harmonicnum + (1 / i);
            }
            System.out.println("the nth Harmonic number is : " + harmonicnum);
        }

    }

}
