/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.duck.simulator.fly;

/**
 *
 * @author Emil
 */
public class NoFly implements FlyInterface{

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
    
}
