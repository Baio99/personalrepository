/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.InputStream;

/**
 *
 * @author Adrian
 */
public class Operator {
    
    private Float num;

    public Operator(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public Float getNum() {
        return num;
    }

    public void setNum(Float num) {
        this.num = num;
    }

    public Operator(Float num) {
        this.num = num;
    }

    

   
    
}
