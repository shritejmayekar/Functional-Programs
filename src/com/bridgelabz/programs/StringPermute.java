/******************************************************************************
 *  
 *  Purpose: To Calculate the times of arrangement of word as well as print
 *  			those numbers
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
public class StringPermute {
	public static String name;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please Enter name:");
		name=scanner.next();
		
		Utility.permute(name,0,name.length()-1);
		
		System.out.println("No. of permutation is "+Utility.counter);
		scanner.close();
	}

}

