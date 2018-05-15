package salsaboy.ospaint.ui;

import salsaboy.ospaint.Variables;
import javax.swing.*;
import java.awt.*;

public class CreateDrawing extends JFrame {
    private JTextField fileName = new JTextField();
    public CreateDrawing() {
        super("New Drawing");
        GridLayout test = new GridLayout(0, 2);
        setLayout(new GridLayout(0, 2));
        
        add(new JLabel("Filename: "));
        add(fileName);
        
        //Blank spaces
        if (getComponentCount() / 2 * 2 != getComponentCount()) {   //Check if it's odd.
            new JPanel();
        }
        final int blank = 10;
        for (int i = 0; i < blank; i++) {
            add(new JPanel());
            add(new JPanel());
        }
        
        setSize(371, 600);
        setLocation(
            Variables.screenWidth / 2 - 185,
            Variables.screenHeight / 2 - 300
        );
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
