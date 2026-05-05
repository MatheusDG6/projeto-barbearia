/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author mathe
 */
public class BarbeariaBean {
    private int id;
    private String nome;
    private String especialidades;
    private Date horarios;  

    public BarbeariaBean() {
    }

    public BarbeariaBean(int id, String nome, String especialidades, Date horarios) {
        this.id = id;
        this.nome = nome;
        this.especialidades = especialidades;
        this.horarios = horarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public Date getHorarios() {
        return horarios;
    }

    public void setHorarios(Date horarios) {
        this.horarios = horarios;
    }
    
    
}
