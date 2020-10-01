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
public class Human {
    private String name;

    public Human(String name, String houseName) {
        this.name = name;
        System.out.println("This is the human " + this.name + " inside " + houseName); // inside the mainHouse
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
