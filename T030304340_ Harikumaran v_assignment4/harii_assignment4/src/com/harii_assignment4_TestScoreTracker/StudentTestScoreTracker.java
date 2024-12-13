package com.harii_assignment4_TestScoreTracker;

import java.util.ArrayList; 

import java.util.Scanner;

public class StudentTestScoreTracker {
	
    public static void main(String[] args) {
    	
        Scanner HK = new Scanner(System.in);
        
        System.out.print("Enter the number of test scores: ");  
        
        int n = HK.nextInt();
        
        int[] sA = new int[n];
        
        System.out.println("Enter the test scores  ");
        
        for (int i = 0; i < n; i++) {
        	
            sA[i] = HK.nextInt();
            
    }
        ArrayList<Integer> scoresList = new ArrayList<>();
        
        for (int score : sA) {
        	
            scoresList.add(score);    
        }
        
        System.out.println("Elements in the ArrayList:");
        for (int score : scoresList)  
        {
            System.out.println(score);
            
             }
        
        HK.close();
    }
}


