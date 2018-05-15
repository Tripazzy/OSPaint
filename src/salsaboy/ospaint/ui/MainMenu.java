package salsaboy.ospaint.ui;

import salsaboy.ospaint.Variables;
import javax.swing.*;

public class MainMenu {
    public MainMenu() {
        Variables.frame.setLayout(null);
        
        Variables.frame.setSize(600, 371);  //Odd number from Golden Ratio. Don't judge.
        Variables.frame.setLocation(Variables.screenWidth / 2 - 300, Variables.screenHeight / 2 - 185);
        Variables.frame.setResizable(false);
        Variables.frame.setUndecorated(true);
        Variables.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Variables.frame.setVisible(true);
    }
}
