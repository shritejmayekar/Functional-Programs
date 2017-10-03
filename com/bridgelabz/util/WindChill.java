/******************************************************************************
 *  Compilation:  javac -d . WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.util.WindChill temperature speed
 *  
 *  Purpose: To find windchill
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class WindChill {
	public static double temperature,speed,wind;
	
	public static double calWind(double temperatur,double speed) {
		
	double wind=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(speed,0.16);
           
	return wind;
	}
	public static void main(String[] args) {
	
	temperature=Double.parseDouble(args[0]);
	speed=Double.parseDouble(args[1]);
	System.out.println("WindChill:"+WindChill.calWind(temperature,speed));	
		
	}

}

