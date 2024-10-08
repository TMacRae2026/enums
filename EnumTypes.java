/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enumtypes;

import java.util.Scanner;

/**
 *
 * @author TMacRae2026
 */
public class EnumTypes {
    //Create 2 enums for the days and the months
    enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
    enum Month {January, Febuary, March, April, May, June, July, August, September, October, November, December}
    
    public static void main(String[] args) {
        //print all values of enum using a for loop
        for(Day d : Day.values()) {
            System.out.println(d.name() + ": " + (d.ordinal() + 1)); 
        }
        
        System.out.print("\n\n"); //seperate with 2 lines
        
        //print all values of enum using a for loop
        for(Month m : Month.values()) {
            System.out.println(m.name() + ": " + (m.ordinal() + 1)); 
        }
        
        System.out.print("\n\n");
        
        //get the whole string
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Please enter your CCHS username (including graduation year): ");
            String graduationYearStr = new String(""); //these are out of the try catch to keep them in the correct scope
            int graduationYear = 0;
            try {
                String username = scanner.nextLine();

                //make a substring of the year
                graduationYearStr = username.substring(username.length() - 4);
                
                //pare stirng to int (this is why its in a try catch)
                graduationYear = Integer.parseInt(graduationYearStr); //Super duper cool Integer wrapper class
            } catch(Exception e) {
                System.out.println("Please enter a valid username and graduation year");
                continue;
            }

            System.out.println("You will graduate in " + graduationYear);
            System.out.println("The year after that will be " + (graduationYear + 1));
            System.out.println("In computer language you graduate in " + (Integer.toBinaryString(graduationYear)));
            break;
        }
        
        
        
    }
    
    
}