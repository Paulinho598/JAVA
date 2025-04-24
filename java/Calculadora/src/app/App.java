package app;

import coisinhas.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;

public class App {
    public static void main(String[] args) {
        Janela app = new Janela();
        
        Título nome = new Título();
        
        JPanel tudo = new JPanel();
        /*JPanel Botões = new JPanel();
        JPanel Centralizar = new JPanel(new GridBagLayout());*/
        JPanel numerais = new JPanel();
        JPanel linha = new JPanel();

        numerais.setBackground(new Color(144,213,255));
        
        linha.setBackground(new Color(144,213,255));

        /*Funções Primárias :3
        Butaum Adição = new Butaum();
        Butaum Subtração = new Butaum();
        Butaum Multiplicação = new Butaum();
        Butaum Divisão = new Butaum();*/

        /*Números*/
        Butaum n0 = new Butaum();
        Butaum n1 = new Butaum();
        Butaum n2 = new Butaum();
        Butaum n3 = new Butaum();
        Butaum n4 = new Butaum();
        Butaum n5 = new Butaum();
        Butaum n6 = new Butaum();
        Butaum n7 = new Butaum();
        Butaum n8 = new Butaum();
        Butaum n9 = new Butaum();

        Butaum[] números = {n0, n1, n2, n3, n4, n5, n6, n7, n8, n9};

        for (int i = 0; i < números.length; i++) {
            linha.add(números[i]);

            if ((i+1) % 3 == 0 || i == números.length - 1){
                numerais.add(linha);
                if (i < números.length - 1) {
                    linha = new JPanel();
                    linha.setBackground(new Color(144,213,255));
                }
            }
        }

        nome.setText("CALCULADORA");

        /*Adição.setText("+");
        Subtração.setText("-");
        Multiplicação.setText("×");
        Divisão.setText("÷");
        
        n0.setText("0");
        n1.setText("1");
        n2.setText("2");
        n3.setText("3");
        n4.setText("4");
        n5.setText("5");
        n6.setText("6");
        n7.setText("7");
        n8.setText("8");
        n9.setText("9");*/
        

        tudo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        tudo.setBackground(new Color(144,213,255));

        /*Botões.setLayout(new BoxLayout(Botões, BoxLayout.Y_AXIS));
        Botões.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        Botões.setBackground(new Color(144,213,255));

        Botões.add(Adição);
        Botões.add(Subtração);
        Botões.add(Multiplicação);
        Botões.add(Divisão);

        Botões.add(n0);
        Botões.add(n1);
        Botões.add(n2);
        Botões.add(n3);
        Botões.add(n4);
        Botões.add(n5);
        Botões.add(n6);
        Botões.add(n7);
        Botões.add(n8);
        Botões.add(n9);

        
        Centralizar.setBackground(new Color(144,213,255));
        Centralizar.add(Botões);

        tudo.add(Botões);*/

        app.add(nome, BorderLayout.NORTH);
        app.add(tudo);
        app.revalidate();
    }
}