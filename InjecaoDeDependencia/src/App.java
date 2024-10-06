public class App {

    public static void main(String[] args) {
        Processador processador = new Processador();
        processador.setMarca("Inter");
        processador.setVersao("i5 8700K");

        Notebook notebook = new Notebook(processador);
        notebook.setModelo("Dell Alienware");
        notebook.setValor(5700.0);
        notebook.montarNotebook();
    }

}
