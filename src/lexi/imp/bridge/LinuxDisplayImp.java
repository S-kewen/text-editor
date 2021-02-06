/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.bridge;

/**
 * @pattern Bridge
 * @type ConcreteImplementot
 * @author Leo
 */
public class LinuxDisplayImp extends DisplayImp {

    private String str;
    private int width;

    public LinuxDisplayImp(String str) {
        this.str = str;
        this.width = str.getBytes().length;
    }

    public void rawOpen() {
        printLine();
    }

    public void rawPrint() {
        System.out.println(str);
    }

    public void rawClose() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

}
