package com.bridgelabz.util;

import java.util.Random;
import java.util.Scanner;
public class CouponNumber {
/**
 * 
 * @param number
 */
	public static int coupon(int number) {
		int[] a=new int[number];
		int num;
		int couponNum=0;
		int counter=0;
		for(int i=0;i<number;i++) {
			num=generateRandom();
			if(!duplicate(a, num)) {
				a[i]=num;
				couponNum=num+couponNum*10;
			}
			else {
				i--;
			}
			counter++;		
		}
		System.out.println("\nIteration for generate coupon="+counter);
		return couponNum;
			
	}
	
/**
 * 
 * @return
 */
	public static int generateRandom() {
		Random r=new Random();
		
		return r.nextInt(9);
	}
/**
 * 	
 * @param arr
 * @param num
 * @return
 */
	public static boolean duplicate(int[] arr,int num) {
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i])
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please Enter the length of Coupon:");
		System.out.println("coupon number is "+coupon(sc.nextInt()));
		System.out.println();

	}

}
