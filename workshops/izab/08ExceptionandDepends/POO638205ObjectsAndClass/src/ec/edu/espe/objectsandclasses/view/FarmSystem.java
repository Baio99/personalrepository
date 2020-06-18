/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.objectsandclasses.view;

import ec.edu.espe.objectsandclasses.model.Chicken;
import ec.edu.espe.objectsandclasses.utils.FileManager;

/**
 *
 * @author ADRIAN-PC
 */
public class FarmSystem {
    public static void main(String[] args) {
        String fileName = "chicken.csv";
        Chicken chicken;
        chicken = new Chicken(1,"Lucy","white",2, false);
        System.out.println("Adrian Iza -->05ObjectsAndClasses <--");
        System.out.println(chicken);
        
        FileManager fileManager = new FileManager();
        
        fileManager.createFile(fileName);
        fileManager.writeString(chicken.generateCsvData(), fileName);
        System.out.println(fileManager.read(fileName));
        
    }
}