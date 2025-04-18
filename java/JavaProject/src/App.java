import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args){
        Window janela = new Window();
        Button botão = new Button();

        janela.add(botão);

        botão.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }
        });
    }
}