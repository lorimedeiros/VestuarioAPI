package com.vestuario.lori.curso.controllers;

import com.vestuario.lori.curso.vestuario.DadosCadastroVeste;
import com.vestuario.lori.curso.vestuario.Veste;
import com.vestuario.lori.curso.vestuario.VesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vestuario")
public class VestuarioController {

    @Autowired
    private VesteRepository repo;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroVeste dados){
        repo.save(new Veste(dados));
    }

}
