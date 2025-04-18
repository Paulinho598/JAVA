package Desafio;
        
public class Operações{
    private int a,b;
    private double altura,largura;
    
    public Operações(int a,int b){
        this.a = a;
        this.b = b;
    }
    
    public Operações(double altura,double largura){
        this.altura = altura;
        this.largura = largura;
    }
    
    public int soma(){
        return a+b;
    }
    
    public int subtração(){
        return a-b;
    }
    
    public int multiplicação(){
        return a*b;
    }
    
    public int divisão(){
        return a/b;
    }

    public double areaQ(){
        return largura*altura;
    }

    public double areaT(){
        return (largura*altura)/2;
    }

    public double  areaC(){
        return Math.PI*(largura/2)*(largura/2);
    }

    public double volumeCubo(double altura){
        return altura * altura * altura;
    }
    
    public double volumeCone(double largura,double altura){
        return (Math.PI*(largura/2)*altura)/3;
    }
}