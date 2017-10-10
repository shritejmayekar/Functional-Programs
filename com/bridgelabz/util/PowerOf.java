/******************************************************************************
 *  Compilation:  javac -d . PowerOf.java
 *  Execution:    java -cp bin com.bridgelabz.util.PowerOf
 *  
 *  Purpose: To print power of 2^N
 *  @author  Shritej
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class PowerOf {
	public static int number;
	public static void printTable() {
	int pow=0;
	for(int i=1;i<=number;i++) {
		pow=(int)Math.pow(2,i);
		System.out.println("2 ^ " +i+" ="+pow);
	}
		
	
	
	}
	public static void main(String[] args) {
	
		number=Integer.parseInt(args[0]);
		if(number<31)
			printTable();
		else
			System.out.println("not possible");
		
		
	}

}

