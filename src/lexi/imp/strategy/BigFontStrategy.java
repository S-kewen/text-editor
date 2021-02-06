/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.strategy;

import java.awt.Font;
import javax.swing.JTextArea;

/**
 * @pattern Strategy
 * @type ConcreteStrategy
 * @author Leo
 */
public class BigFontStrategy implements FontStrategy {

    @Override
    public void execute(JTextArea jTextArea) {
        System.out.println("Big");
        Font font = new Font("Monospaced", 1, 20);
        jTextArea.setFont(font);
    }
}
