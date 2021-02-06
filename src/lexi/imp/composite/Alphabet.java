/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.composite;

import lexi.imp.iterator.Iterator;
import lexi.imp.visitor.Checker;

/**
 * @pattern Composite、Visitor
 * @type Leaf、ConcreteElement
 * @author Andy
 */
public class Alphabet extends Content {

    private char c;

    public Alphabet(char c) {
        this.c = c;
    }

    public char getText() {
        return this.c;
    }

    @Override
    public void draw() {
        System.out.print(c);

    }

    @Override
    public void accept(Checker checker) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
