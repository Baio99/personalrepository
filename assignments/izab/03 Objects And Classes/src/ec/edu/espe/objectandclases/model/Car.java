/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.objectandclases.model;

/**
 *
 * @author ADRIAN-PC
 */
public class Car {
    String brand; 
    String model;
    String color;
    int year;
    
    public void goAnywhere(){
        System.out.println("we are going anywhere in " +brand+" "+model);
    }
    
    public void turnOn (){
         System.out.println("started the car");
    }
    
    public void drive (){
         System.out.println("pay attention driving");
    }
    
}
