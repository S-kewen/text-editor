/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.bridge;

import javax.swing.JTextArea;

/**
 * @pattern Bridge
 * @type Implementor
 * @author Leo
 */
public abstract class DisplayImp {

    public abstract void rawOpen();

    public abstract void rawPrint();

    public abstract void rawClose();

    public abstract void printLine();
}
