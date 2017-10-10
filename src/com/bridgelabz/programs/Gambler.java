package com.bridgelabz.programs;

import java.util.Scanner;

public class Gambler {
	public static int goal,cash,stake,numberOfSimulation,win,lose;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the goal,stake and numberOfSimulation:");
		
		goal=scanner.nextInt();
		stake=scanner.nextInt();
		numberOfSimulation=scanner.nextInt();
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
		System.out.println("stake"+stake+" win"+win+" lose"+ lose);
		scanner.close();

	}

}
