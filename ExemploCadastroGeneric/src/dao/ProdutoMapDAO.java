package dao;

import dao.generic.GenericMapDAO;
import domain.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoMapDAO extends GenericMapDAO<Produto> implements IProdutoDAO{

    public ProdutoMapDAO(){
        super();
        Map<Long, Produto> mapaInterno = this.map.get(getTipoClasse());
        if(mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto produto, Produto produtoCadastrado) {
        produtoCadastrado.setNome(produto.getNome());
        produtoCadastrado.setQuantidade(produto.getQuantidade());
    }
}
