package lexi.imp.strategy;

import java.awt.Font;
import javax.swing.JTextArea;

/**
 * @pattern Strategy
 * @type ConcreteStrategy
 * @author Leo
 */
public class SmallFontStrategy implements FontStrategy {

    @Override
    public void execute(JTextArea jTextArea) {
        System.out.println("small");
        Font font = new Font("Monospaced", 1, 10);
        jTextArea.setFont(font);
    }

}
