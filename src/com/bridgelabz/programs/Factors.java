/******************************************************************************
 *  
 *  Purpose: To find the prime factors of Number given by user
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factors {
	/*Variable Declaration */
	public static int value;
/**
 * evenFactor method to calculate even factors of number	
 */
	public static void evenFactor() {
		System.out.print(2+"  ");
		value=value/2;
	}
/**
 * primeFactor method to calculate prime factors of number
 * @param factor
 */
	public static void primeFactor(int factor) {
		System.out.print(factor+"  ");
		value=value/factor;
	}
/**
 * isPrime method checks the number is prime or not
 * @param number
 * @return boolean(true or false)
 */
	public static boolean isPrime(int number) {
		int counter=0;
		for (int i = 1; i <=number; i++) {
			if(number%i==0) {
				counter++;
			
			}
		}
		if(counter==2)
			return true;
		return false;
	}
/**
 * findPrimeFactors method find and calculates all the prime factors
 * 		for given number
 */
	public static void findPrimeFactors () {
		int ntraverse=value;
		for(int i=0;i*i<=ntraverse;i++) {
			if(value%2==0) 
				evenFactor();
			else {
				
				for(int factor=3;factor<=value;factor++) {
					if(isPrime(factor))
						if(value%factor==0)
							primeFactor(factor);
				}		
			}	
		}	
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter the number:");
		try {
			value=scanner.nextInt();
			findPrimeFactors();
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
