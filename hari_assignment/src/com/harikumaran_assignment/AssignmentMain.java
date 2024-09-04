package com.harikumaran_assignment;

import com.harikumaran.assignment.employees.Developer;
import com.harikumaran.assignment.employees.Manager;
import com.harikumaran.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
     
        Manager manager = new Manager();
        manager.setName("gokul");
        manager.setEmployeeId(1001);
        manager.setSalary(80000);
        manager.setDepartment("Sales");

        
        Developer developer = new Developer();
        developer.setName("hariii");
        developer.setEmployeeId(1002);
        developer.setSalary(60000);
        developer.setSkills("Java, Python, SQL"); 

        
        EmployeeUtilities.displayManagerInfo(manager);
        System.out.println();
        EmployeeUtilities.displayDeveloperInfo(developer);
        System.out.println();

       
    
    }
}