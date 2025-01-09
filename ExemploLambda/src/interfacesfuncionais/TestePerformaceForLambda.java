package interfacesfuncionais;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestePerformaceForLambda {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(1_000_000);
        for(int i = 1; i <= 1_000_000; i++){
            lista.add(i);
        }

        long inicio = System.currentTimeMillis();
        Integer soma = 0;
        //Teste for comum
        for(Integer integer : lista){
            soma += integer;
        }
        long fim = System.currentTimeMillis();

        System.out.println("FOR NORMAL");
        System.out.println("Tempo de Execução: " + (fim - inicio) + "ms");

        // Teste com forEach (lambda)
        long inicioForEach = System.currentTimeMillis();
        final long[] somaForEach = {0}; // Usando array para acumular soma
        lista.forEach(numero -> somaForEach[0] += numero);
        long fimForEach = System.currentTimeMillis();
        System.out.println("FOR EACH");
        System.out.println("Tempo de Execução: " + (fimForEach - inicioForEach) + "ms");

    }


}
