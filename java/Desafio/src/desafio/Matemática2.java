package Desafio;

import javax.swing.JOptionPane;

public class Matemática2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura:"));
        int largura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da largura:"));
        
        Operações calculos = new Operações(a,b);
        Operações calc2 = new Operações(altura,largura);
        
        JOptionPane.showMessageDialog(null,"A soma dos produtos:"+calculos.soma());
        JOptionPane.showMessageDialog(null,"A subtração dos produtos:"+calculos.subtração());
        JOptionPane.showMessageDialog(null,"A multiplicação dos produtos:"+calculos.multiplicação());
        JOptionPane.showMessageDialog(null,"A divisão dos produtos:"+calculos.divisão());
        JOptionPane.showMessageDialog(null,"A área do quadrado:"+calc2.areaQ());
        JOptionPane.showMessageDialog(null,"A área do triângulo:"+calc2.areaT());
        JOptionPane.showMessageDialog(null,"A área do circulo:"+calc2.areaC());
        JOptionPane.showMessageDialog(null,"O volume do cubo:"+calc2.volumeCubo(altura));
        JOptionPane.showMessageDialog(null,"O volume do cone:"+calc2.volumeCone(altura,largura));
    }
}