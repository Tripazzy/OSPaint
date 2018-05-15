package salsaboy.ospaint.ui;

import salsaboy.ospaint.Variables;
import javax.swing.*;
import java.awt.*;

public class CreateDrawing extends JFrame {
    private JTextField fileName = new JTextField();
    private ButtonGroup format = new ButtonGroup();
    private JPanel formatPanel = new JPanel();
    private JRadioButton png = new JRadioButton("PNG");
    private JRadioButton jpeg = new JRadioButton("JPEG");
    private JRadioButton gif = new JRadioButton("GIF");
    private JRadioButton osp = new JRadioButton("OSP");
    
    private void makeFormatPanel() {    //This just makes it easier to read
        formatPanel.setLayout(new GridLayout(2, 0));
        
        add(new JLabel("File format:"));
        
        formatPanel.add(osp);
        format.add(osp);
        osp.setSelected(true);
        formatPanel.add(png);
        format.add(png);
        formatPanel.add(jpeg);
        format.add(jpeg);
        formatPanel.add(gif);
        format.add(gif);
    }
    
    public CreateDrawing() {
        super("New Drawing");
        GridLayout test = new GridLayout(0, 2);
        setLayout(new GridLayout(0, 2));
        
        //Filename label
        add(new JLabel("Filename:"));
        add(fileName);
        
        //Format selector
        makeFormatPanel();
        add(formatPanel);
        
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
