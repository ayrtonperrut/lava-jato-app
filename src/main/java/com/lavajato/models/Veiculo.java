package com.lavajato.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Veiculo implements Serializable {

    private Long id;
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private String donoVeiculo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDonoVeiculo() {
        return donoVeiculo;
    }

    public void setDonoVeiculo(String donoVeiculo) {
        this.donoVeiculo = donoVeiculo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
