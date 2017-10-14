/******************************************************************************
 *  
 *  Purpose: To take 2D array input using Scanner class and print using 
 *  			 PrintWriter with OutputStreamWriter
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;


import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array {
	public static  int mRow,nColoumn;
	
	public static PrintWriter printWriter;
	public static Scanner scanner;
/**
 * 	
 */
	static {
		try {
			scanner=new Scanner(System.in);
			printWriter=new PrintWriter(new OutputStreamWriter(System.out),true);
		}
		catch(Exception e) {
			printWriter.print("Exception:"+e);
			printWriter.flush();
		}
	}
/**
 * readArray method to take input from user
 * @param array
 * @param mRow
 * @param nColoumn
 */
	public static void readArray(int[][] array,int mRow,int nColoumn) {
		printWriter.println("Please enter the elements");
		printWriter.flush();
		
		for (int i = 0; i < mRow; i++) {
			for (int j = 0; j < nColoumn; j++) {
				array[i][j]=scanner.nextInt();
				
			}
			
		}
	}
/**
 * displayArray method to display the array elements
 * @param array
 * @param mRow
 * @param nColoumn
 */
	public static void displayArray(int[][] array,int mRow,int nColoumn) {
		printWriter.println("Array elements");
		printWriter.flush();
		for(int i=0;i<mRow;i++) {
			for(int j=0;j<nColoumn;j++){
				printWriter.print(array[i][j]+" ");
				printWriter.flush();
		
			}
			printWriter.println();
		}
		
		
	}
	public static void main(String[] args) {
		
	printWriter.print("Please enter the Mth row and Nth column");
	printWriter.flush();
	mRow=scanner.nextInt();
	nColoumn=scanner.nextInt();

	int[][] array=new int[mRow][nColoumn]; /* Declare and initialize array */
	
	Array.readArray(array, mRow, nColoumn); /* Read array elements from user */
	
	Array.displayArray(array, mRow, nColoumn);/*Display array elements */
	
	
}


}