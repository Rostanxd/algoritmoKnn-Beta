/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Results {
    private ArrayList<Feature> code;    //  Code
    private float ave;  //  Average
    private int dist;   //  Distance
    private float coffPro; // coefficient proximity

    public Results(){}

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
     * @return the ave
     */
    public float getAve() {
        return ave;
    }

    /**
     * @param ave the ave to set
     */
    public void setAve(float ave) {
        this.ave = ave;
    }

    /**
     * @return the dist
     */
    public int getDist() {
        return dist;
    }

    /**
     * @param dist the dist to set
     */
    public void setDist(int dist) {
        this.dist = dist;
    }

    /**
     * @param coffPro the coffPro to set
     */
    public float getCoffPro() {
        return coffPro = ave + dist; //   Average + Distance
    }

}




