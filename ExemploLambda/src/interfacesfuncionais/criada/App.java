package interfacesfuncionais.criada;

import java.util.function.BiFunction;

public class App {

    public static void main(String[] args) {
        //Utilzando Lambda para soma
        Operacao soma = (a,b) -> a + b;
        System.out.println("O resultado da soma é: " + soma.calcular(5,2));

        //Utilizando Lambda para subtraca
        Operacao subtracao = (a,b) -> a - b;
        System.out.println("O resultado da subtração é: " + subtracao.calcular(5,2));

        Long returnLong = calcular(1L, 5L,(Long b1, Long b2) -> {
          return b1 + b2;
        });

        System.out.println(returnLong);
    }

    private static Long calcular(Long n1, Long n2, BiFunction<Long, Long, Long> biFunction){
        return biFunction.apply(n1,n2);
    }

}
