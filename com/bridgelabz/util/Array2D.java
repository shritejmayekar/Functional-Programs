/******************************************************************************
 *  Compilation:  javac -d . Array2D.java
 *  
 *  Purpose: To perform 2D array Operations
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   05-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
import java.io.PrintWriter;
public class Array2D {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Please enter the M row and N col:");
	int M=sc.nextInt();
	int N=sc.nextInt();
	int[][] array=new int[M][N];
	System.out.println("Please enter elements");
	for(int i=0;i<M;i++)
		for(int j=0;j<N;j++)
			array[i][j]=sc.nextInt();
	for(int i=0;i<M;i++) {
		for(int j=0;j<N;j++) {
		PrintWriter writer=new PrintWriter(System.out);
			writer.print(array[i][j]);
			writer.flush();
			writer.close();
		}
	}
	
	
	
	
	}
}
