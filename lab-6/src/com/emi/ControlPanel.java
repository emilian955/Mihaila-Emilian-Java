package com.emi;

import com.emi.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton exitBtn = new JButton("Exit");
    JButton loadBtn = new JButton("Load");
    JButton resetBtn = new JButton("Reset");


    public ControlPanel(MainFrame frame) {
        this.frame = frame; init();
    }
    private void init() {
        setLayout(new GridLayout(1, 4));
        this.add(this.saveBtn);
        this.add(this.loadBtn);
        this.add(this.resetBtn);
        this.add(this.exitBtn);
        this.saveBtn.addActionListener(this::save);
        this.exitBtn.addActionListener(this::exit);
        this.loadBtn.addActionListener(this::load);
        this.resetBtn.addActionListener(this::reset);

    }
    BufferedImage image = ImageIO.read(new File("./imagine.png"));//load
    private void save(ActionEvent e) {
        try {
            ImageIO.write(this.frame.canvas.image, "PNG", new File("./imagine.png"));
        } catch (IOException ex) { System.err.println(ex); }
    }
    private void reset(ActionEvent actionEvent) {
        this.frame.canvas.resetBounds();
        this.frame.repaint();
    }

    private void exit(ActionEvent actionEvent) {
        this.frame.dispose();
        System.exit(0);
    }
}
