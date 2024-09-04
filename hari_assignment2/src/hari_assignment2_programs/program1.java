package hari_assignment2_programs;
import java.util.Scanner;
public class program1 {
	

	
	    public static void main(String[] args) {
	      
	        Scanner HK = new Scanner(System.in);

	       
	        System.out.print("Enter your Full Name ");
	        String fullName = HK.nextLine();

	        System.out.print("Enter your Roll Number: ");
	        String rollNumber = HK.nextLine();

	        System.out.print("Enter your Grade: ");
	        String grade = HK.nextLine();

	        System.out.print("Enter your Percentage: ");
	        String percentage = HK.nextLine();

	        System.out.println("\nSample Output:");
	        
	        System.out.println(fullName);
	        
	        System.out.println(rollNumber);
	        
	        System.out.println("\t" + grade);
	        
	        System.out.println("\t" + percentage);

	       
	    }
	}

