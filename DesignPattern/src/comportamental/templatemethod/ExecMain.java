package comportamental.templatemethod;

public class ExecMain {

    public static void main(String[] args) {

        ForcasArmadas exercitoBrasileiro = new ExercitoBrasileiro();
        System.out.println(exercitoBrasileiro.getClass().getSimpleName());
        exercitoBrasileiro.executar();

        ForcasArmadas marinhaDoBrasil = new MarinhaDoBrasil();
        System.out.println(marinhaDoBrasil.getClass().getSimpleName());
        marinhaDoBrasil.executar();

        ForcasArmadas forcaAreaBrasileira = new ForcaAreaBrasileira();
        System.out.println(forcaAreaBrasileira.getClass().getSimpleName());
        forcaAreaBrasileira.executar();

    }

}
