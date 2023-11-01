package com.kagan.flappybird;

import javax.swing.*;

public class FlappyBird {
    public static FlappyBird flappyBird;
    public final int WİDTH = 800, HEİGHT = 800;

    public FlappyBird(){
        JFrame jFrame = new JFrame();
        jFrame.setSize(WİDTH, HEİGHT);
    }



    public static void main(String[] args) {
        flappyBird = new FlappyBird();


    }


}
