package wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExemploWildcard {

    public static void main(String[] args) {

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());

        imprimirFrutasWildCard(frutas);
        imprimirFrutasWildCardExtends(frutas);
        imprimirFrutasWildCard(frutas);
    }

    public static void imprimirFrutasWildCard(List<?> frutas){
        System.out.println("WildCard Generic");
        for(Object fruta : frutas){
            System.out.println(fruta);
        }
    }

    public static void imprimirFrutasWildCardExtends(List<? extends Fruta> frutas){
        System.out.println("WildCard Generic Extends");
        for(Fruta fruta : frutas){
            System.out.println(fruta);
        }
    }

    public static void imprimirFrutasWildCardSuper(List<? super Collection> frutas){
        System.out.println("WildCard Generic Super");
        for(Object fruta : frutas){
            System.out.println(fruta);
        }
    }

}
