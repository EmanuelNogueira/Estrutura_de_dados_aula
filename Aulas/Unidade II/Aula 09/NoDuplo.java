public class NoDuplo<T> {

    private NoDuplo<T> anterior;
    private T dado;
    private NoDuplo<T> proximo;

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setAnterior(NoDuplo<T> insert) {
        this.anterior = insert;
    }

    public void setProximo(NoDuplo<T> insert) {
        this.proximo = insert;
    }
}