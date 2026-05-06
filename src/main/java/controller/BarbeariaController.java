/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.BarbeariaBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BarbeariaService;

/**
 *
 * @author mathe
 */
@RestController
@RequestMapping("api/barbeiros")
public class BarbeariaController {
    
    @Autowired
    private BarbeariaService barbeariaService;
    
    @GetMapping
        public List<BarbeariaBean> ler(BarbeariaBean barbearia) {
        List<BarbeariaBean> lista = barbeariaService.ler();
        return lista;
    }   
}
