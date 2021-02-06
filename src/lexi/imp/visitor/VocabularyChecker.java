/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.visitor;

import java.io.BufferedReader;
import java.io.FileReader;
import lexi.imp.composite.ConcreteVocabulary;
import lexi.imp.composite.Alphabet;

/**
 * @pattern Visitor
 * @type ConcreteVisitor
 * @author Andy
 */
public class VocabularyChecker implements Checker {

    @Override
    public void visit(ConcreteVocabulary concreteVocabulary) {
        try {
            BufferedReader dictReader = new BufferedReader(new FileReader("dictionary.txt"));
            String dictInput;
            String s = "";
            String v = "";
            boolean result = false;

            for (int i = 0; i < concreteVocabulary.getCount(); i++) {
                s += ((Alphabet) concreteVocabulary.getChild(i)).getText();
                v += ((Alphabet) concreteVocabulary.getChild(i)).getText();
                if (i == 0) {
                    s = s.substring(0).toLowerCase();
                }
            }

            while ((dictInput = dictReader.readLine()) != null) {
                if (s.equals(dictInput)) {
                    result = true;
                }
            }

            if (!result) {
                System.out.println("'" + v + "' is a wrong word.");
            }

            dictReader.close();
        } catch (Exception e) {

        }
    }

    @Override
    public void visit(Alphabet alphabet) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
