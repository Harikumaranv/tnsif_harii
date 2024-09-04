package hari_assignment2_programs;

import java.util.Scanner;

class Commission {
    
    private String name;
    private String address;
    private String phone;
    private double salesAmount;
    private double commission;

    public void acceptDetails() {
        Scanner v = new Scanner(System.in);

        System.out.print("Enter Name: ");
         name = v.nextLine();

        System.out.print("Enter Address: ");
         address = v.nextLine();

        System.out.print("Enter Phone: ");
         phone = v.nextLine();

        System.out.print("Enter Sales Amount: ");
         salesAmount = v.nextDouble();
    }


    public void calculateCommission() {
        if (salesAmount >= 100000) 
        {
            commission = 0.10 * salesAmount;
        }
        else if (salesAmount >= 50000 && salesAmount < 100000)
        {
            commission = 0.05 * salesAmount;
        } 
        else if (salesAmount >= 30000 && salesAmount < 50000) 
        {
            commission = 0.03 * salesAmount;
        }
        else
        {
            commission = 0;
        }
    }

  
    public void displayDetails() {
        System.out.println("\nSales Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }
}

public class program2main  {
    public static void main(String[] args) {
        
        Student student = new Student();

        
        Commission Obj = new Commission();

       
        Obj.acceptDetails();
        Obj.calculateCommission();
    }
}

