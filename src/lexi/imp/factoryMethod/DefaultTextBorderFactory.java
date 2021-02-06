package lexi.imp.factoryMethod;

import javax.swing.*;
import javax.swing.border.Border;

/**
 * @pattern FactoryMethod
 * @type ConcreteCreator
 * @author Khalid
 */
public class DefaultTextBorderFactory implements TextBorderFactory {

    @Override
    public Border createBorder() {
        return BorderFactory.createEmptyBorder();
    }
}
