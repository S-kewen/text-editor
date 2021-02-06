/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.command;

import javax.swing.JTextArea;

/**
 * @pattern Command
 * @type Command
 * @author Skwen
 */
public interface EditCommand {

    public void execute(JTextArea jTextArea);
}
