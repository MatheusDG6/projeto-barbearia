/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.AgendamentosBean;
import model.BarbeariaBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AgendamentosService;

/**
 *
 * @author mathe
 */
@RestController
@RequestMapping("api/agendamentos")
public class AgendamentosController {
    
    @Autowired
    private AgendamentosService agendamentosService;
    
    @PostMapping
        public String criar(@RequestBody AgendamentosBean agendamento) {
        agendamentosService.criar(agendamento);
        return "redirect:/agendamentos";
    }
        
    @GetMapping
        public List<AgendamentosBean> lerAgendamentos(BarbeariaBean barbearia) {
        List<AgendamentosBean> lista = agendamentosService.lerAgendamentos();
        return lista;
    }
}
