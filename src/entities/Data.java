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
public class Data implements Serializable{
    private ArrayList<Feature> code;
    private int value;

    public Data() {}

    /**
     * @return the code
     */
    public ArrayList<Feature> getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(ArrayList<Feature> code) {
        this.code = code;
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
