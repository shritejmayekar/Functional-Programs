package com.bridgelabz.programs;

import java.util.Random;
import java.util.Scanner;
/**
 * Purpose: To built an ultimate tic-tac-toe of giant size to play
 * @author Shritej
 * @version 2.0
 * @since 28-10-2017
 *
 */
public class TicTacToe {
	public static int row,col;
	public static Scanner scanner=new Scanner(System.in);
	/**
	 * ticTacToeStart method will start tic-tac-toe game chaos
	 * @param checkBoard
	 */
	public static void ticTacToeStart(char[][] checkBoard) {
		int row=0;
		int col=0;
		while(true) {

			for (int i = 0; i < checkBoard.length; i++) {
				for (int j = 0; j < checkBoard.length; j++) {
					System.out.print(checkBoard[i][j]+"\t");	/*Print the checkBoard */
				}
				System.out.println();
			}
			System.out.println("Please enter row and col");	/*Get move from human Player */
			row=scanner.nextInt();
			col=scanner.nextInt();

			if(checkBoard[row][col]!='O'&&checkBoard[row][col]!='X')	/*Check blank position*/
				checkBoard[row][col]='X';
			else {
				System.out.println("already played there take next");
				ticTacToeStart(checkBoard);	/*if position is not empty call self recursively*/

			}

			win('X', checkBoard); /* check human player win */
			computerPlay(checkBoard); /*Computer's moves */
			win('O', checkBoard);/* check computer win */

		}

	}
	/**
	 * computer Play method to make random moves in tic-tac-toe game
	 */
	public static void computerPlay(char[][] checkBoard) {
		int row=randomPosition();
		int col=randomPosition();
		if(checkBoard[row][col]!='O'&&checkBoard[row][col]!='X')
			checkBoard[row][col]='O';

		else if(checkBoard[col][row]!='O'&&checkBoard[col][row]!='X')
			checkBoard[row][col]='O';

		else 
			computerPlay(checkBoard);


	}
	/**
	 * randomPosition method generates random position for computer
	 * @return
	 */
	public static int randomPosition() {
		Random random=new Random();	
		return random.nextInt(row);

	}
	/**
	 * win method checks the human or computer win
	 * @param char
	 * @param checkBoard
	 */
	public static void win(char ch,char[][] checkBoard) {
		if(checkBoardVictory(ch,checkBoard)) {
			System.out.println("Win " +ch);
			for (int i = 0; i < checkBoard.length; i++) {
				for (int j = 0; j < checkBoard.length; j++) {
					System.out.print(checkBoard[i][j]+"\t");
				}
				System.out.println();
			}
			System.exit(0);
		}
		else
			System.out.println("Not Win  " +ch);
		return;
	}
	/**
	 * checkBoardVictory method will check which player is winner or not win yet any of them
	 * @param ch
	 * @param checkBoard
	 * @return {@value true/false}
	 */
	private static boolean checkBoardVictory(char ch,char[][] checkBoard) {
		return (rowVictory(ch, checkBoard)||columnVictory(ch, checkBoard)||diagonalVictory(ch, checkBoard));

	}
	/**
	 * diagonalVictory method check left and right diagonal victory
	 * @param ch
	 * @param checkboard
	 * @return true/false
	 */
	public static boolean diagonalVictory(char ch,char[][] checkboard) {
		int counterDiagonal=0;
		int counterDiagonalTwo=0;
		/*first diagonal */
		for (int i = 0,j=0; i < checkboard.length; i++,j++) {
			if(checkboard[i][j]==ch)
				counterDiagonal++;
			if(counterDiagonal==checkboard.length)
				return true;
		}
		/*second diagonal*/
		for (int i = 0,j=checkboard.length-1; i < checkboard.length; i++,j--) {
			if(checkboard[i][j]==ch)
				counterDiagonalTwo++;
			if(counterDiagonalTwo==checkboard.length)
				return true;
		}

		return false;
	}
	/**
	 * columnVictory method will check columnWise victory of player
	 * @param ch
	 * @param checkBoard
	 * @return true/false
	 */
	public static boolean columnVictory(char ch,char[][] checkBoard) {
		int counterCol=0;
		for (int i = 0; i < checkBoard.length; i++) {
			counterCol=0;
			for (int j = 0; j < checkBoard.length; j++) {
				if( checkBoard[j][i]==ch)
					counterCol++;
				if(counterCol==checkBoard.length)
					return true;
			}

		}
		return false;
	}
	/**
	 * rowVictory method checks rowWise victory of player
	 * @param ch
	 * @param checkBoard
	 * @return true/false
	 */
	public static boolean rowVictory(char ch,char[][] checkBoard) {
		int counterRow=0;

		for (int i = 0; i < checkBoard.length; i++) {
			counterRow=0;

			for (int j = 0; j < checkBoard.length; j++) {
				if( checkBoard[i][j]==ch)
					counterRow++;
				if(counterRow==checkBoard.length)
					return true;
			}

		}
		return false;
	}
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("please enter row and column to decide size of checkBoard");
		row=scanner.nextInt();
		col=scanner.nextInt();
		/*Initialize checkBoard */
		char[][] checkBoard=new char[row][col];
		for (int i = 0; i < checkBoard.length; i++) {
			for (int j = 0; j < checkBoard.length; j++) {
				checkBoard[i][j]='-';
			}
		}
		/* start ticTacToe game chaos */
		ticTacToeStart(checkBoard);

	}

}
