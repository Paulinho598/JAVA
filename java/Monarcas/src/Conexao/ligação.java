package Conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ligação {
    private String Url = "jdbc:mysql://localhost:3306/líderes";
    private String User = "root";
    private String Password = "";
    
    Connection conn = null;
    
    public Connection abrir(){
        try{
            conn = DriverManager.getConnection(Url,User,Password);
            System.out.println("Conexão aberta");
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        return conn;
    }
    
    public Connection fechar(){
        if(conn!=null){
            try{
                conn.close();
                System.out.println("Conexão fechada");
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
        return conn;
    }
}