/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/CrossGame.java
 *  Execution:    java -cp bin com.bridgelabz.programs.CrossGame
 *  
 *  Purpose: To play cross game with computer and computer play by random guess
 *  			to win
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;
import java.util.Random;
public class CrossGame {
	public static int row,col;
	Scanner sc=new Scanner(System.in);
	public static char array[][]={	{'-','-','-'},
					{'-','-','-'},
					{'-','-','-'}
					};
/**
 * computer Play method to make random moves in tic-tac-toe game
 */
	public static void computerPlay() {
	int row=randomPosition();
	int col=randomPosition();
	if(array[row][col]!='O'&&array[row][col]!='X')
			array[row][col]='O';
	
	else if(array[col][row]!='O'&&array[col][row]!='X')
			array[row][col]='O';
	
	else 
		computerPlay();
	
	
	}
	public static int randomPosition() {
		Random random=new Random();	
		return random.nextInt(3);
	
	}
/**
 * win method to check whether whom win 
 * @param ch
 */
	
	public static void win(char ch) {
	
		if((array[0][0]==ch)&&(array[1][1]==ch)&&(array[2][2]==ch)) {
			System.out.println("win " +ch);
			System.exit(0);
		}
		else if((array[0][2]==ch)&&(array[1][1]==ch)&&(array[2][0]==ch)) {
			System.out.println("win " +ch);
			System.exit(0);
		}	
		else if((array[0][0]==ch)&&(array[1][0]==ch)&&(array[2][0]==ch)) {
			System.out.println("win " +ch);
			System.exit(0);
		}
		else if((array[0][1]==ch)&&(array[1][1]==ch)&&(array[2][1]==ch)) {
			System.out.println("win " +ch);
			System.exit(0);
		}	
		else if((array[0][2]==ch)&&(array[1][2]==ch)&&(array[2][2]==ch)) {
			System.out.println("win " +ch);
			System.exit(0);
		}
		else if((array[0][0]==ch)&&(array[0][1]==ch)&&(array[0][2]==ch)) {
			System.out.println("win " +ch);
			System.exit(0);
		}	
		else if((array[1][0]==ch)&&(array[1][1]==ch)&&(array[1][2]==ch)) {
			System.out.println("win " +ch);
			System.exit(0);	
			}	
		else if((array[2][0]==ch)&&(array[2][1]==ch)&&(array[2][2]==ch)) {
			System.out.println("win " +ch);
			System.exit(0);
		}
		else
			System.out.println("Not win  " +ch);	
	}
		
	

	

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	while(true) {
	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array[i][j] );
		
			}
			System.out.println();
	

		}
		System.out.println("Please enter row and col");
		row=scanner.nextInt();
		col=scanner.nextInt();
		if(array[row][col]!='O'&&array[row][col]!='X')
		array[row][col]='X';
		else
		main(args);
		win('X');
		computerPlay();
		win('O');
		scanner.close();
		
	}
	}
}
	
