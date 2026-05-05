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
import java.util.ArrayList;
import java.util.List;
import model.BarbeariaBean;

/**
 *
 * @author mathe
 */
public class BarbeariaRepository {
    
       public List<BarbeariaBean> ler() {
        List<BarbeariaBean> barbearia = new ArrayList();
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM barbeiros");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                BarbeariaBean barbeiro = new BarbeariaBean();
                barbeiro.setId(rs.getInt("id"));
                barbeiro.setNome(rs.getString("nome"));
                barbeiro.setEspecialidades(rs.getString("especialidades"));
                barbeiro.setHorarios(rs.getDate("horarios"));
                barbearia.add(barbeiro);
            }
        } catch(SQLException e ) {
            e.printStackTrace();
        }
        return barbearia;
    }
}