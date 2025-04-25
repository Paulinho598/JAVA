package app;
import coisinhas.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class App {
    public static void main(String[] args) {
        Janela app = new Janela();

        Título nome = new Título();
        JLabel resultado_lbl = new JLabel("0",SwingConstants.RIGHT);
        
        JPanel tudo = new JPanel(new BorderLayout(5,5));
        JPanel painelNúmeros = new JPanel(new GridLayout(5,3,5,5));
        JPanel painelOperações = new JPanel(new GridLayout(6,1,5,5));
        JPanel Centro = new JPanel(new BorderLayout(5,5));
        JPanel Resultado = new JPanel();

        tudo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        tudo.setBackground(new Color(144,213,255));

        painelNúmeros.setBackground(new Color(144,213,255));
        painelOperações.setBackground(new Color(144,213,255));

        resultado_lbl.setFont(new Font("Arial", Font.BOLD, 30));
        resultado_lbl.setForeground(Color.WHITE);

        /*Números*/
        Butaum n0 = new Butaum("0");
        Butaum n1 = new Butaum("1");
        Butaum n2 = new Butaum("2");
        Butaum n3 = new Butaum("3");
        Butaum n4 = new Butaum("4");
        Butaum n5 = new Butaum("5");
        Butaum n6 = new Butaum("6");
        Butaum n7 = new Butaum("7");
        Butaum n8 = new Butaum("8");
        Butaum n9 = new Butaum("9");

        /*Operadores*/
        Butaum Adição = new Butaum("+");
        Butaum Subtração = new Butaum("-");
        Butaum Multiplicação = new Butaum("×");
        Butaum Divisão = new Butaum("÷");
        Butaum Igual = new Butaum("=");

        painelNúmeros.add(n1);
        painelNúmeros.add(n2);
        painelNúmeros.add(n3);
        painelNúmeros.add(n4);
        painelNúmeros.add(n5);
        painelNúmeros.add(n6);
        painelNúmeros.add(n7);
        painelNúmeros.add(n8);
        painelNúmeros.add(n9);
        painelNúmeros.add(n0);

        painelNúmeros.add(new JLabel(""));
        painelNúmeros.add(new JLabel(""));

        painelOperações.add(Adição);
        painelOperações.add(Subtração);
        painelOperações.add(Multiplicação);
        painelOperações.add(Divisão);
        painelOperações.add(Igual);

        Resultado.setBackground(new Color(144,213,255));
        Resultado.add(resultado_lbl);

        Centro.add(painelNúmeros, BorderLayout.CENTER);
        Centro.add(painelOperações, BorderLayout.EAST);
        Centro.add(Resultado,BorderLayout.NORTH);
        Centro.setBackground(new Color(144,213,255));
        Centro.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 3),
            BorderFactory.createEmptyBorder(2, 2, 0, 2)
        ));

        nome.setText("CALCULADORA");
        nome.setForeground(Color.WHITE);

        tudo.add(nome, BorderLayout.NORTH);
        tudo.add(Centro, BorderLayout.SOUTH);

        app.add(tudo);
        app.revalidate();
    }
}

/*Coisinhas :3*/

/*JPanel Centralizar = new JPanel(new GridBagLayout());
 JPanel Botões = new JPanel();*/

/*Funções Primárias :3
Butaum Adição = new Butaum();
Butaum Subtração = new Butaum();
Butaum Multiplicação = new Butaum();
Butaum Divisão = new Butaum();*/

/*n0.setText("0");
n1.setText("1");
n2.setText("2");
n3.setText("3");
n4.setText("4");
n5.setText("5");
n6.setText("6");
n7.setText("7");
n8.setText("8");
n9.setText("9");*/

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
Centralizar.add(Botões);*/

/*app.add(nome, BorderLayout.NORTH);*/

/*for(int i = 1; i <= 9; i++){
    painelNúmeros.add(new Butaum(String.valueOf(i)));
}

String[] operadores = {"+", "-", "×", "÷", "="};
for(String op: operadores){
    painelOperações.add(new Butaum(op));
}*/

/*n1.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        resultado_lbl.setText(resultado_lbl.getText()+1);
    }
});*/