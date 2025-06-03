public class ListaDinamicaGenerica<T> {
    
    // ponteiroInicio
    // ponteiroFim
    // quantidade
    // tamanho 

    private NoDuplo<T> ponteiroInicio;
    private NoDuplo<T> ponteiroFim;
    private int quantidade;
    private int tamanho; 

    public ListaDinamicaGenerica() {
        this(10);
    }

    public ListaDinamicaGenerica(int tamanho) {
        ponteiroInicio = null;
        ponteiroFim = null;
        quantidade = 0;
        tamanho = 0;
    }

}
