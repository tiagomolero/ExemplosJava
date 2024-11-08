package dao;

import dao.generic.GenericMapDAO;
import domain.Cliente;
import domain.Produto;

import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericMapDAO<Cliente> implements IClienteDAO {

    public ClienteMapDAO() {
        super();
        Map<Long, Cliente> mapaInterno = this.map.get(getTipoClasse());
        if(mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente cliente, Cliente clienteCadastrado) {
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setTel(cliente.getTel());
        clienteCadastrado.setNumero(cliente.getNumero());
        clienteCadastrado.setEnd(cliente.getEnd());
        clienteCadastrado.setCidade(cliente.getCidade());
        clienteCadastrado.setEstado(cliente.getEstado());
    }
}