package lexi.imp.strategy;

import java.awt.Font;
import javax.swing.JTextArea;

/**
 * @pattern Strategy
 * @type ConcreteStrategy
 * @author Leo
 */
public class MediumFontStrategy implements FontStrategy {

    @Override
    public void execute(JTextArea jTextArea) {
        System.out.println("Medium");
        Font font = new Font("Monospaced", 1, 13);
        jTextArea.setFont(font);
    }
}
