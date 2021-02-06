/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.decorator;


/**
 * @pattern Decorator
 * @type Decorator
 * @author Skwen
 */
public abstract class ScorllBarDecorator implements VisualComponent {

    private VisualComponent visualComponent;

    public ScorllBarDecorator(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }
}
