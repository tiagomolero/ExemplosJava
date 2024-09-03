package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produtos;

    public Venda(){
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void add(Produto produto) {
        this.produtos.add(produto);
    }

    public void concretizaVenda(){
        System.out.println("VENDA REALIZADA");
        System.out.println("Vendedor: " + this.vendedor.getNome());
        System.out.println("Comprador: " + this.comprador.getNome());
        System.out.println("PRODUTOS VENDIDOS");
        for (Produto prod : this.produtos){
            System.out.println("Produto: " + prod.getNome() + " - Valor: " + prod.getValor());
        }
    }

    public void cancelarVenda(){

    }
}
