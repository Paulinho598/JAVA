package coisinhas;

import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;

public class Janela extends JFrame{
    public Janela(){
        setVisible(true);
        setSize(500,600);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(144,213,255));
    }
}