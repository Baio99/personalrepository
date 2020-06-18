/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.objectsandclasses.model;

/**
 *
 * @author ADRIAN-PC
 */
public class Coop {

    private int id;
    private Chicken[] chickens;

    public void add(Chicken chicken) {

    }

    public void remove(int chickenId) {

    }

    public void resetInteration() {

    }

    public Chicken next() {
        return new Chicken(0, "Lucy", "white", 2, false);
    }
}
