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
public class FeaturesString implements Serializable{
    private String FeaturesID;

    /**
     * @return the FeaturesID
     */
    public String getFeaturesID() {
        return FeaturesID;
    }

    /**
     * @param FeaturesID the FeaturesID to set
     */
    public void setFeaturesID(String FeaturesID) {
        this.FeaturesID = FeaturesID;
    }
}
