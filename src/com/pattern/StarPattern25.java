package com.pattern;

public class StarPattern25 {


		    public static void main(String[] args) {
		        int i, j, k;
		        int star = 1;
		        int space = 7; // (2*n - 2) for n=5 → 8-2=6 or 7 based on look

		        // Top half
		        for (i = 1; i <= 5; i++) {

		            // Left stars
		            for (j = 1; j <= star; j++) {
		                System.out.print("*");
		            }

		            // Spaces
		            for (k = 1; k <= space; k++) {
		                System.out.print(" ");
		            }

		            // Right stars
		            for (j = 1; j <= star; j++) {
		                System.out.print("*");
		            }

		            star++;
		            space -= 2;

		            System.out.println();
		        }

		        // Bottom half
		        star = 4;
		        space = 2;

		        for (i = 1; i <= 4; i++) {

		            // Left stars
		            for (j = 1; j <= star; j++) {
		                System.out.print("*");
		            }

		            // Spaces
		            for (k = 1; k <= space; k++) {
		                System.out.print(" ");
		            }

		            // Right stars
		            for (j = 1; j <= star; j++) {
		                System.out.print("*");
		            }

		            star--;
		            space += 2;

		            System.out.println();
		        }
		    }
		
	

}
