/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.duck.simulator;

import org.duck.simulator.fly.FlyNormaly;
import org.duck.simulator.quack.QuackNormaly;

/**
 *
 * @author Emil
 */
public class NormalDuck extends DuckAbstract{
    
    public NormalDuck() {
        
        this.quacking = new QuackNormaly();
        this.flying = new FlyNormaly();
        this.name = "Normal duck";
    }
    
}
