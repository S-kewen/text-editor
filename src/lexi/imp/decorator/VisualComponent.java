/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.decorator;

import javax.swing.JScrollPane;

/**
 * @pattern Decorator
 * @type Component
 * @author Skwen
 */
public interface VisualComponent {

    JScrollPane draw(JScrollPane jScrollPane);

    JScrollPane undraw(JScrollPane jScrollPane);
}
