import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    public Window(){
        getContentPane().setBackground(new Color(102,178,255));
        setResizable(false);
        setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        setSize(800,500);
        setVisible(true);
    }
}