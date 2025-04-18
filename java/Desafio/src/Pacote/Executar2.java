package Pacote;

import javax.swing.JOptionPane;

public class Executar2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura:"));
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura:"));
        
        Operacoes calculos = new Operacoes(a,b);
        Operacoes calc2 = new Operacoes(largura,altura);
        int soma = calculos.soma();
        int subtracao = calculos.subtracao();
        int multiplicacao = calculos.multiplicacao();
        int divisao = calculos.divisao();
        double areaQ = calc2.areaQ();
        double areaC = calc2.areaC();
        double areaT = calc2.areaT();
        double volumeCone = calc2.volumeCone();
        double volumeCubo = calc2.volumeCubo();
                
        JOptionPane.showMessageDialog(null,"A soma dos produtos:"+soma);
        JOptionPane.showMessageDialog(null,"A subtração dos produtos:"+subtracao);
        JOptionPane.showMessageDialog(null,"A multiplicação dos produtos:"+multiplicacao);
        JOptionPane.showMessageDialog(null,"A divisão dos produtos:"+divisao);
        JOptionPane.showMessageDialog(null,"A área do quadrado:"+areaQ);
        JOptionPane.showMessageDialog(null,"A área do triângulo:"+areaT);
        JOptionPane.showMessageDialog(null,"A área do circulo:"+areaC);
        JOptionPane.showMessageDialog(null,"O volume do cubo:"+volumeCubo);
        JOptionPane.showMessageDialog(null,"O volume do cone:"+volumeCone);
    }
}