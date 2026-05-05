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
import model.AgendamentosBean;
import model.BarbeariaBean;
/**
 *
 * @author mathe
 */
public class AgendamentosRepository {
    public void criar(AgendamentosBean agendamento){
            try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("INSERT INTO agendamentos (id_agendamento, data_agendamento, status_agendamento) VALUES (?,?,?)");
            stmt.setInt(1, agendamento.getId_agendamento());
            stmt.setDate(2, agendamento.getData_agendamento());
            stmt.setString(3, agendamento.getStatus());
            
            stmt.executeUpdate();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<AgendamentosBean> lerAgendamentos() {
        List<AgendamentosBean> agendamentos = new ArrayList();
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT a.id_agendamento,"
                    + "a.data_agendamento,"
                    + "a.data_hora,"
                    + "a.status_agendamento,"
                    + "b.nome AS nome_barbeiro,"
                    + "b.especialidades"
                    + "FROM agendamentos a"
                    + "INNER JOIN barbeiros b"
                    + "ON a.id = b.id"
                    + "WHERE a.data_agendamento = CURDATE()");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                AgendamentosBean agenda = new AgendamentosBean();
                agenda.setId_agendamento(rs.getInt("id_agendamento"));
                agenda.setData_agendamento(rs.getDate("data_agendamento"));
                agenda.setData_hora(rs.getDate("data_hora"));
                agenda.setStatus(rs.getString("status"));
                agendamentos.add(agenda);
            }
        } catch(SQLException e ) {
            e.printStackTrace();
        }
        return agendamentos;
    }
}
