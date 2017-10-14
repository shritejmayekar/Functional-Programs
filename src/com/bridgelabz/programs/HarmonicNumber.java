/******************************************************************************
 *  
 *  Purpose: To calculate harmonic number and display series
 *  			
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.util.Utility;
public class HarmonicNumber {
	public static int number;
	public static double sum;

	public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the nth no.:");
	number=scanner.nextInt();
	if(number!=0)
		System.out.println("\n Harmonic is:"+Utility.harmonic(number));
	else
		System.out.println("\n number should not be zero");
		
	scanner.close();	
	}

}

