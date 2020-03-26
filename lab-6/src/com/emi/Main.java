package com.emi;

import com.sun.deploy.panel.ControlPanel;

import javax.swing.*;

class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    public DrawingPanel canvas;

    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.canvas = new DrawingPanel(this);
        this.add(this.configPanel, "Sus");
        this.add(this.canvas, "Mijloc");
        this.add(this.controlPanel, "Jos");
        pack();
    }
}
