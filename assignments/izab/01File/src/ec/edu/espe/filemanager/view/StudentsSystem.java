/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanager.view;

import ec.edu.espe.filemanager.controller.Students;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ADRIAN-PC
 */
public class StudentsSystem {
public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Students Data ");
        System.out.println(" Adrian Iza");
        System.out.println(" NRC 3191");
        

        Students students = new Students();

        Students.mainStudents();

    }
}