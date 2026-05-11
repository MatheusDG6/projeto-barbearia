/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.UsuarioBean;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aluno
 */
@Repository
public class UsuarioRepository {
    
    
    public void registrar(UsuarioBean usuario){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("INSERT INTO usuarios (nome, email, senha) VALUES (?,?, ?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public UsuarioBean logar(String email, String senha) {
        UsuarioBean usuario = new UsuarioBean();
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;        
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM usuarios WHERE email = ? AND senha = ?");
            
             stmt.setString(1, email);
             stmt.setString(2, senha);
             rs = stmt.executeQuery();

            if (rs.next()) {         
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }
    
    public void SalvarUsuario(UsuarioBean update){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("UPDATE usuarios SET nome = ?, email = ?, senha = ? WHERE id_usuario = ? ");
            
  
                stmt.setString(1, update.getNome());
                stmt.setString(2, update.getEmail());
                stmt.setString(3, update.getSenha());
                stmt.setInt(4, update.getId_usuario());
                
                
                 stmt.executeUpdate();
            
    }catch (SQLException e){
           e.printStackTrace();
        }
    
    }
}