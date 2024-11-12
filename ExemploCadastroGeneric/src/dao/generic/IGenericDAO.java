package dao.generic;

import domain.Cliente;
import domain.Persistente;

import java.util.Collection;

public interface  IGenericDAO <T extends Persistente>{

    public Boolean cadastrar(T entity);

    public Boolean excluir(Long valor);

    public Boolean alterar(T entity);

    public T consultar(Long valor);

    public Collection<T> buscarTodos();

}
