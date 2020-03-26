package com.emi;

import com.sun.deploy.panel.ControlPanel;

import javax.swing.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    public ControlPanel canvas;

    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        canvas = new DrawingPanel(this);
        add(canvas, CENTER);
 //...TODO;


        pack();
    }
}
I