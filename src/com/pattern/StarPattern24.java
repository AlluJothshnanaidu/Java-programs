package com.pattern;

public class StarPattern24 {


//		    public static void main(String[] args) {
//		        int i, j, k;
//		        int star = 1;
//		        int space = 7; // (2*n - 2) for n=5 → 8-2=6 or 7 based on look
//
//		        // Top half
//		        for (i = 1; i <= 5; i++) {
//
//		            // Left stars
//		            for (j = 1; j <= star; j++) {
//		                System.out.print("*");
//		            }
//
//		            // Spaces
//		            for (k = 1; k <= space; k++) {
//		                System.out.print(" ");
//		            }
//
//		            // Right stars
//		            for (j = 1; j <= star; j++) {
//		                System.out.print("*");
//		            }
//
//		            star++;
//		            space -= 2;
//
//		            System.out.println();
//		        }
//
//		        // Bottom half
//		        star = 4;
//		        space = 2;
//
//		        for (i = 1; i <= 4; i++) {
//
//		            // Left stars
//		            for (j = 1; j <= star; j++) {
//		                System.out.print("*");
//		            }
//
//		            // Spaces
//		            for (k = 1; k <= space; k++) {
//		                System.out.print(" ");
//		            }
//
//		            // Right stars
//		            for (j = 1; j <= star; j++) {
//		                System.out.print("*");
//		            }
//
//		            star--;
//		            space += 2;
//
//		            System.out.println();
//		        }
//		    }
//		
//	}

    public static void main(String[] args) {
        int n = 5;

        // Top half
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for (int i = n; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

