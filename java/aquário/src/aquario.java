import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class aquario{
    public static void main(String[] args) {
        JFrame janela1 = new Window();
        JPanel painel = new JPanel();
        JLabel titulo = new JLabel("Texto");
        JButton botao = new JButton("Clique");
        Font fonte = new Font("Arial",Font.BOLD,30); 
        Border bordaJanela = BorderFactory.createLineBorder(Color.BLACK);
        Border bordaBotao = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK),
            BorderFactory.createEmptyBorder(8, 12, 8, 12)
        );

        painel.setVisible(true);
        painel.setBorder(bordaJanela);
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(titulo);
        painel.add(botao);
        painel.setBackground(new Color(61,144,216));

        botao.setFocusPainted(false);
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        botao.setBorder(new EmptyBorder(10,20,10,20));
        botao.setBorder(bordaBotao);

        titulo.setForeground(new Color(100,100,100));
        titulo.setFont(fonte);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setBorder(new EmptyBorder(10,20,10,20));

        janela1.add(painel);
        janela1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela1.setSize(800,500);
        janela1.setResizable(false);
        janela1.setVisible(true);

        /*botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
            }
        });*/
    }
}