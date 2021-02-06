/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.iterator;

/**
 * @pattern Iterator
 * @type iterator
 * @author Skwen
 */
public interface Iterator {

    void first();

    void end();

    int getCount();

    boolean hasNext();

    Object getNext();
}
