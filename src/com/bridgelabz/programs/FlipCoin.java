
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

import java.util.InputMismatchException;
import java.util.Scanner;
/******************************************************************************
 *  
 *  Purpose: To FlipCoin number of times  and calculate percentage of
 *  			head and tail
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
public class FlipCoin {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("Please Enter the no. of times Coin Flip:");
		try {
			Utility.flipCoin(scanner.nextInt());
		}
		catch (InputMismatchException e1) {
			System.out.print("Exception "+e1);
		}
		catch (Exception e) {
			System.out.print("Exception "+e);
		}
		scanner.close();
	}

}
