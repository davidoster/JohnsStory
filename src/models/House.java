/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class House extends Building {
    
    public House() {
        super();
        System.out.println("This is the house!!!");
        List<Animal> animals = new ArrayList<Animal>();
        this.setAnimals(animals);
        this.setMainHouse(new MainHouse(this.getHuman(), this.getAnimals())); // house decides when the mainHouse is constructed
        this.setGarden(new Garden(this.getAnimals()));
    }

    @Override
    public void someOtherMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void someOtherMethod2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
