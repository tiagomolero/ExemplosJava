package interfacesfuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TesteAvaliaExpressaoLambda {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Retorno todos os números
        System.out.println("TODOS OS NÚMEROS - TRUE");
        avaliaExpressao(list, (n) -> true);

        //Não retorno nenhum número
        System.out.println("NÃO RETORNA NADA - FALSE");
        avaliaExpressao(list, (n) -> false);

        //Retorno apenas o número 7
        System.out.println("RETORNA APENAS O NÚMERO DA VALIDAÇÃO - 7");
        avaliaExpressao(list, (n) -> n == 7);

        //Retorna os números pares
        System.out.println("RETORNO APENAS OS NÚMERO MÓDULOS DE 2 == 0- NÚMERO PARES");
        avaliaExpressao(list, (n) -> n%2 == 0);

        //Retorna os números ímpares
        System.out.println("RETORNO APENAS OS NÚMERO MÓDULOS DE 2 == 1 - NÚMERO ÍMPARES");
        avaliaExpressao(list, (n) -> n%2 == 1);

    }

    public static void avaliaExpressao(List<Integer> list, Predicate<Integer> predicate){
        list.forEach(n -> {
            if (predicate.test(n)){
                System.out.println(n + " ");
            }
        });
    }

}
