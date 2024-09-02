import classes.CanetaEsferografica;
import classes.Giz;
import classes.Lapis;
import interfaces.ICaneta;

public class ExecMain {

    public static void main(String[] args) {
        ICaneta lapis = new Lapis();
        lapis.escrever("Lápis");
        System.out.println(lapis.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Giz");
        System.out.println(giz.getCor());

        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Caneta");
        System.out.println(caneta.getCor());

    }

}
