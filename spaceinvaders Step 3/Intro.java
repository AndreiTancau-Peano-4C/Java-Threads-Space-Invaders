/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

/**
 *
 * @author Andrei
 */
public class Intro extends Space {

    private int i = 0;
    private BufferStrategy strategy;

    void run() throws InterruptedException {

        createBufferStrategy(2);
        strategy = getBufferStrategy();

        setBackground(Color.BLACK);
        for (i = 300; i >= 0; i -= 1) {
            System.err.println("i: " + i);
            this.paint();
            Thread.sleep(5);
        }

    }

    public void paint() {
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();

        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.blue);
        g.setFont(new Font("Bold", Font.PLAIN, 50 + i / 2));
        g.drawString("Space Invaders", 100 + i, 100 + i);
        g.setFont(new Font("Bold", Font.LAYOUT_RIGHT_TO_LEFT, 20 + i / 2));
        g.drawString("           by Andrei Tancau", 120 + i, 120 + i);
        
        g.dispose();
        strategy.show();
    }

}
