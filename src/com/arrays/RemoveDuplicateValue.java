package com.arrays;

import java.util.HashSet;
import java.util.Set;

//write a program to remove duplicate elements from an array & display only unique elements.
public class RemoveDuplicateValue {

	public static void main(String[] args) {
              System.out.println("how many duplicate elements and unique value");
              int[] arr = {1, 2, 3, 3, 2, 1, 4};
              
           Set<Integer> uniqueSet = new HashSet<>();
            for (int num : arr) {
           	  uniqueSet.add(num);
             }
             System.out.println ("unique elements are : ");
              for(int num : uniqueSet) {
           	  System.out.println(num +"");
              }
              
	}

}
