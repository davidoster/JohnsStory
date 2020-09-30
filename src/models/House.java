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
public class House extends Building {
    
    public House() {
        System.out.println("This is the house!!!");
        this.setMainHouse(new MainHouse()); // house decides when the mainHouse is constructed
        this.setGarden(new Garden());
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
