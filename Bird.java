/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamples;

/**
 *
 * @author Ashley
 */
public class Bird {
    //the Bird class has
    //three fields
    public int feathers;
    public int wings;
    public int beak;
    
    //the Bird class has
    //four constructor
    public Bird(int startFeathers, int startWings, int startBeak) {
        feathers = startFeathers;
        wings = startWings;
        beak = startBeak;
    }
    //the Bird class has
    //four methods
    public void setFeathers(int newValue) {
        feathers = newValue;
    }
    public void setWings(int newValue) {
        wings = newValue;
    }
    public void setBeak(int newValue){
        beak = newValue;
    }
}
public class Eagle extends Bird {
    //the Eagle subclass has
    //one field
    public int wingSpand;
    
    //the Eagle subclass has
    //one constructor
    public Eagle(int startSpand, int startFeathers, int startWings, int startBeak) {
        super(startFeathers, startWings, startBeak);
        wingSpand = startSpand;
    }        
        //the Eagle sublcass has
        //one method
        public void setSpand(int newValue) {
            wingSpand = newValue;
    }
}

