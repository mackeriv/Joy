package org.example;

import javax.swing.*;
import java.awt.*;

public class MyCanvas extends JPanel {

    public MyCanvas() {
        // set the canvas size
        setPreferredSize(new Dimension(900, 600));

        setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // create an object to draw with
        Paintbrush myBrush = new Paintbrush(g);
        // draw the different graphics that make up our painting
        myBrush.drawGrass();
        myBrush.drawSky();
        myBrush.drawMountains();
        myBrush.drawTree();

    }

}
