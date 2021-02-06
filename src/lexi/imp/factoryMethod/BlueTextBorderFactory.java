package lexi.imp.factoryMethod;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * @pattern FactoryMethod
 * @type ConcreteCreator
 * @author Khalid
 */
public class BlueTextBorderFactory implements TextBorderFactory {

    @Override
    public Border createBorder() {
        return BorderFactory.createLineBorder(Color.blue, 10);
    }
}
