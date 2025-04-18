package Conexao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class seletores {
    ligação liga = new ligação();
    Connection conn = null;
    
    public List<Object[]> selector_Brazil(){
        List ImpBrazil = new ArrayList();
        String seletor = "select nome,nascimento,morte from imp_brasileiro";
        
        try{
            conn = liga.abrir();
            PreparedStatement stmt = conn.prepareStatement(seletor);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString("nome");
                String nascimento = rs.getString("nascimento");
                String morte = rs.getString("morte");
                
                ImpBrazil.add(new Object[]{nome,nascimento,morte});
            }
            
        }catch(SQLException e){
            conn = liga.fechar();
            throw new RuntimeException(e);
        }
        return ImpBrazil;
    }
    
    public List<Object[]> selector_Germany(){
        List ImpGermany = new ArrayList();
        String seletor = "select nome,nascimento,morte from imp_alemão";
        
        try{
            conn = liga.abrir();
            PreparedStatement stmt = conn.prepareStatement(seletor);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString("nome");
                String nascimento = rs.getString("nascimento");
                String morte = rs.getString("morte");
                
                ImpGermany.add(new Object[]{nome,nascimento,morte});
            }
            
        }catch(SQLException e){
            conn = liga.fechar();
            throw new RuntimeException(e);
        }
        return ImpGermany;
    }
    
    public List<Object[]> selector_Austria(){
        List ImpAustria = new ArrayList();
        String seletor = "select nome,nascimento,morte from imp_austriacos";
        
        try{
            conn = liga.abrir();
            PreparedStatement stmt = conn.prepareStatement(seletor);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString("nome");
                String nascimento = rs.getString("nascimento");
                String morte = rs.getString("morte");
                
                ImpAustria.add(new Object[]{nome,nascimento,morte});
            }
            
        }catch(SQLException e){
            conn = liga.fechar();
            throw new RuntimeException(e);
        }
        return ImpAustria;
    }
}