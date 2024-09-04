package hari_assignment2_programs;
import java.util.Scanner;

class Circle {
	
    public double radius;
    public String color;


    public void getIp() {
        Scanner hk = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = hk.nextDouble();
        hk.nextLine();

        System.out.print("Enter the colour of the circle: ");
        color = hk.nextLine();
    }

 
    public void cal() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}

public class program3 {
    public static void main(String[] args) {
 
        Circle KH = new Circle();

        KH.getIp();
        KH.cal();
       
		
    }
  
}