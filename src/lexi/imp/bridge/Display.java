/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.bridge;

/**
 * @pattern Bridge
 * @type Abstraction
 * @author Leo
 */
public abstract class Display {

    abstract void open();

    abstract void print();

    abstract void close();

    abstract void display();
}
