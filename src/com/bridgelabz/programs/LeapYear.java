/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.programs.LeapYeat
 *  
 *  Purpose: To check whether the Year is leap or not
 *  			
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.InputMismatchException;
import java.util.Scanner;



public class LeapYear {
	public static int year;
	public static String LEAP_YEAR_MSG="The year is an Leap Year";
	public static String NOT_LEAP_YEAR_MSG="The year is not an Leap Year";
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in );
		System.out.print("Please Enter the year:");
		try{
		year = scanner.nextInt();
		if(Utility.isLeapYear(year))
			System.out.println(year+" "+LEAP_YEAR_MSG);
		else
			System.out.println(year+" "+NOT_LEAP_YEAR_MSG);
		}
		catch(InputMismatchException e1) {
			System.out.print("Exception "+e1);

		}
		catch (Exception e) {
			System.out.print("Exception "+e);
		}
		scanner.close();	

	}

}
