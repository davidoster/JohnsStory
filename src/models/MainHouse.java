/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author user
 */
public class MainHouse {
    String name;
    
    public MainHouse() {
        System.out.println("This is the main house!");
        //this.setHuman(new Human("Johnny"));
    }
    
    public MainHouse(Human human) {
        System.out.println("This is the main house!");
        human = new Human("Johnny"); //new Human("Johnny", this.name) change overloaded constructor so it takes the name of the mainHouse
    }
    
}
