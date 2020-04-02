/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Andrei
 */
public class SpaceInvaders extends JFrame{
    
    public SpaceInvaders() throws InterruptedException{
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Intro intro = new Intro();
        this.add(intro);
        this.pack();
        this.setVisible(true);
        intro.run();
    }
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        new SpaceInvaders();
    }

    
    
}
