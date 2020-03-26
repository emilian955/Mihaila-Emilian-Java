package com.emi;

import com.emi.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class DrawingPanel extends JPanel {
    final MainFrame frame;
    final static int W = 800, H = 600;
    BufferedImage image; //the offscreen image
    Graphics2D graphics; //the "tools" needed to draw in the image
    public DrawingPanel(MainFrame frame) {
        this.frame = frame; createOffscreenImage(); init();
    }
    private void createOffscreenImage() {
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE); //fill the image with white
        graphics.fillRect(0, 0, W, H);
    }
    private void init() {
        setPreferredSize(new Dimension(W, H)); //don’t use setSize. Why?
        setBorder(BorderFactory.createEtchedBorder()); //for fun
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                drawShape(e.getX(), e.getY()); repaint();
            } //Can’t use lambdas, JavaFX does a better job in these cases
        });
    }
    private void drawShape(int x, int y) {
        Random rand = new Random();
        int radius = rand.nextInt(1000); //generate a random number
        int sides =(Integer)this.frame.configPanel.sidesField.getValue(); //get the value from UI (in ConfigPanel)
        Color color = (Color) randomColor(); //create a transparent random Color.
        graphics.setColor(color);
        graphics.fill(new RegularPolygon(x, y, radius, sides));
    }
    @Override
    public void update(Graphics g) { } //Why did I do that?
    public Paint randomColor() {
        Random rand = new Random();
        float r = rand.nextFloat();

        float g = rand.nextFloat();

        float b = rand.nextFloat();
        Color randomColor = new Color(r, g, b);
        return randomColor;
    }
    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }
}
}

