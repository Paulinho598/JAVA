import javax.swing.*;
import java.awt.*;
public class Arquivo {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Título");
        JTextField txt = new JTextField();
        JButton btn = new JButton();

        janela.add(txt);
        txt.setPreferredSize(new Dimension(30,30));

        janela.add(btn,"Pesquise aqui");
        
        
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setSize(800,500);
        janela.setVisible(true);
    }
}