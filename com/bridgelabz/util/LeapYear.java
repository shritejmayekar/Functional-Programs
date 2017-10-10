/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.util.LeapYear
 *  
 *  Purpose: To check whether the entered is leap year or not.
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class LeapYear {
	public static int year;
	public static String LEAP_YEAR_MSG="The year is an Leap Year";
	public static String NOT_LEAP_YEAR_MSG="The year is not an Leap Year";

/**
* Function to check for isLeapYear
*
* @param year the year to check for isLeapYear
*/
	public static boolean isLeapYear(int year) {
		if(year%4==0) 
			return true;
		else if(year%100==0)
			return false;
		else if(year%400==0)
			return true;
		
		return false;
		}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter the year:");
		year=sc.nextInt();
		
		if(year>999) {
		
			if(isLeapYear(year))
				System.out.println(LEAP_YEAR_MSG);
			else
				System.out.println(NOT_LEAP_YEAR_MSG);
		}
		else 
			System.out.println("Year should be 4 digits");
		
		

	}

}

