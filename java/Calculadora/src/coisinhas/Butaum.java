package coisinhas;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

public class Butaum extends JButton{
    public Butaum(String texto){
        super(texto == null ? "" : texto);
        configurações();
    }

    public Butaum() {
        this("");
    }

    private void configurações(){
        Dimension Tamanho = new Dimension(110, 22);
        
        setSize(Tamanho);
        setMinimumSize(Tamanho);
        setMaximumSize(Tamanho);
        setFocusPainted(false);
        setPreferredSize(Tamanho);
        setForeground(Color.BLACK);
        add(Box.createVerticalStrut(10));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBackground(new Color(255, 182, 193));
        setFont(new Font("Arial", Font.BOLD, 14));
    }
}