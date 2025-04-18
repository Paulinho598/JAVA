import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class botao extends JButton{
    public botao(String texto){
        super(texto);

        setBackground(Color.WHITE);
        setBorderPainted(false);
        setFocusPainted(false);
        setPreferredSize(new Dimension(70,30));
    }
}