/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.objectsandclasses.model;

/**
 *
 * @author Adrian Iza
 */
public class Coop {
    private int id;
    private Chicken chickens[];

    public Coop(int id, Chicken[] chickens) {
        this.id = id;
        this.chickens = chickens;
    }
    
    
    public void add (Chicken chicken){
        chicken.setId(2);
        
        
    }
    
    public void remove(int chickenId){
        
    }
    
    public void resetIteration(){
        
    }
    
    public Chicken next(){
        return new Chicken(1,"Lucy","White",2,false);
    }
    
    
}
