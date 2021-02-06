package lexi.imp.abstractFactory;

import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 * @pattern AbstractFactory
 * @type ConcreteFactory
 * @author khalid
 */
public class RedScrollBarAbstractFactory implements ScrollBarAbstractFactory {

    @Override
    public BasicScrollBarUI getVerticalScrollBar() {
        return new RedVerticalScrollBar();
    }

    @Override
    public BasicScrollBarUI getHorizontalScrollBar() {
        return new RedHorizontalScrollBar();
    }
}
