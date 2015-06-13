package me.curiosus.gravity0.app.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by erudite on 6/13/15.
 */
public class MainView {


    private static final Dimension SCREEN_DIM = new Dimension(1280, 1024);
    private static final Point SCREEN_POSITION= new Point(200, 200);


    public void init() {
        JFrame frame = new JFrame("Gravity0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SCREEN_DIM);
        frame.setLocation(SCREEN_POSITION);
        frame.setVisible(true);


    }

}
