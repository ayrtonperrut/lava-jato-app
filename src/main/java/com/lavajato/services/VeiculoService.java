package com.lavajato.services;

import com.lavajato.dtos.CadastroVeiculoDTO;
import com.lavajato.models.VeiculoModel;
import com.lavajato.repositories.VeiculoRepository;
import com.lavajato.utils.MensagemResposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;


    public MensagemResposta cadastrarVeiculo (CadastroVeiculoDTO cadastroVeiculoDTO){
        VeiculoModel veiculo;
        MensagemResposta mensagemResposta = new MensagemResposta();
        mensagemResposta.setMensagem("Veiculo cadastrado: "+ cadastroVeiculoDTO.getMarca() +
                cadastroVeiculoDTO.getModelo() + cadastroVeiculoDTO.getAno() + cadastroVeiculoDTO.getPlaca());

        return mensagemResposta;
    }
}
