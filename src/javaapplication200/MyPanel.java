/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication200;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author moh
 */
public class MyPanel extends JPanel {

    private JLabel label;
    private String buttonNames[] = {"None", "Gaussian", "Blur"}; // in my code i read the names of the classes instead of writing it like this
    private JRadioButton buttons[] = new JRadioButton[buttonNames.length];
    private ButtonGroup buttonGroup;

    public MyPanel() {

        label = new JLabel("Filter:");
        buttonGroup = new ButtonGroup();
        add(label);
        addRadioButtons();

    }

    private void addRadioButtons() {

        for (int i = 0; i < buttonNames.length; i++) {
            buttons[i] = new JRadioButton(buttonNames[i]);
            buttons[i].setFocusable(false);
            buttonGroup.add(buttons[i]);
            add(buttons[i]);
            buttons[i].addItemListener(new MyItemListener());
        }
        buttons[0].setSelected(true);
    }

    private String getSelectedButton() {

        String selected = "";
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isSelected()) {
                selected += buttons[i].getText();
            }
        }
        return selected;
    }

    private class MyItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) { // if a button was selected
                String selectedButton = getSelectedButton(); // get the selected button 
                switch (selectedButton) {
                    case "None":
                        System.out.println("None");
                        break;
                    case "Gaussian":
                        System.out.println("Gaussian");
                        break;
                    default:
                        System.out.println("Blur");
                        break;
                }
            }
        }

    }

}
