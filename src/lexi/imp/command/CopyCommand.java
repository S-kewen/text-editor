/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.command;

import javax.swing.JTextArea;

/**
 * @pattern Command
 * @type ConcreteCommand
 * @author Skwen
 */
public class CopyCommand implements EditCommand {

    @Override
    public void execute(JTextArea jTextArea) {
        jTextArea.copy();
        System.out.println("Command: copy");
    }

}
