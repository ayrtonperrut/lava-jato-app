package com.lavajato.services;

import com.lavajato.dtos.CadastroVeiculoDTO;
import com.lavajato.models.VeiculoModel;
import com.lavajato.repositories.VeiculoRepository;
import com.lavajato.utils.MensagemResposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;


    public MensagemResposta cadastrarVeiculo (CadastroVeiculoDTO cadastroVeiculoDTO){
        VeiculoModel veiculoModel = new VeiculoModel();
        veiculoModel.setMarca(cadastroVeiculoDTO.getMarca());
        veiculoModel.setModelo(cadastroVeiculoDTO.getModelo());
        veiculoModel.setDonoVeiculo(cadastroVeiculoDTO.getDonoVeiculo());
        veiculoModel.setPlaca(cadastroVeiculoDTO.getPlaca());
        veiculoModel.setAno(cadastroVeiculoDTO.getAno());

        veiculoRepository.save(veiculoModel);

        MensagemResposta mensagemResposta = new MensagemResposta();
        mensagemResposta.setMensagem("Veiculo cadastrado: "+ " |Marca: " + cadastroVeiculoDTO.getMarca() +
               " |Modelo: " + cadastroVeiculoDTO.getModelo() + " |Ano: "+ cadastroVeiculoDTO.getAno() +
                " |Placa: " + cadastroVeiculoDTO.getPlaca() + " |Dono: "+ cadastroVeiculoDTO.getDonoVeiculo());
        mensagemResposta.setStatusRequisicao(true);

        return mensagemResposta;
    }

    public MensagemResposta buscaById(Integer id){
        Optional<VeiculoModel> veiculoModel = veiculoRepository.findById(id);

        MensagemResposta mensagemResposta = new MensagemResposta();
        mensagemResposta.setMensagem("Dono: " + veiculoModel.get().getDonoVeiculo() +" |Placa = " +
                veiculoModel.get().getPlaca() + " |Modelo: " + veiculoModel.get().getModelo() +
                " |Marca: " + veiculoModel.get().getMarca()+ " |Ano: " +  veiculoModel.get().getAno());
        mensagemResposta.setStatusRequisicao(true);

        return mensagemResposta;

    }
}
