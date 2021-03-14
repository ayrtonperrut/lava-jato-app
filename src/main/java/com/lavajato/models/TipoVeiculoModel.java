package com.lavajato.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class TipoVeiculoModel implements Serializable {

    @Id
    private Integer id;

    private String leve;
    private String pesado;
    private String motocicleta;


    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }

    public String getLeve() {
        return leve;
    }

    public void setLeve(String leve) {
        this.leve = leve;
    }

    public String getPesado() {
        return pesado;
    }

    public void setPesado(String pesado) {
        this.pesado = pesado;
    }

    public String getMotocicleta() {
        return motocicleta;
    }

    public void setMotocicleta(String motocicleta) {
        this.motocicleta = motocicleta;
    }
}
