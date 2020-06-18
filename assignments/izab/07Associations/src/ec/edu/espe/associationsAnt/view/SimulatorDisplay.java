/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associationsAnt.view;

import ec.edu.espe.associationsAnt.model.AntEater;
import ec.edu.espe.associationsAnt.model.Area;
import ec.edu.espe.associationsAnt.model.Colony;

/**
 *
 * @author adrian Iza
 */
public class SimulatorDisplay {
    static Area area = new Area();
    
    
    public static void main(String[] args){
        Colony colony = new Colony();
        AntEater antEater =new AntEater();
    
        area.setup();
        area.add(colony);
        area.add(antEater);
        
       
}
     public static void monitor(Area area){
        
    }
}
