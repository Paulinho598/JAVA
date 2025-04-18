package Pacote;

import java.util.Scanner;

public class Executar1 {    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = x.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = x.nextInt();

        System.out.print("Digite o valor da altura: ");
        double altura = x.nextDouble();
        
        System.out.print("Digite o valor da largura: ");
        double largura = x.nextDouble();
        
        Operacoes calculos = new Operacoes(a,b);
        Operacoes calc2 = new Operacoes(largura,altura);
        int soma = calculos.soma();
        int subtracao = calculos.subtracao();
        int multiplicacao = calculos.multiplicacao();
        int divisao = calculos.divisao();
        double areaQ = calc2.areaQ();
        double areaT = calc2.areaT();
        double areaC = calc2.areaC();
        double volumeCubo = calc2.volumeCubo();
        double volumeCone = calc2.volumeCone();
        

        System.out.println("A soma dos dois valores é: " + soma);
        System.out.println("A subtração dos dois valores é: " + subtracao);
        System.out.println("A multiplicação dos dois valores é: " + multiplicacao);
        System.out.println("A divisão dos dois valores é: " + divisao);
        System.out.println("A área do quadrado é: " + areaQ);
        System.out.println("A área do triângulo é: " + areaT);
        System.out.println("A área do circulo é: " + areaC);
        System.out.println("O volume do cubo é: " + volumeCubo);
        System.out.println("O volume do cone é: " + volumeCone);
    }
}