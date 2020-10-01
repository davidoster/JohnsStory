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
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("This is the animal " + this.name);
    }
    
    public Animal(String name, String houseName) {
        this.name = name;
        System.out.println("This is the animal " + this.name + " inside " + houseName);
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }
    
}
