/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.objectsandclasses.view;

import ec.edu.espe.objectsandclasses.model.Chicken;
import ec.edu.espe.objectsandclasses.utils.FileManager;
import java.util.Collection;

/**
 *
 * @author Adrian Iza
 */
public class FarmSystem {
        public static void main(String[] args) {
        String fileName = "chikens.cvs";
        
        Chicken chicken = new Chicken(1,"lucy","white",2,false);
        chicken.toString();
        System.out.println("Adrian Iza -->12ConstructorsAndArrais");
        System.out.println(chicken);
        
        Chicken chicken2;
        chicken2 = new Chicken("maria", "black", 1, true);
        System.out.println("chicken 2-> " +chicken2);
        /*
        FileManager fileManager = new FileManager();
        
        fileManager.createFile(fileName);
        fileManager.writeString(chicken.generateCvsData(),fileName);
        System.out.println(fileManager.read(fileName));
        
        
        //chicken.id=4;
        //chicken.name="Lucia";
        /*
        chicken.setId(0);
        chicken.setName("lucia");
        System.out.println(chicken.getName());
        */    
        Chicken chicken3 = new Chicken("mariana", "brown", 1, true);
        System.out.println("chicken 4-> " +chicken3);
        
        Chicken chicken4 = new Chicken("maruja", "brown", 1, false);
        System.out.println("chicken 4-> " +chicken4);
            
        Chicken chicken5 = new Chicken("maria", "black", 1, true);
    
        System.out.println("chicken 5-> " +chicken5);
            
        System.out.println("indexCounter -> " + chicken5.getIndexCounter());
    
        Chicken chicken6 = new Chicken("junior", "white", 2, false);
        System.out.println("chicken 6-> " +chicken6);
        System.out.println("indexCounter -> " + chicken.getIndexCounter());
        
        int coopMaxSize = 20;
        Chicken[] chickens = new Chicken[coopMaxSize];
        
        for(int j=0; j < coopMaxSize; j++){
            chickens[j] = new Chicken("chicken_" + (j+1), "white" +j , j, true);
            }
        for(int i=0; i < coopMaxSize; i++){
            System.out.println("chiken " + (i+1) + "-->" + chickens[i]);
            }
        int coopMaxSise2 = 5;
        Chicken[] chickens2 = new Chicken[coopMaxSise2];    
        
         for(int j=0; j < coopMaxSise2; j++){
            chickens[j] = new Chicken("chicken_" + (j+1), "white" +j , j, true);
            }
        for(int i=0; i < coopMaxSise2; i++){
            System.out.println("chiken " + (i+1) + "-->" + chickens[i]);
            
        }
        
        }
        
}
        