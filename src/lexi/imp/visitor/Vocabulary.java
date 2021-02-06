/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.visitor;

/**
 * @pattern Visitor
 * @type Element
 * @author Andy
 */
public interface Vocabulary {

    void accept(Checker checker);
}
