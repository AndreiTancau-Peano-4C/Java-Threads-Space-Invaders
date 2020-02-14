/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author tancau.andrei
 */
public class SpaceInvaders2 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        SpaceInvaders2 space = new SpaceInvaders2();
        
    }
    
    public SpaceInvaders2() throws InterruptedException{
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
            setSize(800, 600);
            setBackground(Color.black);
            
        }
}
    public class Intro extends Space{
        private int i=0;
         private int j=0;
        @Override
        public void paint(Graphics g){
            g.setColor(Color.MAGENTA);
            g.setFont(new Font("Bold", Font.PLAIN,50));
            g.drawString("Space Invaders", 100+i, 100+i);
            g.setFont(new Font("Bold", Font.PLAIN,10));
            g.drawString("                  developed by Tank", 110+i+i, 110+i+i);
            
        }
        
        public void run() throws InterruptedException{
            setBackground(Color.black);
            setSize(800, 500);
            
            for ( i = 500; i>=0; i-=1) {
                this.repaint();
                Thread.sleep(10);
            }
            
            
        }
    }
    
    
    
}
