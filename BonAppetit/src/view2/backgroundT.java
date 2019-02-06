/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view2;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Novak
 */
public class backgroundT extends JPanel {
    private Image image;

    public backgroundT() {
        image = new ImageIcon(getClass().getResource("/image/backgroundT.png")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics gd = (Graphics2D) grphcs.create();
        gd.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        gd.dispose();
    }
}
