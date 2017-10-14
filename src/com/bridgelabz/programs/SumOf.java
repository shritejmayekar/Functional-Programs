/******************************************************************************
 *  
 *  Purpose: To find occurrence of numbers that individual distinct 
 *  			sum equals zero
 *  			
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   05-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.util.Utility;
public class SumOf {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Specipy size of array:");
		int[] array=new int[scanner.nextInt()];
		
		System.out.println("\nEnter the elements:");
		for(int i=0;i<array.length;i++)
			array[i]=scanner.nextInt();
			
			Utility.sumOfArrayZero(array);
	
	
			scanner.close();
	
	
	}
}
