/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.objectsandclasses.view;

import ec.edu.espe.objectsandclasses.model.Chicken;

/**
 *
 * @author ADRIAN-PC
 */
public class FarmSystem {

    public static void main(String[] args) {
        Chicken chicken = new Chicken(1, "Lucy", "white", 2, false);
        System.out.println("AdrianIza ----> 05ObjectsAndClasses <---");
        System.out.println(chicken.toString());
    }
}
