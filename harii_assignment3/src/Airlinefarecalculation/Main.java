package Airlinefarecalculation;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hk = new Scanner(System.in);

        
        int choice = hk.nextInt();
        
        int hours = hk.nextInt();
      
        double costPerHour = hk.nextDouble();

        double totalAmount = 0.0;

        
        switch (choice) {
            case 1:
                AirIndia airIndia = new AirIndia(hours, costPerHour);
                totalAmount = airIndia.calculateAmount();
                break;
            case 2:
                KingFisher kingFisher = new KingFisher(hours, costPerHour);
                totalAmount = kingFisher.calculateAmount();
                break;
            case 3:
                Indigo indigo = new Indigo(hours, costPerHour);
                totalAmount = indigo.calculateAmount();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        
        System.out.printf("%.2f%n", totalAmount);
    }
}