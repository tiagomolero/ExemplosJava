package classes;

import interfaces.ICaneta;

public class Lapis implements ICaneta {

    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo com " + texto + " em " + getCor());
    }

    @Override
    public String getCor() {
        return "Preto";
    }
}
