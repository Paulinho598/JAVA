import java.util.Scanner;

public class Matemática1 {    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Digite o valor de A:");
        int a = x.nextInt();
        
        System.out.print("Digite o valor de B:");
        int b = x.nextInt();

        System.out.print("Digite o valor de A:");
        int altura = x.nextInt();
        
        System.out.print("Digite o valor de B:");
        int largura = x.nextInt();
        
        Operações calculos = new Operações(a,b);
        Operações calc2 = new Operações(altura,largura);
        int soma = calculos.soma();
        int subtração = calculos.subtração();
        int multiplicação = calculos.multiplicação();
        int divisão = calculos.divisão();
        double areaQ = calc.areaQ();
        double areaT = calc2.areaT();
        double volumeCubo = calc2.volumeCubo();
        double volumeCone = calc2.volumeCone();
        

        System.out.println("A soma dos dois valores é:"+soma);
        System.out.println("A subtração dos dois valores é:"+subtração);
        System.out.println("A multiplicação dos dois valores é:"+multiplicação);
        System.out.println("A soma dos dois valores é:"+divisão);
        System.out.println("A área do quadrado é:"+areaQ);
        System.out.println("A área do triângulo é:"+areaT);
        System.out.println("O volume do cubo é:"+volumeCubo);
        System.out.println("O volume do cone "+volumeCone);

    }
}