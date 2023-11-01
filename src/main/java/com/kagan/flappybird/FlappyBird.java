package com.kagan.flappybird;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class FlappyBird implements ActionListener {
    public static FlappyBird flappyBird;
    public final int WİDTH = 800, HEİGHT = 800;
    public Renderer renderer;

    public FlappyBird(){

        JFrame jFrame = new JFrame();
        renderer = new Renderer();
        Timer timer = new Timer(20,this);

        jFrame.add(renderer);
        jFrame.setSize(WİDTH, HEİGHT);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closing the window
        jFrame.setResizable(false);
        timer.start();

    }
    public void repaint(Graphics g){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        flappyBird = new FlappyBird();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        renderer.repaint();
    }
}
