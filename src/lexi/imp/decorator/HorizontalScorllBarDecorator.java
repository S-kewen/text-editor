/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.decorator;

/**
 * @pattern Decorator
 * @type ConcreteDecorator
 * @author Skwen
 */
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class HorizontalScorllBarDecorator extends ScorllBarDecorator {

    public HorizontalScorllBarDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    public JScrollPane draw(JScrollPane jScrollPane) {
        System.out.println("Horizontal scroll bar added!");
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        return jScrollPane;

    }

    @Override
    public JScrollPane undraw(JScrollPane jScrollPane) {
        System.out.println("Horizontal scroll bar removed!");
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        return jScrollPane;
    }

}
