package com.arrays;

public class SumAndAverage {

	public static void main(String[] args) {
            int [] marks = {61, 65, 58, 45, 72, 63};
            
            int sum = 0;
            int avg = 0;
            
            for(int i=0;i<marks.length;i++) {
            	sum = sum+marks[i];
            }
            System.out.println("sum of the marks : "+sum);
            
            avg = sum/marks.length;
            System.out.println("avg of the elements : "+avg);
	}

}
