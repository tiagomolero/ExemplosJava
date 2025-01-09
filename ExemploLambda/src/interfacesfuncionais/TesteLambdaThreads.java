package interfacesfuncionais;

public class TesteLambdaThreads {

    public static void main(String[] args) {

        //Runnable normal, sem Lambda
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Rodando Runnable Normal");
            }
        };
        new Thread(r).start();

        //Runnable com Lambda
        Runnable rLambda = () -> System.out.println("Rodando Runnale com Lambda");
        new Thread(rLambda).start();

        //Thread com Lambda e com Runnable
        new Thread(() -> System.out.println("Rodando Thread Runnable com Lambda")).start();

    }

}
