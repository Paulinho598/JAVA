package coisinhas;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class eventos {
    private static Double n1;
    private static boolean novoNum = true;
    private static String operaçãoPendente;

    public static void Número(String número, JLabel visor){
        
        //JOptionPane.showMessageDialog(null, "Oi :3");

        if(novoNum){
            visor.setText("");
            novoNum = false;
        }

        String valor = visor.getText();
        if(valor.equals("0")){
            visor.setText(número);
        }else{
            visor.setText(valor+número);
        }
    }

    public static void Operador(String operador, JLabel visor){
        //JOptionPane.showMessageDialog(null, "Oi de novo >:3");

        if(!novoNum){
            n1 = Double.parseDouble(visor.getText());
            operaçãoPendente = operador;
            novoNum = true;
        }
    }

    public static void Calcular(JLabel visor){
        if(operaçãoPendente == null) return;

        try{
            Double n2 = Double.parseDouble(visor.getText());
            Double resultado = (double) 0;

            switch (operaçãoPendente) {
                case "+":
                    resultado = n1+n2;
                    break;
                case "-":
                    resultado = n1-n2;
                    break;
                case "×":
                    resultado = n1*n2;
                    break;
                case "÷":
                    if(n2 == 0) throw new ArithmeticException();
                    resultado = n1/n2;
                    break;
            }

            visor.setText(Double.isNaN(resultado) ? "Erro" : resultado % 1 == 0 ? String.valueOf(resultado) : String.valueOf(resultado));
            
        }catch(ArithmeticException e){
            visor.setText("ERRO.");
        }catch(NumberFormatException e){
            visor.setText("ERRO.");
        }finally{
            operaçãoPendente = null;
        }
    }

    public static void Limpar(JLabel visor){
        visor.setText("0");
        n1 = (double) 0;
        operaçãoPendente = null;
        novoNum = true;
    }
}