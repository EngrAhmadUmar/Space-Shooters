//Author: Ahmad Ahmed

//declaring package name
package com.shooter;
//importing all necessary libraries
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Image;
public class SpaceInvaders extends JFrame  {

    //Creating main class operations
    public SpaceInvaders() {

        initUI();
    }

    private void initUI() {
        //
        add(new Board());

        setTitle("Space Shooters");
        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
        Image icon = Toolkit.getDefaultToolkit().getImage("src/images/ico.png");
        setIconImage(icon);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new SpaceInvaders();
            ex.setVisible(true);
        });
    }
}
