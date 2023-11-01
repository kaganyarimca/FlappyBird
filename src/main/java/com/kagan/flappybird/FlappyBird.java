package com.kagan.flappybird;

import netscape.security.UserTarget;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;



public class FlappyBird implements ActionListener {
    public static FlappyBird flappyBird;
    public final int WİDTH = 800, HEİGHT = 800;
    public Renderer renderer;
    public Rectangle bird;
    public ArrayList<Rectangle> columns;
    public Random random;


    public FlappyBird(){

        JFrame jFrame = new JFrame();

        renderer = new Renderer();

        Timer timer = new Timer(20,this);

        bird  =new Rectangle(WİDTH/2- 10, HEİGHT/2 -10,  20,20);

        jFrame.add(renderer);
        jFrame.setTitle("Flappy Bird Game");

        jFrame.setSize(WİDTH, HEİGHT);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closing the window
        jFrame.setResizable(false);
        timer.start(); //  continuous operation.

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        renderer.repaint();
    }

    public void addColumn(){
        int space = 100;
        int width = 300;
        int height = 50 + random.nextInt(300);
        columns.add(new Rectangle(WİDTH + width+ columns.size() * 300, HEİGHT - height - 120 , width, height));

    }

    public void paintColor(Graphics g, Rectangle column){
        g.setColor(Color.GREEN.darker());
        g.fillRect(column.x,column.y, column.width, column.height);
        columns = new ArrayList<Rectangle>();

    }

    public void repaint(Graphics g){

        // BACKGROUND
        g.setColor(Color.CYAN);
        g.fillRect(0,0,WİDTH,HEİGHT);

        // GROUND
        g.setColor(Color.orange);
        g.fillRect(0,HEİGHT-120,WİDTH,150);

        g.setColor(Color.GREEN);
        g.fillRect(0,HEİGHT-120,WİDTH,20);



        g.setColor(Color.RED);
        g.fillRect(bird.x,bird.y, bird.width,bird.height );
    }

    public static void main(String[] args) {
        flappyBird = new FlappyBird();

    }
}

