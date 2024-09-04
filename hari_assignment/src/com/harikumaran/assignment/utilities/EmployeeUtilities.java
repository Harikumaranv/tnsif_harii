package com.harikumaran.assignment.utilities;

import com.harikumaran.assignment.employees.Developer;
import com.harikumaran.assignment.employees.Employee;
import com.harikumaran.assignment.employees.Manager;

public class EmployeeUtilities {
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
      
        
    }

   
    public static void displayManagerInfo(Manager manager) {
        displayEmployeeInfo(manager);
        System.out.println("Department: " + manager.getDepartment());
    }

    public static void displayDeveloperInfo(Developer developer) {
        displayEmployeeInfo(developer);
        System.out.println("Skills: " + developer.getSkills());
}
}