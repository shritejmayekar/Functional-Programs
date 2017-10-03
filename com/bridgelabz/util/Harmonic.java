/******************************************************************************
 *  Compilation:  javac -d . HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.HarmonicNumber
 *  
 *  Purpose: To find HarmonicNumber upto n
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class HarmonicNumber {
	public static int number;
	public static double sum;
	
/*Creating an method name Harmonic 
*@param number
*@return sum	
*	
*/
	
	public static double harmonic(int number) {
	for(int i=1;i<=number;i++) {
		System.out.print("1/"+i);
		sum=sum+Math.pow(i,-1);
		if(i!=number)
			System.out.print("+");	
		}	
	return sum;
	}

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the nth no.:");
	number=sc.nextInt();
	if(number!=0)
		System.out.println("\n Harmonic is:"+harmonic(number));
	else
		System.out.println("\n number should not be zero");
		
		
	}

}

