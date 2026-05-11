/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.UsuarioBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;

/**
 *
 * @author Aluno
 */
@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;
    
    public void registrar(UsuarioBean usuario){
        repository.registrar(usuario);
    }
    public UsuarioBean logar(String email, String senha){
        return repository.logar(email, senha);
    }
    public void SalvarUsuario(UsuarioBean update){
        repository.SalvarUsuario(update);
    }
}
