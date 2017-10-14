/******************************************************************************
 *  
 *  Purpose: To findthe roots of quadratic equation
 *  			
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Quadratic {
	public static int a,b,c;
	
	public static void main(String[] args) {
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	c=Integer.parseInt(args[2]);
	Utility.calQuadratic(a,b,c);
	
	}
}

