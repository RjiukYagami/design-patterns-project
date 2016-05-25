/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.duck.simulator;

import org.duck.simulator.fly.NoFly;
import org.duck.simulator.quack.NoQuack;

/**
 *
 * @author Emil
 */
public class WoodenDuck extends DuckAbstract {
    
    public WoodenDuck() {
        
        this.quacking = new NoQuack();
        this.flying = new NoFly();
        this.name = "Wooden duck";
    }
    
}
