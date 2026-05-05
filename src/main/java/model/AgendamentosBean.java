/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author mathe
 */
public class AgendamentosBean {
    private int id_agendamento;
    private Date data_agendamento;
    private Date data_hora;
    private String status;

    public AgendamentosBean() {
    }

    public AgendamentosBean(int id_agendamento, Date data_agendamento, Date data_hora, String status) {
        this.id_agendamento = id_agendamento;
        this.data_agendamento = data_agendamento;
        this.data_hora = data_hora;
        this.status = status;
    }

    public int getId_agendamento() {
        return id_agendamento;
    }

    public void setId_agendamento(int id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public Date getData_agendamento() {
        return data_agendamento;
    }

    public void setData_agendamento(Date data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
    
}
