package com.test.jq.inclassassignment06;

import java.io.Serializable;

/**
 * Created by IBM on 1/03/2018.
 */

public class Animal implements Serializable {
    private String name; //member variable
    private int legNumber;
    private boolean hasFur;
    private String habitat;


    public Animal(String name,int legNumber, boolean hasFur,String habitat){
        this.name = name;
        this.legNumber = legNumber;
        this.hasFur = hasFur;
        this.habitat = habitat;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public int getLegNumber() {
//        return legNumber;
//    }
//
//    public void setLegNumber(int legNumber) {
//        this.legNumber = legNumber;
//    }
//
//    public boolean isHasFur() {
//        return hasFur;
//    }
//
//    public void setHasFur(boolean hasFur) {
//        this.hasFur = hasFur;
//    }


    public String toString(){
        return "Animal Name/Type: "+ name + "\nNumber of legs: "+ legNumber + "\nDoes it has fur? "
                + hasFur + "\nHabitat: " + habitat;
    }

}
