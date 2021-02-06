/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.strategy;

import javax.swing.JTextArea;

/**
 * @pattern Strategy
 * @type Strategy
 * @author Leo
 */
public interface FontStrategy {

    void execute(JTextArea j);
}
