package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] quotes={"Be the change that you wish to see in the world",
        "The greatest wealth is to live content with little",
                "All that we are is the result of what we have thought"};


        System.out.println("Please choose a number between 1-3");
        String in= scanner.nextLine();
        int input=Integer.parseInt(in);

        if(input>quotes.length){
            try {
                System.out.println(quotes[input]);
            }
            catch (ArrayIndexOutOfBoundsException indexScrewUp){
                System.out.println("Index is invalid " +indexScrewUp.getMessage());
                System.out.println("There is no quote in that index");

            }
        }


    }



}
