package lexi.imp.abstractFactory;

import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 * @pattern AbstractFactory
 * @type ConcreteFactory
 * @author khalid
 */
public class DefaultScrollBarAbstractFactory implements ScrollBarAbstractFactory {

    @Override
    public BasicScrollBarUI getVerticalScrollBar() {
        return new SynthScrollBarUI();
    }

    @Override
    public BasicScrollBarUI getHorizontalScrollBar() {
        return new SynthScrollBarUI();
    }

}
