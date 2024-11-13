package domain;

import java.util.Objects;

public class Produto implements Persistente{

    private Long codigo;
    private String nome;
    private Long quantidade;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String codigo, String nome, String quantidade) {
        this.codigo = Long.valueOf(codigo);
        this.nome = nome;
        this.quantidade = Long.valueOf(quantidade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo) && Objects.equals(nome, produto.nome) && Objects.equals(quantidade, produto.quantidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, quantidade);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public Long getKey() {
        return this.codigo;
    }
}
