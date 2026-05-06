/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.AgendamentosBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AgendamentosRepository;

/**
 *
 * @author mathe
 */
@Service
public class AgendamentosService {
    
    @Autowired
    private AgendamentosRepository repository;
    
    public void criar(AgendamentosBean agendamentos) {
        repository.criar(agendamentos);
    }
    
    public List<AgendamentosBean> lerAgendamentos() {
        return repository.lerAgendamentos();
    }
}
