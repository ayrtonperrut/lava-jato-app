package com.lavajato.dtos;

public class CadastroVeiculoDTO {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String donoVeiculo;

    public String getDonoVeiculo() {
        return donoVeiculo;
    }

    public void setDonoVeiculo(String donoVeiculo) {
        this.donoVeiculo = donoVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
