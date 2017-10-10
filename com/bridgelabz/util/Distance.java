/******************************************************************************
 *  Compilation:  javac -d . Distance.java
 *  Execution:    java -cp bin com.bridgelabz.util.Distance
 *  
 *  Purpose: To Calculate Euclidean distance
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class Distance {
	public static int x,y;
	public static double distance;
	public static void calEuclidean(int x,int y) {
		distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.println("The Euclidean distance is "+distance);
	}  

	public static void main(String[] args) {
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		calEuclidean(x,y);
		

	}

}

