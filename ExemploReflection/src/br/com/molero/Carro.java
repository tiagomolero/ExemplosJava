package br.com.molero;

import br.com.molero.anotation.Identificador;

import java.util.UUID;

public class Carro {

    @Identificador("id")
    private UUID id;
    private String modelo;
    private String cor;
    private Double potencia;

    public Carro(){

    }

    public Carro(UUID id,String modelo, String cor, Double potencia){
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
    }

    public UUID getId(){
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }
}
