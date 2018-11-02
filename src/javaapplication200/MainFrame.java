/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication200;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author moh
 */
public class MainFrame extends JFrame {

    private MyPanel panel;
    private static JLabel image = new JLabel();

    public MainFrame(String frameName, int frameWidth, int frameHeight) {

        super(frameName);
        setImage();
        panel = new MyPanel();
        add(panel, BorderLayout.NORTH);
        image.setHorizontalAlignment(JLabel.CENTER);
        image.setVerticalAlignment(JLabel.CENTER);
        add(image);
        setSize(frameWidth, frameHeight);
        setLocationRelativeTo(null); // to center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // to prevent people from resizing the window
        setVisible(true);
    }

    public static void setImage() {
        // instead of this you could use openFile(imread) to load the image using opencv 
        // then use the toBufferedImage to return an Image and give the ImageIcon the returned Image as a parameter 
        ImageIcon icon = new ImageIcon("C:\\Users\\moh\\Desktop\\image.jpg");
        Image img = icon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
        image.setIcon(new ImageIcon(img));

    }

}
