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
public class Chicken {
    
    private static int indexCounter=1000;
    private int id;
     private String name;
     private String color;
     private int age;
     private boolean isMolting;
     
    public Chicken() {
        this.id = 0;
        this.name = null;
        this.color = null;
        this.age = 0;
        this.isMolting =false;
    }
          
    public Chicken(int id, String name, String color, int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
    }
    
    public Chicken(String name, String color, int age, boolean isMolting) {
        
        this.id=indexCounter +1;
        this.indexCounter = this.indexCounter+1;

        
        
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
    }
 
    
    public void doSuftt(int fotTime){
        cluck();
        wander();
        eat();
        drink();
        poop();
        layAndEgg();
    }
    
    private void cluck(){
        System.out.println("The chicken" + getName() + "is clucking");
    }
    
    private void wander(){
        System.out.println("The chicken" + getName() + "is wandering");
    }
    
    private void eat(){
        System.out.println("The chicken" + getName() + "of color " + getColor() +
                "and age" + getAge() + "is eating");
    }
    
    private void drink(){
        System.out.println("The chicken" + getName() + "is driking");
    }
    
    private Poop poop(){
        Poop poopObject = new Poop(); //instance of Poop
        System.out.println("The chicken" + getName() + "is driking");
        return poopObject;
    }
    
    private Egg layAndEgg(){
        Egg egg = new Egg(1);
        if(!isIsMolting()){
            System.out.println("The chicken" + getName() + "is lay And Egg");
            return egg;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + 
                ", color=" + getColor() + ", age=" + getAge() + 
                ", isMolting=" + isIsMolting() + '}';
    }
    
    public String generateCvsData(){
        return getId() + "," + getName() + "," + getColor() + "," + getAge() + "," + isIsMolting();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public static int getIndexCounter() {
        return indexCounter;
    }

    public static void setIndexCounter(int indexCounter) {
        Chicken.indexCounter = indexCounter;
        
    }
}