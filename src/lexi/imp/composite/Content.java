/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.composite;

import lexi.imp.iterator.Iterator;
import lexi.imp.visitor.Vocabulary;

/**
 * @pattern Composite、Iterator
 * @type Component、Aggregate
 * @author Andy
 */
abstract public class Content implements Vocabulary {

    public abstract void draw();

    public abstract Iterator createIterator();

    public void addChild(Content content) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeChild(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Content getChild(int index) {
        return null;
    }

    public int getCount() {
        return 0;
    }

}
