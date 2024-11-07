import java.util.ArrayList;
import java.util.List;

public class ExemploMetodo {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Palavra 1");
        palavras.add("Palavra 2");

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);

        imprimir(palavras);
        imprimir(numeros);

    }

    public static <T> void imprimir(List<T> lista){
        for(T ob : lista){
            System.out.println(ob);
        }
    }

}
