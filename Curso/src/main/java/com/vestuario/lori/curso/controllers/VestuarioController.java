package com.vestuario.lori.curso.controllers;

import com.vestuario.lori.curso.vestuario.DadosCadastroVestuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vestuario")
public class VestuarioController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroVestuario dados){
        System.out.println(dados);
    }

}
