public class Notebook {

    private String modelo;
    private Double valor;

    private Processador processador;

    public Notebook(Processador processador) {
        this.processador = processador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void montarNotebook(){
        System.out.println("Notebook montado!!");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Valor: " + this.valor);
        System.out.println("Processador: " + processador.getMarca() + " " + processador.getVersao());
    }

}
