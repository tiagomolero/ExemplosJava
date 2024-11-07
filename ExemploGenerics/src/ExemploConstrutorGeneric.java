public class ExemploConstrutorGeneric {


    public static void main(String[] args) {
        ConstrutorGeneric<String> construtorGeneric = new ConstrutorGeneric<>("Teste String");
        System.out.println(construtorGeneric.getDado());

        ConstrutorGeneric<Long> construtorGenericLong = new ConstrutorGeneric<>(50l);
        System.out.println(construtorGenericLong.getDado());

    }



}
