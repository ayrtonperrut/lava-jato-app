package com.lavajato.models;



import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "veiculo")
public class VeiculoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "placa")
    private String placa;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "ano")
    private int ano;

    @Column(name = "dono_veiculo")
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

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}
