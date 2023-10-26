package com.suruchi.demos;

import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		 int[] array = {1, 2, 3, 4, 5, 6, 7};
	        
		 System.out.println("Before Shuffling the elements are:");
		  for (int i : array) {
	            System.out.println(i + " ");
	        }
		 
		 shuffleArray(array);
		
		 
		 
	}

	public static void shuffleArray(int[] array) {
		int n = array.length;
        Random ran = new Random();
        
        for (int i = n - 1; i > 0; i--) {
            int j = ran.nextInt(i + 1);
            
          
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
        System.out.println("After Shuffling the elements are:");
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
		
	}


