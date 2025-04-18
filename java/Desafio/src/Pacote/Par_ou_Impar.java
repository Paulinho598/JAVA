package Pacote;

public class Par_ou_Impar {
    public void parImpar() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é ímpar");
            }
        }
    }

    public static void main(String[] args) {
        Par_ou_Impar n = new Par_ou_Impar();
        n.parImpar();
    }
}