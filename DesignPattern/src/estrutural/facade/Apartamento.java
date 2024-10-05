package estrutural.facade;

public class Apartamento {

    private Long codigo;
    private String endereco;
    private String contato;
    private Double valor;

    public Apartamento(Long codigo, String endereco, String contato, Double valor) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.contato = contato;
        this.valor = valor;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
