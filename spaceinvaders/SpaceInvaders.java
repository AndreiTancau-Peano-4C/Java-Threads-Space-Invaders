/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author tancau.andrei
 */
public class SpaceInvaders extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    public SpaceInvaders() throws InterruptedException{
        super("Space Invaders");
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         Intro intro = new Intro();
         this.add(intro);
         this.pack();
         this.setVisible(true);
         intro.run();
    }
    
    class Space extends Canvas {
        Space(){
            setSize(1920, 1080);
            setBackground(Color.black);
            
        }
}
    public class Intro extends Space{
        @Override
        public void paint(Graphics g){
            g.setColor(Color.MAGENTA);
            g.setFont(new Font("Bold", Font.PLAIN,50));
            g.drawString("Space Invaders", 100, 100);
            g.setFont(new Font("Bold", Font.PLAIN,10));
            g.drawString("                  developed by Tank", 110, 110);
            
        }
        
        public void run(){
            this.repaint();
        }
}
    
    public static void main(String[] args) throws InterruptedException {
        SpaceInvaders space = new SpaceInvaders();
        
    }
    
    
}
