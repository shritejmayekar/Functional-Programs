/******************************************************************************
 *  Compilation:  javac -d . FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin
 *  
 *  Purpose: To perform Flip coin and simulation of average no. of times head vs tail
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class FlipCoin {
	static int head,tail,numberOfsimulation;
	static float perHead,perTail;
/**
*	check head or tail occurrence
*	@param void
*	@return boolean (true or false)
*/
	public static boolean isHead() {
		return Math.random()<0.5;
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Please Enter the no. of times Coin Flip:");
	numberOfsimulation=sc.nextInt();
	
	for(int i=0;i<numberOfsimulation;i++) {
		if(isHead())
			head++;
		else
			tail++;
	
	}
	
	perHead=(head*100)/numberOfsimulation;
	perTail=(tail*100)/numberOfsimulation;
	System.out.println("Head percentage:"+perHead+"\nTail percentage:"+perTail);
		
	}

}
