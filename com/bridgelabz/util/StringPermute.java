/******************************************************************************
 *  Compilation:  javac -d . StringPermute.java
 *  Execution:    java -cp bin com.bridgelabz.util.StringPermute
 *  
 *  Purpose: To find Permutation of string
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class StringPermute {
	public static String name;
	public static int counter;
/**
 * Permutation method
 * @param word
 * @param low
 * @param high
 */
	public static void permute(String word,int low,int high) {
		if(low==high) {
			System.out.println(word);
			counter++;
			return;
		}
		else 
		{
			for(int i=low;i<=high;i++) {
				word=swap(word,low,i);
				permute(word,low+1,high);
			}
		}
		
	}
/**
 * Swapping string method
 * @param word
 * @param i
 * @param j
 * @return word
 */
	public static String swap(String word,int i,int j) {
		char ch[]=word.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
	}
	public static void iterate(String word,int low,int high) {
		while(low<=high) {
			for(int i=low;i<=high;i++) {
			word=swap(word,low,i);
			
			low=low+1;
			}
			}
		
		}
			
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter name:");
		name=sc.next();
		permute(name,0,name.length()-1);
		//iterate(name,0,name.length()-1);
		System.out.println("No. of permutation is "+counter);

	}

}

