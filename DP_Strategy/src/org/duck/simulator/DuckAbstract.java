/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.duck.simulator;

import org.duck.simulator.fly.FlyInterface;
import org.duck.simulator.quack.QuackInterface;

/**
 *
 * @author Emil
 */
public class DuckAbstract {
    protected QuackInterface quacking;
    protected FlyInterface flying;
    protected String name;
    
    public void doQuack() {
        System.out.print(name + " : ");
        quacking.quack();
    }
    
    public void doFly() {
        System.out.print(name + " : ");
        flying.fly();
    }
    
    public void setQuacking(QuackInterface quacking) {
        this.quacking = quacking;
    }
    
    public void setFlying(FlyInterface flying) {
        this.flying = flying;
    }
    
 }
