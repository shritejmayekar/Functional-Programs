/******************************************************************************
 *  Compilation:  javac -d .ReplaceString.java
 *  Execution:    java -cp bin com.bridgelabz.util.ReplaceString
 *  
 *  Purpose: To	interact with user
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;

public class ReplaceString {
	static String username;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Name:");
		username=sc.nextLine();
		if(username.length()<3)
			System.out.print("\n Username min 3 characters \n");
		else
			System.out.print("\n Hello "+username+", How are You ? \n");
	
	}

}

