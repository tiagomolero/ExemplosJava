public class ConstrutorGeneric<T> {

    private T dado;

    public ConstrutorGeneric(T dado){
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }
}
