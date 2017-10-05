/******************************************************************************
 *  Compilation:  javac -d . SumOf.java
 *  
 *  Purpose: To perform Sum of no. equals zero
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   05-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class SumOf {
	public static void addToZero(int[] array) {
	int counter=0;
		System.out.println("=========Distinct triplets=======");
		for(int i=0;i<array.length-2;i++) {
			for(int j=i+1;j<array.length-1;j++) {
				for(int k=j+1;k<array.length;k++) {
					if((array[i]+array[j]+array[k])==0) {
						System.out.println("( "+array[i]+" )+( "+array[j]+" )+ ( "+array[k]+" )");
						counter++;
					}
				}
			}
		}
	
	System.out.println("distict triplet:"+counter);
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Specipy size of array:");
		int[] array=new int[sc.nextInt()];
		
		System.out.println("\nEnter the elements:");
		for(int i=0;i<array.length;i++)
			array[i]=sc.nextInt();
			
			addToZero(array);
	
	
	
	
	
	}
}
