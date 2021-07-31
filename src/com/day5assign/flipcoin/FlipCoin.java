package com.day5assign.flipcoin;

import java.util.Scanner;

public class FlipCoin {
public static void main(String[] args) {
	int heads = 0;
    int tails = 0;
    int counter = 1;
    int headpercent,tailpercent;
    double randNum = 0.0;
    Scanner in = new Scanner(System.in); 
    System.out.println("How many times will the coin be flipped? ");
    int flips = in.nextInt();
    while(counter <= flips)
    {
        randNum = Math.random();
        System.out.print(counter + "\t" + randNum);
         
        if(randNum < .5)
        {
            heads++;
            System.out.println("\t heads");
        }
        else
        {
            tails++;
            System.out.println("\t tails");
           }
        counter++;      
    }
    System.out.println();
    System.out.println("Number of Heads = " + heads);
    System.out.println("Number of Tails = " + tails);
    headpercent = heads * 100 / flips;
	tailpercent = tails * 100 / flips;
	System.out.println("Percentage for heads : " + headpercent);
	System.out.println("Percentage for tails : " + tailpercent);
 in.close();
}
}
