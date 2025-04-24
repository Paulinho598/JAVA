package coisinhas;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class Título extends JLabel{
    public Título(){
        setForeground(Color.BLACK);
        setVerticalAlignment(JLabel.TOP);
        setHorizontalAlignment(JLabel.CENTER);
        setFont(new Font("Arial", Font.BOLD, 24));
        setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
    }
}