/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view2.Credit;

/**
 *
 * @author Novak
 */
public class ControllerCredit implements ActionListener, Runnable {
    Credit c;

    public ControllerCredit() {
        c = new Credit();
        c.setResizable(false);
        c.getbBack().addActionListener(this);
        c.gettCredit().setText("");
        c.setVisible(true);
        
        Thread t = new Thread(this);
        t.start();
    }
    
    
    public void show() {
        try {
            c.gettCredit().append("           BON APPETIT \n \n \n");
            Thread.sleep(2000);
            c.gettCredit().append(" ...........DEVELOPER..........\n \n");
            Thread.sleep(1000);
            c.gettCredit().append("   MOVElution Lab. SCIENTIST :\n \n");
            Thread.sleep(1000);
            c.gettCredit().append("         CHEF DE CUISINE \n");
            Thread.sleep(1000);
            c.gettCredit().append("         UBASSY ABDILLAH \n \n");
            Thread.sleep(1000);
            c.gettCredit().append("            SOUS CHEF \n");
            Thread.sleep(1000);
            c.gettCredit().append("   MOHAMMAD ZAKIE FAIZ RAHIEMY \n \n");
            Thread.sleep(1000);
            c.gettCredit().append("          CHEF DE PARTE \n");
            Thread.sleep(1000);
            c.gettCredit().append("        RAJA RYAN PRADANA \n \n");
            Thread.sleep(1000);
            c.gettCredit().append("            DEMI CHEF \n");
            Thread.sleep(1000);
            c.gettCredit().append("        DZAKYTA AFUZAGANI \n \n \n");
            Thread.sleep(1000);
            c.gettCredit().append(" ........SPECIAL THANKS........\n \n");
            Thread.sleep(1000);
            c.gettCredit().append("          MASTER CHEF \n");
            Thread.sleep(1000);
            c.gettCredit().append("       ANDITYA ARIFIANTO \n \n");
            Thread.sleep(1000);
            c.gettCredit().append("    LOTS OF ASPRAK AND ASDOS \n \n");
            Thread.sleep(1000);
            c.gettCredit().append("   AND ESPECIALLY YOU, MY LOVE");
        } catch (Throwable f) {
            f.printStackTrace();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if (x.equals(c.getbBack())) {
            ControllerMainMenu cm = new ControllerMainMenu();
            
            c.dispose();
        }
    }

    @Override
    public void run() {
        this.show();
    }
    
}
