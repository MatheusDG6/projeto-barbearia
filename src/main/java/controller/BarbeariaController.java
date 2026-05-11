/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.BarbeariaBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BarbeariaService;
import service.TokenService;

/**
 *
 * @author mathe
 */
@RestController
@RequestMapping("api/barbeiros")
public class BarbeariaController {
    
    @Autowired
    private BarbeariaService barbeariaService;
    
    @Autowired
    private TokenService tokenService;
    
    @GetMapping
        public List<BarbeariaBean> lerTodos(
           @RequestHeader("Authorization") String auth){
        // Remove o prefixo "Bearer " para obter apenas o token
        String token = auth.replace("Bearer ", "");
        // Valida o token recebido. Se for válido, retorna a lista de barbeiros
        if(tokenService.validarToken(token)) {
            return barbeariaService.ler();
        } else {
            // Se o token não for válido, retorna null (o ideal seria retornar um erro HTTP)
            return null;
        }
    }
}
