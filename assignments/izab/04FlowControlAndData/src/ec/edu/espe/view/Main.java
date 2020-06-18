/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;
//package ec.edu.espe.view;

import ec.edu.espe.controller.MathOperation;
import ec.edu.espe.model.Operator;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */


public class  Main {
      
    
    public static void main(String[] args ){
        
        Scanner reader = new Scanner(System.in);
        float n1,n2, result;  
        String val1, val2;
        
        Scanner Ing = new Scanner(System.in);
        
        System.out.println(" Program to subtract 2 numbers \n");
        do{            
            System.out.println("Enter the first number: ");
            val1=Ing.nextLine();
        }while(!(isNumeric(val1)));        
        Operator number1 = new Operator(Float.parseFloat(val1));        
        do{
            System.out.println("Enter the second number(tipo float): ");
            val2=Ing.nextLine();
        }while(!(isNumeric(val2)));
        Operator number2 = new Operator(Float.parseFloat(val2));
        
        MathOperation m = new MathOperation();
        System.out.println("result: " + m.substrat(number1.getNum(),number2.getNum())) ;
                
    }
    
    
    public static boolean isNumeric(String cadena){
	try {
		Float.parseFloat(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }  

   
   
    
}
