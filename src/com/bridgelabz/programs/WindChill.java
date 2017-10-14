/******************************************************************************
 *  
 *  Purpose: To find the wind is chilled how much
 *  			
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class WindChill {
	public static double temperature,speed,wind;
	
	
	public static void main(String[] args) {
	
	temperature=Double.parseDouble(args[0]);
	speed=Double.parseDouble(args[1]);
	System.out.println("WindChill:"+Utility.windChill(temperature, speed));	
		
	}

}

