package ligadura;

import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conequisaum {
    private String link = "jdbc:mysql://localhost:3306/PokéWorld";
    private String usuário = "root";
    private String senha = "";    
    Connection conn = null;
    
    public Connection abrir(){
        try{
            System.out.println("Conexão foi aberta sangue bom");
            conn = DriverManager.getConnection(link,usuário,senha);
        }catch(SQLException e){
            System.out.print("Não deu pra conectar patrão");
            throw new RuntimeException(e);
        }
        return conn;
    }
    
    public Connection fechar(){
        if(conn!=null){
            try{
                System.out.println("A conexão foi fechada chefe");
                conn.close();
            }catch(SQLException e){
                System.out.println("Deu ruim meu para fechar meu consagrado");
                throw new RuntimeException(e);
            }
        }
        return conn;
    }
    
    public void cadastrar(int numero,String nome,String tipos,String evolução,String pré_evolução,String região){
        String comando = "insert into Pokédex(número,nome,tipos,evolução,pré_evolução,região) values (?,?,?,?,?,?)";
        
        try(
            Connection conn = abrir();
            PreparedStatement stmt = conn.prepareStatement(comando);
        ){
            stmt.setInt(1, numero);
            stmt.setString(2, nome);
            stmt.setString(3, tipos);
            stmt.setString(4, evolução);
            stmt.setString(5, pré_evolução);
            stmt.setString(6, região);
            
            stmt.execute();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void deletar(int numero){
        String comando = "delete from Pokédex where número = ?";
        
        try(
            Connection conn = abrir();
            PreparedStatement stmt = conn.prepareStatement(comando)
        ){
            stmt.setInt(1, numero);
            
            stmt.execute();
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public int pesquisar(int numero){
        String comando = "select número from Pokédex where número = ?";
        
        try(
            Connection conn = abrir();
            PreparedStatement stmt = conn.prepareStatement(comando)
        ){
            stmt.setInt(1, numero);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return rs.getInt("número");
            }    
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return -1;
    }
    
    public String seletor(int numero){
        String comando = "select * from Pokédex where número = ?";
        
        try(
            Connection conn = abrir();
            PreparedStatement stmt = conn.prepareStatement(comando);
        ){
            stmt.setInt(1, numero);
            
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    int número = rs.getInt("número");
                    String nome = rs.getString("nome");
                    String tipo = rs.getString("tipos");
                    String evolução = rs.getString("evolução");
                    String pré_evolução = rs.getString("pré_evolução");
                    String região = rs.getString("região");
                    
                    return "Pokémon:"+nome+"\nTipo:"+tipo+"\nEvolução:"+evolução+"\nPré Evolução:"+pré_evolução+"\nRegião Originária:"+região;
                }else{
                    return null;
                }
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public int atualizar(int numero,String nome,String tipos,String evolução,String pré_evolução,String região){
        StringBuilder comando = new StringBuilder("update Pokédex set");
        ArrayList parametros = new ArrayList();
        
        if(nome!= null && !nome.isEmpty()){
            comando.append(" nome = ?, ");
            parametros.add(nome);
        }
        
        if(tipos!= null && !tipos.isEmpty()){
            comando.append(" tipos = ?, ");
            parametros.add(tipos);
        }
        
        if(evolução!= null && !evolução.isEmpty()){
            comando.append(" evolução = ?, ");
            parametros.add(evolução);
        }
        
        if(pré_evolução!= null && !pré_evolução.isEmpty()){
            comando.append(" pré_evolução = ?, ");
            parametros.add(pré_evolução);
        }
        
        if(região!= null && !região.isEmpty()){
            comando.append(" região = ?, ");
            parametros.add(região);
        }
        
        if(parametros.isEmpty()){
            throw new IllegalArgumentException("Nenhuma atualização.");
        }
        
        comando.setLength(comando.length() - 2);
        comando.append(" WHERE número = ?");
        parametros.add(numero);  
        
        try(
            Connection conn = abrir();
            PreparedStatement stmt = conn.prepareStatement(comando.toString());
        ){
            for(int i=0;i<parametros.size();i++){
                stmt.setObject(i+1,parametros.get(i));
            }
            
            stmt.execute();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return numero;
    }
    
    public String Listar(String região,String tipo){
        StringBuilder comando = new StringBuilder("select * from pokédex");
        ArrayList parametros = new ArrayList();
        
        if(região!= null && !região.isEmpty()){
            if(parametros.isEmpty()){
                comando.append(" WHERE região = ?");
            }else{
                comando.append(" AND região = ?");
            }
            parametros.add(região);
        }
        
        if(tipo!= null && !tipo.isEmpty()){
            if(parametros.isEmpty()){
                comando.append(" WHERE tipos = ?");
            }else{
                comando.append(" AND tipos = ?");
            }
            parametros.add(tipo);
        }
        
        if(parametros.isEmpty()){
            throw new IllegalArgumentException("Nenhum parâmetro fornecido.");
        }
        
        try(
            Connection conn = abrir();
            PreparedStatement stmt = conn.prepareStatement(comando.toString());
        ){
            for(int i=0;i<parametros.size();i++){
                stmt.setObject(i+1,parametros.get(i));
            }
            
            ResultSet rs = stmt.executeQuery();
            StringBuilder resultado = new StringBuilder();
            
            while (rs.next()) {
            resultado.append("Número: ").append(rs.getInt("numero"))
                     .append(", Nome: ").append(rs.getString("nome"))
                     .append(", Tipos: ").append(rs.getString("tipos"))
                     .append(", Evolução: ").append(rs.getString("evolucao"))
                     .append(", Pré-evolução: ").append(rs.getString("pre_evolucao"))
                     .append(", Região: ").append(rs.getString("regiao"))
                     .append("\n");
            }
            
            return resultado.toString();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    };
    
}