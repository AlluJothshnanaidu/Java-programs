package com.arrays;

//import java.util.Scanner;


public class FindDuplicates {

	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);

//		int [] arr= new int[3];
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("enter ele : ");
//			arr[i]=sc.nextInt();
//		}
		int[] arr = { 10, 20, 10, 40, 20, 50, 10 };
		boolean[] visited = new boolean[arr.length];
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == false) {
				visited[i] = true;
//				int count = 0;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						visited[j] = true;
					}
				}
				if (count > 0) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
