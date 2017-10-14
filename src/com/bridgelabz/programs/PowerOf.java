/******************************************************************************
 *  
 *  Purpose: To print the 2 raised to number(2^n) table
 *  			
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class PowerOf {	
	public static int number;
	public static void main(String[] args) {
	
		number=Integer.parseInt(args[0]);
		if(number<31)
			Utility.powerOf(number);
		else
			System.out.println("not possible");
		
		
	}

}

