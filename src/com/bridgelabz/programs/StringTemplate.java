
package com.bridgelabz.programs;
import java.util.Scanner;
/******************************************************************************
 *  
 *  Purpose: To interact with user and give response
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
public class StringTemplate {
	public static String username;
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("Please Enter Name:");
		username = scanner.nextLine();
		if(username.length()<3)
			System.out.print("\n Username min 3 characters \n");
		else
			System.out.print("\n Hello "+username+", How are You ? \n");
		scanner.close();
	}

}
