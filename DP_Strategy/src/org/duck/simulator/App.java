/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.duck.simulator;

import org.duck.simulator.fly.FlyNormaly;

/**
 *
 * @author Emil
 */
public class App {
    
    static public void main(String[] args) {
        
        DuckAbstract duck = new NormalDuck();
        
        duck.doQuack();
        duck.doFly();
        
        duck = new WoodenDuck();
        
        duck.doQuack();
        duck.doFly();
        
        duck.setFlying(new FlyNormaly());
        
        duck.doFly();
        
    }
    
}
