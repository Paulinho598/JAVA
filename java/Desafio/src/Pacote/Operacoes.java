package Pacote;

public class Operacoes {
    private int a, b, num;
    private double altura, largura;

    public Operacoes(int a,int b) {
        this.a = a;
        this.b = b;
    }
    
    public Operacoes(double altura,double largura) { 
       this.altura = altura;
       this.largura = largura;
    }
    
    public Operacoes(int i){
        this.num = i;
    }

    public int soma() {
        return a + b;
    }

    public int subtracao() {
        return a - b;
    }

    public int multiplicacao() {
        return a * b;
    }

    public int divisao() {
        return a / b;
    }

    public double areaQ() {
        return largura * altura;
    }

    public double areaT() {
        return (largura * altura) / 2;
    }

    public double areaC() {
        return 3.14 * (largura / 2) * (largura / 2);
    }

    public double volumeCubo() {
        return altura * altura * altura;
    }

    public double volumeCone() {
        return ((largura / 2) * altura) / 3;
    }
}