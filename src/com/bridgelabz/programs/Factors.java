
package com.bridgelabz.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgelabz.util.Utility;
/******************************************************************************
 *  
 *  Purpose: To find the prime factors of Number given by user
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
public class Factors {
	public static int value;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter the number:");
		try {
			value=scanner.nextInt();
			Utility.findPrimeFactors(value);
		}
		catch (InputMismatchException exceptionInput) {
			System.out.println("Exception "+exceptionInput);

		}
		catch(NumberFormatException exceptionNumber) {
			System.out.println("Exception "+exceptionNumber);
		}
		catch (Exception exception) {
			System.out.println("Exception "+exception);
		}
		scanner.close();
	}

}
