/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.decorator;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 * @pattern Decorator
 * @type ConcreteDecorator
 * @author Skwen
 */
public class VerticalScorllBarDecorator extends ScorllBarDecorator {

    public VerticalScorllBarDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    public JScrollPane draw(JScrollPane jScrollPane) {
        System.out.println("Vertical scroll bar added!");
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        return jScrollPane;
    }

    @Override
    public JScrollPane undraw(JScrollPane jScrollPane) {
        System.out.println("Vertical scroll bar removed!");
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        return jScrollPane;
    }

}
