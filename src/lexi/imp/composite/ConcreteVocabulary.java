/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.composite;

import java.util.ArrayList;
import lexi.imp.iterator.Iterator;
import lexi.imp.iterator.VocabularyIterator;
import lexi.imp.visitor.Checker;

/**
 * @pattern Composite、Iterator、Visitor
 * @type Composite、ConcreteAggregate、ConcreteElement
 * @author Andy
 */
public class ConcreteVocabulary extends Content {

    ArrayList<Content> contents = new ArrayList<>();

    public void addChild(Content content) {
        this.contents.add(content);
    }

    public void removeChild(int index) {
        contents.remove(index);
    }

    public Content getChild(int index) {
        return contents.get(index);
    }

    public int getCount() {
        return contents.size();
    }

    @Override
    public void draw() {
        for (Content content : this.contents) {
            content.draw();
        }
    }

    @Override
    public void accept(Checker checker) {
        checker.visit(this);
    }

    @Override
    public Iterator createIterator() {
        return new VocabularyIterator(this);
    }
}
