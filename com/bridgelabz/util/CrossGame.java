package com.bridgelabz.util;
import java.util.Scanner;
import java.util.Random;
public class CrossGame {
	public static int row,col;
	Scanner sc=new Scanner(System.in);
	public static char array[][]={	{'-','-','-'},
					{'-','-','-'},
					{'-','-','-'}
					};
	public static void compPlay() {
	int row=randomPosition();
	int col=randomPosition();
	if(array[row][col]!='O'&&array[row][col]!='X')
			array[row][col]='O';
	else {
	 		/*row=randomPosition();
	 		col=randomPosition();
	 		if(array[row][col]!='O'&&array[row][col]!='X')
			array[row][col]='O';
			else {
	 		row=randomPosition();
	 		col=randomPosition();
	 		if(array[row][col]!='O'&&array[row][col]!='X')
			array[row][col]='O';
			else {
	 		row=randomPosition();
	 		col=randomPosition();
	 		if(array[row][col]!='O'&&array[row][col]!='X')
			array[row][col]='O';
			}
			}*/
			compPlay();
			
	}
			
	
	}
	public static int randomPosition() {
		Random r=new Random();	
		return r.nextInt(2);
	
	}
	
	public static void win(char ch) {
	
		if((array[0][0]==ch)&&(array[1][1]==ch)&&(array[2][2]==ch)) {
			System.out.println("win " +ch);		
			return;
		}
		else if((array[0][2]==ch)&&(array[1][1]==ch)&&(array[2][0]==ch)) {
			System.out.println("win " +ch);
			return;
		}	
		else if((array[0][0]==ch)&&(array[1][0]==ch)&&(array[2][0]==ch)) {
			System.out.println("win " +ch);
				return;
		}
		else if((array[0][1]==ch)&&(array[1][1]==ch)&&(array[2][1]==ch)) {
			System.out.println("win " +ch);
				return;
		}	
		else if((array[0][2]==ch)&&(array[1][2]==ch)&&(array[2][2]==ch)) {
			System.out.println("win " +ch);
				return;
		}
		else if((array[0][0]==ch)&&(array[0][1]==ch)&&(array[0][2]==ch)) {
			System.out.println("win " +ch);
				return;
		}	
		else if((array[1][0]==ch)&&(array[1][1]==ch)&&(array[1][2]==ch)) {
			System.out.println("win " +ch);
				return;
		}	
		else if((array[2][0]==ch)&&(array[2][1]==ch)&&(array[2][2]==ch)) {
			System.out.println("win " +ch);
				return;
		}
		else
		return;			
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
		if(array[row][col]!='O'&&array[row][col]!='X')
		array[row][col]='X';
		else
		main(args);
		compPlay();
		win('X');
		win('O');
		
		
	}
	}
}
	