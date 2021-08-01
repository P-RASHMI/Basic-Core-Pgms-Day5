package com.day5assign.vowelconst;

import java.util.Scanner;

public class VowelConsonant {
	public static final Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your alphabet : ");
        char userInput = SC.next().charAt(0);
        char check=Character.toLowerCase(userInput);
        if (check=='a'||check=='e'||check=='i'||check=='o'||check=='u'){
            System.out.println(userInput + " is Vowel");
        }
        else {
            System.out.println(userInput + " is Consonant");
        }
    }

}
