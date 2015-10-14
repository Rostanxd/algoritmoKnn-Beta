/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class FeaturesValue implements Serializable{
    private String Features;
    private int value;
    
    public FeaturesValue(){
    
    }

    /**
     * @return the Features
     */
    public String getFeatures() {
        return Features;
    }

    /**
     * @param Features the Features to set
     */
    public void setFeatures(String Features) {
        this.Features = Features;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    
}
