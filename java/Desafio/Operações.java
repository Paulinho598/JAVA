public class Operações{
    private int a,b;
    private double altura,largura;
    
    public Operações(int a,int b,double altura,double largura){
        this.a = a;
        this.b = b;
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
        return 3.14*(largura/2)*(largura/2);
    }

    public volumeCubo(){
        return altura*altura*altura;
    }
    
    public volumeCone(){
        return ((largura/2)*altura)/3;
    }
}