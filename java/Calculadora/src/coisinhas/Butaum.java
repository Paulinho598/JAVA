package coisinhas;

import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

public class Butaum extends JButton{
    public Butaum(){
        Dimension Tamanho = new Dimension(50, 20);
        
        setSize(Tamanho);
        setFocusPainted(false);
        setPreferredSize(Tamanho);
        setForeground(Color.BLACK);
        add(Box.createVerticalStrut(10));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBackground(new Color(255, 182, 193));
    }
}