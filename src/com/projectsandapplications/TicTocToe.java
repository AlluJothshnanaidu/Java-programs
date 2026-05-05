package com.projectsandapplications;
//0-0,1-1,0-1,2-2,0-2 = output
import java.util.Scanner;

public class TicTocToe {
	private static char CurrentPlayer = 'X';
	static char[][] board = new char[3][3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		initializeboard();
		while(true) {
			printboard();
			
			System.out.println("player "+CurrentPlayer+" enter row value");
			int row = sc.nextInt();
			System.out.println("player "+CurrentPlayer+" enter column value");
			int col = sc.nextInt();
			
			board[row][col] = CurrentPlayer; 
			CurrentPlayer = (CurrentPlayer == 'X')? 'O' :'X';

		}
		
	}

	static void initializeboard() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}

		}
	}

	static void printboard() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}

	}
	static boolean winrow() {
		for(int i=0;i<3;i++) {
			if(board[i][0]==CurrentPlayer &&
					board[i][1]==CurrentPlayer &&
					board[i][2]==CurrentPlayer) {
				return true;
			}
		}
		return false;
	}
		static boolean wincol() {
			for(int i=0;i<3;i++) {
				if(board[0][i]==CurrentPlayer &&
						board[1][i]==CurrentPlayer &&
						board[2][i]==CurrentPlayer) {
					return true;
				}
			
			}
			return false;
		}
		static boolean windig() {
			for(int i=0;i<3;i++) {
				
					if(board[0][0]==CurrentPlayer &&
					board[1][1]==CurrentPlayer &&
					board[2][2]==CurrentPlayer) {
				return true;
					}
			
				if(board[0][2]==CurrentPlayer &&
						board[1][1]==CurrentPlayer &&
						board[2][0]==CurrentPlayer) {
					return true;
				}
			
				}
			return false;
			}
		
		static boolean towin(){
			if(winrow()||wincol()||windig()) {
			return true;
				 
			}
			return false;
		}
   
	public static boolean isboardfull() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[i][j] == ' ')
					return false;
			}
			
		}
		return true;
	}
	

}

