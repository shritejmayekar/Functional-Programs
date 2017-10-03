package com.bridgelabz.util;
import java.util.Scanner;
public class CrossGame {
	public static int row,col;
	Scanner sc=new Scanner(System.in);
	public static char array[][]={	{'-','-','-'},
					{'-','-','-'},
					{'-','-','-'}
					};
	public static void compPlay() {
	if(randomPosition())
	{
		row=0;
		col=0;
	}
	else if(randomPosition()) {
		row=1;
		col=1;
	}
	else {
		row=2;
		col=2;
	}
	if(array[row][col]!='o'||array[row][col]!='X')
			array[row][col]='O';
	else
		compPlay();
	}
	public static boolean randomPosition() {
		return Math.random()<0.5;	
	
	}
	public static void win() {
	
		if((a[0][0]&&a[1][1])&&a[2][2])
			System.out.print("win");
		
	}
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array[i][j] );
		
			}
			System.out.println();
	

		}
		System.out.println("Please enter row and col");
		row=sc.nextInt();
		col=sc.nextInt();
		array[row][col]='X';
		compPlay();
		
		
	}
	}
	

}

