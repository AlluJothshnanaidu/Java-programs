package com.javaprograms;
//guess the random number
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		int attempts = 0;
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int random = r.nextInt(10,20);
		System.out.println("generated number : "+random);

		do {
			
			
			
			System.out.println("welcome guess the number");
			int guess = sc.nextInt();
			if (random == guess) {
				System.out.println("yess u win ");
				break;
			}
			attempts++;
		} while (attempts < 3);
		if(attempts==3) {
			System.out.println("sorryy u lose");
		}
      sc.close();
	}

}
