package Desafio;

import java.util.Scanner;

public class Matemática1 {    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Digite o valor de A:");
        int a = x.nextInt();
        
        System.out.print("Digite o valor de B:");
        int b = x.nextInt();

        System.out.print("Digite o valor de A:");
        double altura = x.nextInt();
        
        System.out.print("Digite o valor de B:");
        double largura = x.nextInt();
        
        Operações calculos = new Operações(a,b);
        Operações calc2 = new Operações(altura,largura);

        System.out.println("A soma dos dois valores é:"+calculos.soma());
        System.out.println("A subtração dos dois valores é:"+calculos.subtração());
        System.out.println("A multiplicação dos dois valores é:"+calculos.multiplicação());
        System.out.println("A divisão dos dois valores é:"+calculos.divisão());
        System.out.println("A área do quadrado é:"+calc2.areaQ());
        System.out.println("A área do triângulo é:"+calc2.areaT());
        System.out.println("O volume do cubo é:"+calc2.volumeCubo(altura));
        System.out.println("O volume do cone "+calc2.volumeCone(altura,largura));
    }
}
