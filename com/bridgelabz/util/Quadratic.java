/******************************************************************************
 *  Compilation:  javac -d .Quadratic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Quadratic
 *  
 *  Purpose: To find roots of Quadrartic equation
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class Quadratic {
	public static int a,b,c;
	public static double root1,root2,delta;
	public static void calEquation(int a,int b,int c) {
		if(a==0) {
			System.out.println("a should not be zero");
			return;
		}
		delta=Math.pow(b,2)-4*a*c;
		if(delta==0) {
			root1=root2=(-b)/(2*a);
			System.out.println("Roots are equal "+root1);
		}
		else if(delta>0) {
			root1=(-b+Math.sqrt(delta))/(2*a);
			root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Roots are distinct"+
			"\nRoot1="+root1+"\nRoot2="+root2);
		}
		else
			System.out.println("Roots are imaginary");
	}
	public static void main(String[] args) {
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	c=Integer.parseInt(args[2]);
	Quadratic.calEquation(a,b,c);
	
	}
}

