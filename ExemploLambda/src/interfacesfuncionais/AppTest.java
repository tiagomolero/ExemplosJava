package interfacesfuncionais;

import java.util.function.BiFunction;

public class AppTest {

    public static void main(String[] args) {

        /*
        Primeiro e Segunda Parâmetro são os parâmentros que serão usados
        para alguma coisa no método apply();
        O último parâmento "String" é o parâmetro de retorno.
         */
        BiFunction<Integer, Integer, String> biFunction = (a,b) -> {
            Integer soma = a + b;

            //Retorno uma String
            return String.valueOf(soma);
        };

        System.out.println(biFunction.apply(10,20));

    }

}
