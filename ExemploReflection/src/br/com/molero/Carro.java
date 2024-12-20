package br.com.molero;

public class Carro {

    private String modelo;
    private String cor;
    private Double potencia;

    public Carro(){

    }

    public Carro(String modelo, String cor, Double potencia){
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
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
