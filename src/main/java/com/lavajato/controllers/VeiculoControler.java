package com.lavajato.controllers;

import com.lavajato.LavajatoApplication;
import com.lavajato.dtos.CadastroVeiculoDTO;
import com.lavajato.services.VeiculoService;
import com.lavajato.utils.MensagemResposta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/lavajato/veiculos")
public class VeiculoControler {

    @Autowired
    VeiculoService veiculoService;

    @PostMapping("/cadastrar_veiculos")
    public MensagemResposta cadastrarVeiculo(@RequestBody CadastroVeiculoDTO cadastroVeiculo) {
        return veiculoService.cadastrarVeiculo(cadastroVeiculo);
    }

    @GetMapping("/busca_by_id/{id}")
    public MensagemResposta buscarById(@PathVariable Integer id){
        return veiculoService.buscaById(id);

    }
}
