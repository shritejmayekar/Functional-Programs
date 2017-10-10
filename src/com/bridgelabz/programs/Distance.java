/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/Distance.java
 *  Execution:    java -cp bin com.bridgelabz.programs.Distance
 *  
 *  Purpose: To Calculate Euclidean distance
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Distance {
	public static int x,y;
	public static double distance;
	
	public static void main(String[] args) {
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		Utility.calEuclidean(x,y);
		

	}

}

