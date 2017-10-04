package com.bridgelabz.util;

import java.util.Random;

public class CouponNumber {
/**
 * 
 * @param number
 */
	public static void coupon(int number) {
		int[] a=new int[number];
		int num;
		for(int i=0;i<number;i++) {
			num=generateRandom();
			if(!duplicate(a, num))
				a[i]=num;
			else {
				i--;
			}		
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}	
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
		// TODO Auto-generated method stub
		//System.out.print(Math.random()*9);
		coupon(8);

	}

}
