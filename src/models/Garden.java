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
public class Garden {
    String name;
    
    public Garden() {
        this.name = "garden";
        System.out.println("This is the " + this.name);
    }
    
    public Garden(List<Animal> animals) {
        this();
        Animal animal = new Animal("Tom", this.name);
        animals.add(animal);
        System.out.println(animals);
    }
    
}
