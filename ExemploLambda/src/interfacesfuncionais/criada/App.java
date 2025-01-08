package interfacesfuncionais.criada;

public class App {

    public static void main(String[] args) {
        //Utilzando Lambda para soma
        Operacao soma = (a,b) -> a + b;
        System.out.println("O resultado da soma é: " + soma.calcular(5,2));

        //Utilizando Lambda para subtraca
        Operacao subtracao = (a,b) -> a - b;
        System.out.println("O resultado da subtração é: " + subtracao.calcular(5,2));

    }

}
