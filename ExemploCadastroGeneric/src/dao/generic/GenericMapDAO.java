package dao.generic;

import domain.Persistente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericMapDAO <T extends Persistente> implements IGenericDAO<T>{

    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getTipoClasse();

    public abstract void atualizarDados(T entity, T entityCadastrado);

    public GenericMapDAO(){
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());

        if (mapaInterno.containsKey(entity.getKey())) {
            return false;
        }
        mapaInterno.put(entity.getKey(), entity);
        return true;

    }

    @Override
    public Boolean excluir(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(valor);
        if (objetoCadastrado != null){
            mapaInterno.remove(valor, objetoCadastrado);
            return true;
        }
        return null;
    }

    @Override
    public Boolean alterar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(entity.getKey());
        if(objetoCadastrado != null){
            atualizarDados(entity, objetoCadastrado);
            return true;
        }
        return false;
    }

    @Override
    public T consultar(Long codigo) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.get(codigo);
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.values();
    }
}
