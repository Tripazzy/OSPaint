package salsaboy.ospaint.ui;

import salsaboy.ospaint.Variables;
import javax.swing.*;
import java.awt.*;

public class MainMenu {
    private JLabel title = new JLabel("OSPaint");
    private JButton newProject = new JButton("New Drawing");
    private static int centerX(Component component) {
        return 300 - (component.getWidth() / 2);
    }
    
    public MainMenu() {
        Variables.frame.setLayout(null);
    
        Font textFont = new Font("American Typewriter", Font.PLAIN, 50);
        
        //Set up the title text and add it.
        title.setFont(textFont);
        title.setSize(title.getPreferredSize());
        title.setLocation(
            centerX(title),
            0
        );
        Variables.frame.add(title);
        
        //New Project button
        newProject.setFont(textFont);
        newProject.setSize(newProject.getPreferredSize());
        newProject.setLocation(
            centerX(newProject),
            200
        );
        newProject.addActionListener(e -> {
            Variables.frame.dispose();
            new CreateDrawing();
        });
        Variables.frame.add(newProject);
        
        Variables.frame.setSize(600, 371);  //Odd number from Golden Ratio. Don't judge.
        Variables.frame.setLocation(Variables.screenWidth / 2 - 300, Variables.screenHeight / 2 - 185);
        Variables.frame.setResizable(false);
        Variables.frame.setUndecorated(true);
        Variables.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Variables.frame.setVisible(true);
    }
}
