/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Feature implements Serializable{
    private int ftr; 
    
    public Feature(){}
    
    /**
     * @return the ftr
     */
    public int getFtr() {
        return ftr;
    }

    /**
     * @param ftr the ftr to set
     */
    public void setFtr(int ftr) {
        this.ftr = ftr;
    }
}
