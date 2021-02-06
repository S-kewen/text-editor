/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.imp.bridge;

/**
 * @pattern Bridge
 * @type RefindedAbstraction
 * @author Leo
 */
public class ConsoleDisplay extends Display {

    private DisplayImp consoleDisplayImp;

    public ConsoleDisplay(DisplayImp consoleDisplayImp) {
        this.consoleDisplayImp = consoleDisplayImp;
    }

    @Override
    void open() {
        consoleDisplayImp.rawOpen();
    }

    @Override
    void print() {
        consoleDisplayImp.rawPrint();
    }

    @Override
    void close() {
        consoleDisplayImp.rawClose();
    }

    @Override
    public void display() {
        open();
        print();
        close();
    }

}
