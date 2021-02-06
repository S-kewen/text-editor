package lexi.imp.abstractFactory;

import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 * @pattern AbstractFactory
 * @type Factory
 * @author khalid
 */
public interface ScrollBarAbstractFactory {

    BasicScrollBarUI getVerticalScrollBar();

    BasicScrollBarUI getHorizontalScrollBar();
}
