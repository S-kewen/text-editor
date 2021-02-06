/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.iterator;

import lexi.imp.composite.ConcreteVocabulary;

/**
 * @pattern Iterator
 * @type ConcreteIterator
 * @author Skwen
 */
public class VocabularyIterator implements Iterator {

    private ConcreteVocabulary concreteVocabulary;
    private int index = 0;

    public VocabularyIterator(ConcreteVocabulary concreteVocabulary) {
        this.concreteVocabulary = concreteVocabulary;
        index = 0;
    }

    @Override
    public int getCount() {
        return concreteVocabulary.getCount();
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void end() {
        index = concreteVocabulary.getCount() - 1;
    }

    @Override
    public boolean hasNext() {
        return concreteVocabulary.getCount() > index;
    }

    @Override
    public Object getNext() {

        return concreteVocabulary.getChild(index++);
    }

}
