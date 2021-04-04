package com.lavajato.controllers;

import com.lavajato.LavajatoApplication;
import com.lavajato.dtos.CadastroVeiculoDTO;
import com.lavajato.services.VeiculoService;
import com.lavajato.utils.MensagemResposta;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("lavajato/veiculos")
public class VeiculoControler {

    @PostMapping("cadastrar_veiculos")
    public MensagemResposta cadastrarVeiculo(@RequestBody CadastroVeiculoDTO cadastroVeiculo) {
        ApplicationContext ctx = LavajatoApplication.getContext();
        VeiculoService veiculoService = ctx.getBean(VeiculoService.class);
        return veiculoService.cadastrarVeiculo(cadastroVeiculo);
    }

}
