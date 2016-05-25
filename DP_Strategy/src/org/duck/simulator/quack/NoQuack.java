/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.duck.simulator.quack;

/**
 *
 * @author Emil
 */
public class NoQuack implements QuackInterface{

    @Override
    public void quack() {
        System.out.println("I cannot quack");
    }
    
}
