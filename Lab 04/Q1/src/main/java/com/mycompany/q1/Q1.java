/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.q1;

/**
 *
 * @author amind
 */
public class Q1 {

    public static void main(String[] args) {
        Employee e1 = new Employee();   
        Employee e2 = new Employee();  
        
        e1.setempName("Bogdan");    
        System.out.println("Employee name: "+ e1.getempName());  
        
        e1.setempID(214);  
        System.out.println("Employee ID: "+ e1.getempID());
        
        e1.setempDesignation("NY"); 
        System.out.println("Employee Designation: "+ e1.getempDesignation());
        
        e2.setempName("Bird");  
        System.out.println("Employee name: "+ e1.getempName());
        
        e2.setempID(456);    
        System.out.println("Employee ID: "+ e1.getempID()); 
        
        e2.setempDesignation("CA"); 
        System.out.println("Employee Designation: "+ e1.getempDesignation());
    }
}
    
