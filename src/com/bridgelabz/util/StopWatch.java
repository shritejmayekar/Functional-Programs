/******************************************************************************
 *  Compilation:  javac -d . StopWatch.java
 *  Execution:    java -cp bin com.bridgelabz.util.StopWatch
 *  
 *  Purpose: To Calculate time of execution of programs
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class StopWatch {
	public static long startTime,stopTime,elapseTime;
	public static void start() {
		startTime=System.currentTimeMillis();
	}
	public static void stop() {
	
		stopTime=System.currentTimeMillis();
		elapse();
	}
	public static void elapse() {
		elapseTime=stopTime-startTime;
	}
	public static void showStart() {
		System.out.println("Start time:"+startTime);
	}
	public static void showStop() {
		System.out.println("Stop time:"+stopTime);
	}
	public static void showElapse() {
		System.out.println("Stop time:"+elapseTime+" milliseconds");
	}
}

