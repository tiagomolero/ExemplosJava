package agregacao;

public class Programa {

    public static void main(String[] args) {

        Produto produtoTV = criarProduto("TV", 2860.0);
        Produto produtPS5 = criarProduto("Playstation 5", 3890.0);

        Vendedor vendedor = criarVendedor("João", 0.2);
        Comprador comprador = criarComprador("Zé", 10000.0);

        Venda venda = new Venda();
        venda.setComprador(comprador);
        venda.setVendedor(vendedor);
        venda.add(produtoTV);
        venda.add(produtPS5);

        venda.concretizaVenda();

    }

    private static Produto criarProduto(String nome, Double valor) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setValor(valor);
        return produto;
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Comprador criarComprador(String nome, Double verba) {
        Comprador comprador = new Comprador();
        comprador.setNome(nome);
        comprador.setVerba(verba);
        return comprador;
    }

}
