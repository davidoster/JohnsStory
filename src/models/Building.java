/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author user
 */
 public abstract class Building {
     private MainHouse mainHouse;
     private Garden garden;
     private Human human;
     private List<Animal> animals;
     // door
     
    public Building(){
        System.out.println("This is a building");
        
    }
    
    public MainHouse getMainHouse() {
        return(this.mainHouse);
    }
    
    public void setMainHouse(MainHouse mainHouse) {
        this.mainHouse = mainHouse;
    }
    
    public Garden getGarden() {
        return(this.garden);
    }
    
    public void setGarden(Garden garden) {
        this.garden = garden;
    }
    
    public void someMethod() {
        System.out.println("sdfsdf");
    }
    
    public abstract void someOtherMethod();
    abstract void someOtherMethod2();

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
