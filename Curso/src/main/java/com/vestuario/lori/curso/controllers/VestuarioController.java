package com.vestuario.lori.curso.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vestuario")
public class VestuarioController {

    @PostMapping
    public void cadastrar(@RequestBody String json){
        System.out.println(json);
    }

}