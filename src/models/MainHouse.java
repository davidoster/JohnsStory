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
public class MainHouse {
    String name;
    
    public MainHouse() {
        this.name = "This is the main house!";
        System.out.println(this.name);
        //this.setHuman(new Human("Johnny"));
    }
    
    public MainHouse(Human human) {
        this.name = "This is the main house!";
        System.out.println(this.name);
        human = new Human("Johnny", this.name); //new Human("Johnny", this.name) change overloaded constructor so it takes the name of the mainHouse
    }
    
    public MainHouse(Human human, List<Animal> animals) {
        this.name = "This is the main house!";
        System.out.println(this.name);
        human = new Human("Johnny", this.name); //new Human("Johnny", this.name) change overloaded constructor so it takes the name of the mainHouse
        animals = new ArrayList<Animal>();
        animals.add(new Animal("Ann", this.name));
    }
    
}
