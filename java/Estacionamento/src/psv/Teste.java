package psv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Teste { 
    public static void main(String[] args) {
        Connection con = Conexão.abrirConexao();
        
        CarroBean cb = new CarroBean();         
        CarroDAO cd = new CarroDAO(con);
        
        cb.setPlaca("JKK1900"); 
        cb.setCor("Azul"); 
        cb.setDescricao("Carro 1"); 
        System.out.println(cd.inserir(cb));
        
        cb.setPlaca("JKK1901");
        cb.setCor("Verde");
        cb.setDescricao("Carro 2");
        System.out.println(cd.inserir(cb));
        
        cb.setPlaca("JKK1902");
        cb.setCor("Amarelo");
        cb.setDescricao("Carro 3");
        System.out.println(cd.inserir(cb));
        
        List<CarroBean> lista = cd.listarTodos(); 
 
        if(lista != null){ 
            for(CarroBean carro : lista){ 
                System.out.println("Placa: "+carro.getPlaca()); 
                System.out.println("Cor: "+carro.getCor()); 
                System.out.println("Descrição:"+carro.getDescricao()); 
             
            }
        }
    }
}