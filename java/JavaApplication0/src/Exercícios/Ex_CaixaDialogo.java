package Exercícios;

import javax.swing.*;

public class Ex_CaixaDialogo {
    public static void main(String[] args) {
       double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
        
        double res = a+b;
        
        JOptionPane.showMessageDialog(null,"O valor da soma é:"+res);
    }
}
