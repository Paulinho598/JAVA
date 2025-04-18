import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Janela extends JFrame{
        
        public Janela(){

            setTitle("Título");
            setResizable(false);
            setSize(800,500);
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setBackground(Color.GRAY);
        }

        public static void main(String[] args) {
            Janela Janela = new Janela();
            botao botão = new botao("Botão");

            Janela.setVisible(true);
            Janela.add(botão);
        }
}