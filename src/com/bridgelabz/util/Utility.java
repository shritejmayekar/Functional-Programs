/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/util/Utility.java
 *  Execution:    java -cp bin com.bridgelabz.util.Utility
 *  
 *  Purpose: To perform different task like generateRandom, quadratic,etc
 *  		
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Random;

public class Utility {
	static int head,tail;
	public static double sum;
	static float perHead,perTail;
	public static int a,b,c;
	public static int counter;
	public static double distance;
	public static double root1,root2,delta;
	public static int win,lose;
	/*Variable Declaration */
	public static int valueFactor;
/**
 * evenFactor method to calculate even factors of number	
 */
	public static void evenFactor() {
		System.out.print(2+"  ");
		valueFactor=valueFactor/2;
	}
/**
 * primeFactor method to calculate prime factors of number
 * @param factor
 */
	public static void primeFactor(int factor) {
		System.out.print(factor+"  ");
		valueFactor=valueFactor/factor;
	}
/**
 * isPrime method checks the number is prime or not
 * @param number
 * @return boolean(true or false)
 */
	public static boolean isPrime(int number) {
		int counter=0;
		for (int i = 1; i <=number; i++) {
			if(number%i==0) {
				counter++;
			
			}
		}
		if(counter==2)
			return true;
		return false;
	}
/**
 * findPrimeFactors method find and calculates all the prime factors
 * 		for given number
 */
	public static void findPrimeFactors (int value) {
		valueFactor=value;
		int ntraverse=value;
		for(int i=0;i*i<=ntraverse;i++) {
			if(valueFactor%2==0) 
				evenFactor();
			else {
				
				for(int factor=3;factor<=valueFactor;factor++) {
					if(isPrime(factor))
						if(valueFactor%factor==0)
							primeFactor(factor);
				}		
			}	
		}	
	}
/**
 * gambler method will calculates will gambler lose money or reach goal
 * @param goal
 * @param stake
 * @param numberOfSimulation
 */
	public static void gambler(int goal,int stake,int numberOfSimulation) {
		for (int i = 0; i < numberOfSimulation; i++) {
			if(goal==stake) {
				System.out.println("win");
				break;
			}
			else if((stake>0)&&(goal!=stake)) {
				if(Math.random()<0.5) {
					win++;
					stake++;
				}
				else {
					lose++;
					stake--;
				}
			}
			else {
				System.out.println("better luck next time");
				break;
			}
		
	}
	System.out.println("stake="+stake+" win="+win+" lose="+ lose);
	}
/**
*	check head or tail occurrence
*	@param void
*	@return boolean (true or false)
*/
	public static boolean isHead() {
		return Math.random()<0.5;
	}
/**
 * flip coin method calculates head and tail occurrence as well as percentage
 * @param numberOfSimulation
 */
	public static void flipCoin(int numberOfSimulation) {
	for(int i=0;i<numberOfSimulation;i++) {
		if(isHead())
			head++;
		else
			tail++;
	
	}
	
	perHead=(head*100)/numberOfSimulation;
	perTail=(tail*100)/numberOfSimulation;
	System.out.println("Ocuurence head="+head+" tail="+tail);
	System.out.println("Head percentage:"+perHead+"\nTail percentage:"+perTail);
	}
/**
 * Function to check for isLeapYear
 *
 * @param year the year to check for isLeapYear
*/
	public static boolean isLeapYear(int year) {
		if(year<1000) {
			System.out.println("Year should be 4 digits");
			return false;	
		}
		if(year%4==0) 
			return true;
		else if(year%100==0)
			return false;
		else if(year%400==0)
			return true;
		return false;
	}

	public static void powerOf(int number) {
		int powerResult=0;
		for(int i=1;i<=number;i++) {			
			powerResult=(int)Math.pow(2,i);
			System.out.println("2 ^ " +i+" ="+powerResult);
		}
	}
/**
 * Method to calculate Quadratic Equation (aX^2+bX+C=0)
 * @param a 
 * @param b
 * @param c
 */
	
	public static void calQuadratic(int a,int b,int c) {
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
/**
 * 	Coupon method to generate distinct set of 0-9 length coupon
 * @param number
 * @return
 */
public static int coupon(int number) {
		
		int[] couponNumber=new int[9];
		for(int i=0;i<9;i++)
			couponNumber[i]=-1;
		int num;
		int couponNum=0;
		int counter=0;
		for(int i=0;i<9;i++) {
			num=generateRandom();
			if(!duplicate(couponNumber, num)) {
				couponNumber[i]=num;
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
* 	generateRandom method will generate random number between 0-9 of type integer
* @return
*/
	public static int generateRandom() {
		Random random=new Random();
		return random.nextInt(10);//scanner.close();
	}
/**
 * duplicate method check the uniqueness of value
 * @param arr
 * @param num
 * @return
 */

	public static boolean duplicate(int[] array,int num) {
		for(int i=0;i<array.length;i++) {
			if(num==array[i])
				return true;
		}
		return false;
	}
/**
 * 
 * @param array
 */
	public static void sumOfArrayZero(int[] array) {
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
/**
 * Wind chill method to calculate wind
 * @param temperatur
 * @param speed
 * @return
 */
	public static double windChill(double temperature,double speed) {
		
		double wind=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(speed,0.16);
	           
		return wind;
		}
	public static void calEuclidean(int x,int y) {
		distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.println("The Euclidean distance is "+distance);
	} 
	
/*Creating an method name Harmonic 
*@param number
*@return sum	
*	
*/
	
	public static double harmonic(int number) {
	for(int i=1;i<=number;i++) {
		System.out.print("1/"+i);
		sum=sum+Math.pow(i,-1);
		if(i!=number)
			System.out.print("+");	
		}	
	return sum;
	}
	
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
			



}
