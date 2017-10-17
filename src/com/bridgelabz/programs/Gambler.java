package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class Gambler {
	public static int goal,cash,stake,numberOfSimulation;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the goal,stake and numberOfSimulation:");
		
		goal=scanner.nextInt();
		stake=scanner.nextInt();
		numberOfSimulation=scanner.nextInt();
		Utility.gambler(goal,stake,numberOfSimulation);
		scanner.close();

	}

}
