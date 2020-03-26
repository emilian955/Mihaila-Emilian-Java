package com.emi;

import com.emi.MainFrame;

import javax.swing.*;

public class ConfigPanel extends JPanel {
    JSpinner sidesField; // number of sides
    JComboBox colorCombo; // the color of the shape
    final MainFrame frame;
    JLabel label; // we’re drawing regular polygons


    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    public JSpinner getSidesField() {
        return this.sidesField;
    }

    public JComboBox getColorCombo() {
        return this.colorCombo;
    }
    public MainFrame getFrame() {
        return this.frame;
    }

    public JLabel getSidesLabel() {
        return this.label;
    }



    private void init() {
        //create the label and the spinner
        JLabel sidesLabel = new JLabel("Number of sides:");
        sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        sidesField.setValue(6); //default number of sides
        String[] names = new String[]{"Random", "Black"};
        this.colorCombo = new JComboBox(names);
        add(sidesLabel); //JPanel uses FlowLayout by default
        add(sidesField);
        add(colorCombo);
    }
}