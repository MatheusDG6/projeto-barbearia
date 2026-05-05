/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.BarbeariaBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BarbeariaRepository;

/**
 *
 * @author mathe
 */
@Service
public class BarbeariaService {
    
    @Autowired
    private BarbeariaRepository repository;
    
    public List<BarbeariaBean> ler(){
        return repository.ler();
    }
}
