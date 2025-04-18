package Conexao;

import java.sql.Connection;

public class teste {
    public static void main(String[] args) {
        ligação liga = new ligação();
        
        Connection conn = liga.abrir();
        System.out.println(conn);
        
        conn = liga.fechar();
        System.out.println(conn);
    }
}