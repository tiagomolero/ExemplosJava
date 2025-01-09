package interfacesfuncionais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class TesteRealizaOperacaoLambda {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("MULTIPLICA TODOS OS NÚMERO POR 2");
        calculadora(list, (n) -> n * 2);

        System.out.println("SOMANDO 1 À TODOS OS NÚMERO");
        calculadora(list, (n) -> n + 1);
    }

    public static void calculadora(List<Integer> list, IntFunction<Integer> function){
        list.forEach( n -> {
            n = function.apply(n);
            System.out.println(n + " ");
        });
    }

}
