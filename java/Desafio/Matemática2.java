import javax.swing.JOptionPane;

public class Matemática2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
       
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        
        Operações calculos = new Operações(a,b);
        int soma = calculos.soma();
        int subtração = calculos.subtração();
        int multiplicação = calculos.multiplicação();
        int divisão = calculos.divisão();
        
        JOptionPane.showMessageDialog(null,"A soma dos produtos:"+soma);
        JOptionPane.showMessageDialog(null,"A subtração dos produtos:"+subtração);
        JOptionPane.showMessageDialog(null,"A multiplicação dos produtos:"+multiplicação);
        JOptionPane.showMessageDialog(null,"A divisão dos produtos:"+divisão);
    }
}
