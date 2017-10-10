/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/CouponNumber.java
 *  Execution:    java -cp bin com.bridgelabz.programs.CouponNumber
 *  
 *  Purpose: To take length of coupon and generate coupon with
 *  			distinct number
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
public class CouponNumber {
	public static int distinctCoupon;
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.print("Please Enter the number of Coupon:");
			distinctCoupon=scanner.nextInt();
			for(int i=0;i<distinctCoupon;i++) {
				System.out.println("coupon number is "+Utility.coupon(distinctCoupon));
				System.out.println();
			}
		}
		catch (NumberFormatException e) {
			System.out.println("exception"+e);
		}
		catch (Exception e1) {
			System.out.println("exception"+e1);
		}
		scanner.close();
	}
	

}
