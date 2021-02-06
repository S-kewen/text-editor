/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.visitor;

import lexi.imp.composite.Alphabet;
import lexi.imp.composite.ConcreteVocabulary;

/**
 * @pattern Visitor
 * @type Visitor
 * @author Andy
 */
public interface Checker {

    void visit(ConcreteVocabulary concreteVocabulary);

    void visit(Alphabet alphabet);
}
