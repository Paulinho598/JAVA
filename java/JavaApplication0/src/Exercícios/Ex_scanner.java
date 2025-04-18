package Exercícios;

import java.util.Scanner;

public class Ex_scanner {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double a,b;
        
        System.out.print("Digite o valor de a:");
        a = x.nextDouble();
        
        System.out.print("Digite o valor de b:");
        b = x.nextDouble();
        
        System.out.println("A soma dos valores de a e b é:"+(a+b));
    }
}