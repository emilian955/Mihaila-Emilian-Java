package com.emi;

import com.emi.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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
    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "PNG", new File("d:/test.png"));
        } catch (IOException ex) { System.err.println(ex); }
    }
    private void reset(ActionEvent actionEvent) {
        this.frame.canvas.reset();
        this.frame.repaint();
    }

    private void exit(ActionEvent actionEvent) {
        this.frame.dispose();
        System.exit(0);
    }
}
