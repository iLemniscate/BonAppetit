/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import IOPackage.IOFile;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.*;
import view2.Play;

/**
 *
 * @author Novak
 */
public class ControllerPlay implements KeyListener, Runnable {

    Play play;
    Game game;
    Font field = new Font("Monospaced", Font.PLAIN, 13);
    Color maroon = new Color(128, 0, 0);
    IOFile file;

    public ControllerPlay() {
        file = new IOFile();
        play = new Play();
        game = new Game();
        play.setResizable(false);
        play.getFieldPlay().setFont(field);
        play.getFieldPlay().addKeyListener(this);
        play.getFieldPlay().setText("");
        play.setVisible(true);

        Thread t = new Thread(this);
        t.start();
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void display() {
        play.getFieldPlay().setText("");
        play.getFieldPlay().append("+");
        for (int l = 0; l < game.getM().getMap()[0].length; l++) {
            play.getFieldPlay().append("-");
        }
        play.getFieldPlay().append("+ \n");
        for (int i = 0; i < game.getM().getMap().length; i++) {
            play.getFieldPlay().append("|");
            for (int j = 0; j < game.getM().getMap()[i].length; j++) {
                if (game.getM().getMap()[i][j] == game.getAsset()[0]) {
                    play.getFieldPlay().append(game.getM().getMap()[i][j].toString());
                } else if (game.getM().getMap()[i][j] == null) {
                    play.getFieldPlay().append(" ");
                } else {
                    play.getFieldPlay().append(game.getM().getMap()[i][j].toString());
                }
            }
            play.getFieldPlay().append("| \n");
        }
        play.getFieldPlay().append("+");
        for (int l = 0; l < game.getM().getMap()[0].length; l++) {
            play.getFieldPlay().append("-");
        }
        play.getFieldPlay().append("+");

    }

    public void display2() {
        try {
            play.getFieldPlay().setText("");
            play.getFieldPlay().append("+");
            for (int l = 0; l < game.getM().getMap()[0].length; l++) {
                play.getFieldPlay().append("-");
            }
            play.getFieldPlay().append("+ \n");
            for (int i = 0; i < game.getM().getMap().length; i++) {
                play.getFieldPlay().append("|");
                for (int j = 0; j < game.getM().getMap()[i].length; j++) {
                    if (game.getM().getMap()[i][j] == game.getAsset()[0]) {
                        play.getFieldPlay().append(game.getM().getMap()[i][j].toString());
                    } else if (game.getM().getMap()[i][j] == null) {
                        play.getFieldPlay().append(" ");
                    } else {
                        play.getFieldPlay().append(game.getM().getMap()[i][j].toString());
                    }
                }
                play.getFieldPlay().append("| \n");
            }
            play.getFieldPlay().append("+");
            for (int l = 0; l < game.getM().getMap()[0].length; l++) {
                play.getFieldPlay().append("-");
            }
            play.getFieldPlay().append("+");
            Thread.sleep(700);
        } catch (NullPointerException e) {
            System.out.println("Null error, but its okay");
        } catch (Throwable f) {
            f.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Object a = e.getSource();
        if (a.equals(play.getFieldPlay())) {
            if (e.getKeyCode() == e.VK_E) {
                game.getAsset()[0].skill();
                if (game.isShow()==false) {
                    game.setShow(true);
                    display();
                    game.setShow(false);
                }
                play.getFieldStatus().setText("STATUS : SKILL ACTIVATED");
            } else if (e.getKeyCode() == e.VK_Q) {
                try {
                    file.saveFile(game.getAsset());
                    if (game.isShow()==false) {
                        game.setShow(true);
                        display();
                        game.setShow(false);
                    }
                    play.getFieldStatus().setText("STATUS : FILE SAVED");
                } catch (IOException ex) {
                    System.out.println("Save error");
                    JOptionPane.showMessageDialog(null, "Save Error");
                }
            } else if (e.getKeyCode() == e.VK_W) {
                if (game.getAsset()[0]!=null) {
                game.moving(game.getAsset()[0], 'w');
                game.getM().nullMap();
                for (int o = 0; o < game.getAsset().length; o++) {
                    game.getM().addAsset(game.getAsset()[o]);
                }
                for (int p = 1; p < game.getAsset().length; p++) {
                    if (game.getAsset()[p] != null) {
                        if (game.getAsset()[p].getPosY() == game.getAsset()[0].getPosY() && game.getAsset()[p].getPosX() == game.getAsset()[0].getPosX()) {
                            if (game.getAsset()[p].getLevel() <= game.getAsset()[0].getLevel()) {
                                game.removeAsset(p);
                            }
                        }
                    }
                }
                if (game.isShow()==false) {
                    game.setShow(true);
                    display();
                    game.setShow(false);
                }
                for (int i = 1; i < game.getAsset().length; i++) {
                    if (game.getAsset()[i] == null) {
                        game.setDead(game.getDead() + 1);
                    }
                }
                if (game.isRun()==false) {
                    ControllerMainMenu mm = new ControllerMainMenu();
                    play.dispose();
                }
                if (game.getDead() == game.getAsset().length - 1) {
                    game.setWin(true);
                    game.setRun(false);
                    play.getFieldStatus().setText("STATUS : YOU WIN!");
                    JOptionPane.showMessageDialog(null, "YOU WIN!");
                } else {
                    play.getFieldStatus().setText("STATUS : ENEMY LEFTOVER = " + (game.getAsset().length - game.getDead() - 1));
                    game.setDead(0);
                }
                }
            } else if (e.getKeyCode() == e.VK_S) {
                if (game.getAsset()[0]!=null) {
                game.moving(game.getAsset()[0], 's');
                game.getM().nullMap();
                for (int o = 0; o < game.getAsset().length; o++) {
                    game.getM().addAsset(game.getAsset()[o]);
                }
                for (int p = 1; p < game.getAsset().length; p++) {
                    if (game.getAsset()[p] != null) {
                        if (game.getAsset()[p].getPosY() == game.getAsset()[0].getPosY() && game.getAsset()[p].getPosX() == game.getAsset()[0].getPosX()) {
                            if (game.getAsset()[p].getLevel() <= game.getAsset()[0].getLevel()) {
                                game.removeAsset(p);
                            }
                        }
                    }
                }
                if (game.isShow()==false) {
                    game.setShow(true);
                    display();
                    game.setShow(false);
                }
                for (int i = 1; i < game.getAsset().length; i++) {
                    if (game.getAsset()[i] == null) {
                        game.setDead(game.getDead() + 1);
                    }
                }
                if (game.isRun()==false) {
                    ControllerMainMenu mm = new ControllerMainMenu();
                    play.dispose();
                }
                if (game.getDead() == game.getAsset().length - 1) {
                    game.setWin(true);
                    game.setRun(false);
                    play.getFieldStatus().setText("STATUS : YOU WIN!");
                    JOptionPane.showMessageDialog(null, "YOU WIN!");
                } else {
                    play.getFieldStatus().setText("STATUS : ENEMY LEFTOVER = " + (game.getAsset().length - game.getDead() - 1));
                    game.setDead(0);
                }
                }
            } else if (e.getKeyCode() == e.VK_A) {
                if (game.getAsset()[0]!=null) {
                game.moving(game.getAsset()[0], 'a');
                game.getM().nullMap();
                for (int o = 0; o < game.getAsset().length; o++) {
                    game.getM().addAsset(game.getAsset()[o]);
                }
                for (int p = 1; p < game.getAsset().length; p++) {
                    if (game.getAsset()[p] != null) {
                        if (game.getAsset()[p].getPosY() == game.getAsset()[0].getPosY() && game.getAsset()[p].getPosX() == game.getAsset()[0].getPosX()) {
                            if (game.getAsset()[p].getLevel() <= game.getAsset()[0].getLevel()) {
                                game.removeAsset(p);
                            }
                        }
                    }
                }
                if (game.isShow()==false) {
                    game.setShow(true);
                    display();
                    game.setShow(false);
                }
                for (int i = 1; i < game.getAsset().length; i++) {
                    if (game.getAsset()[i] == null) {
                        game.setDead(game.getDead() + 1);
                    }
                }
                if (game.isRun()==false) {
                    ControllerMainMenu mm = new ControllerMainMenu();
                    play.dispose();
                }
                if (game.getDead() == game.getAsset().length - 1) {
                    game.setWin(true);
                    game.setRun(false);
                    play.getFieldStatus().setText("STATUS : YOU WIN!");
                    JOptionPane.showMessageDialog(null, "YOU WIN!");
                } else {
                    play.getFieldStatus().setText("STATUS : ENEMY LEFTOVER = " + (game.getAsset().length - game.getDead() - 1));
                    game.setDead(0);
                }
                }
            } else if (e.getKeyCode() == e.VK_D) {
                if (game.getAsset()[0]!=null) {
                game.moving(game.getAsset()[0], 'd');
                game.getM().nullMap();
                for (int o = 0; o < game.getAsset().length; o++) {
                    game.getM().addAsset(game.getAsset()[o]);
                }
                for (int p = 1; p < game.getAsset().length; p++) {
                    if (game.getAsset()[p] != null) {
                        if (game.getAsset()[p].getPosY() == game.getAsset()[0].getPosY() && game.getAsset()[p].getPosX() == game.getAsset()[0].getPosX()) {
                            if (game.getAsset()[p].getLevel() <= game.getAsset()[0].getLevel()) {
                                game.removeAsset(p);
                            }
                        }
                    }
                }
                if (game.isShow()==false) {
                    game.setShow(true);
                    display();
                    game.setShow(false);
                }
                for (int i = 1; i < game.getAsset().length; i++) {
                    if (game.getAsset()[i] == null) {
                        game.setDead(game.getDead() + 1);
                    }
                }
                if (game.isRun()==false) {
                    ControllerMainMenu mm = new ControllerMainMenu();
                    play.dispose();
                }
                if (game.getDead() == game.getAsset().length - 1) {
                    game.setWin(true);
                    game.setRun(false);
                    play.getFieldStatus().setText("STATUS : YOU WIN!");
                    JOptionPane.showMessageDialog(null, "YOU WIN!");
                    System.out.println("Play Status : You Win");
                } else {
                    play.getFieldStatus().setText("STATUS : ENEMY LEFTOVER = " + (game.getAsset().length - game.getDead() - 1));
                    game.setDead(0);
                }
                }
            } else if (e.getKeyCode() == e.VK_0) {
                ControllerMainMenu mm = new ControllerMainMenu();
                game.setRun(false);
                play.dispose();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (game.isRun()) {
            for (int s = 1; s < game.getAsset().length; s++) {
                if (game.getAsset()[s] != null) {
                    game.moving(game.getAsset()[s]);
                }
            }
            game.getM().nullMap();
            for (int b = 1; b < game.getAsset().length; b++) {
                if (game.getAsset()[b] != null) {
                    for (int c = 0; c < game.getAsset().length; c++) {
                        if (game.getAsset()[c] != null && game.getAsset()[b] != null) {
                            if (game.getAsset()[c] != game.getAsset()[b]) {
                                if (game.getAsset()[b].getPosY() == game.getAsset()[c].getPosY() && game.getAsset()[b].getPosX() == game.getAsset()[c].getPosX()) {
                                    if (game.getAsset()[b].getLevel() >= game.getAsset()[c].getLevel()) {
                                        game.removeAsset(c);
                                    } else {
                                        game.removeAsset(b);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int o = 0; o < game.getAsset().length; o++) {
                if (game.getAsset()[o] != null) {
                    game.getM().addAsset(game.getAsset()[o]);
                }
            }
            if (game.isShow()==false) {
                game.setShow(true);
                this.display2();
                game.setShow(false);
            }
            if (game.getAsset()[0] == null) {
                game.setRun(false);
                play.getFieldStatus().setText("STATUS : YOU LOSE!");
                JOptionPane.showMessageDialog(null, "You Lose, but its ok");
                System.out.println("You Lose, but its ok");
                ControllerMainMenu mm = new ControllerMainMenu();
                play.dispose();
            }
            for (int i = 1; i < game.getAsset().length; i++) {
                if (game.getAsset()[i] == null) {
                    game.setDead(game.getDead() + 1);
                }
            }
            
            if (game.getDead() == game.getAsset().length - 1) {
                game.setRun(false);
                game.setWin(true);
            } else {
                play.getFieldStatus().setText("STATUS : ENEMY LEFTOVER = " + (game.getAsset().length - game.getDead() - 1));
                game.setDead(0);
            }
            System.out.print("Play Status : ");
            for (int i=0; i<game.getAsset().length; i++) {
                System.out.print(game.getAsset()[i]+" ");
            }
            System.out.println();
        }

    }

}
