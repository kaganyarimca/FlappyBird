package com.kagan.flappybird;

import javax.swing.JPanel;
import java.awt.*;

public class Renderer  extends JPanel {

    public static final long serialVersionUID  = 1L;

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        FlappyBird.flappyBird.repaint(g);


    }

}
