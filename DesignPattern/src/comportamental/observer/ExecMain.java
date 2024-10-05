package comportamental.observer;

public class ExecMain {

    public static void main(String[] args) {
        Jornalista jornalista = new Jornalista();
        jornalista.add(new TV());
        jornalista.add(new Internet());
        jornalista.notifyAll("URGENTE! O Gestor de Tráfego acaba de conseguir o seu primeiro cliente!!");
    }

}
