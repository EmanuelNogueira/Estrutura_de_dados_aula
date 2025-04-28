package primeiraUnidade.Aula6;

public class Ordenacao {

    // Array de teste
    private int[] dados = {9, 4, 8, 6, 7, 90, 99, 2, 1, 3, 13};

    // Método Bubble Sort
    public void bubbleSort() {
        for (int j = 0; j < dados.length - 1; j++) {
            for (int i = 0; i < dados.length - 1 - j; i++) {
                if (dados[i] > dados[i + 1]) {
                    trocar(i, i + 1);
                }
            }
        }
    }

    // Método Selection Sort
    public void selectionSort() {
        for (int j = 0; j < dados.length; j++) {
            int indiceMenor = j;
            for (int i = j + 1; i < dados.length; i++) {
                if (dados[i] < dados[indiceMenor]) {
                    indiceMenor = i;
                }
            }
            trocar(j, indiceMenor);
        }
    }

    // Método Insertion Sort
    public void insertionSort() {
        for (int j = 1; j < dados.length; j++) {
            for (int i = j - 1; i >= 0; i--) {
                if (dados[i + 1] < dados[i]) {
                    trocar(i, i + 1);
                } else {
                    break;
                }
            }
        }
    }

    // Método auxiliar para trocar dois elementos do array
    private void trocar(int indice1, int indice2) {
        int temp = dados[indice1];
        dados[indice1] = dados[indice2];
        dados[indice2] = temp;
    }

    // Método auxiliar para imprimir o array na tela
    public String imprimirTela() {
        StringBuilder resultado = new StringBuilder("[");
        for (int i = 0; i < dados.length; i++) {
            resultado.append(dados[i]);
            if (i < dados.length - 1) {
                resultado.append(", ");
            }
        }
        resultado.append("]");
        return resultado.toString();
    }

    // Getter para acessar os dados (opcional)
    public int[] getDados() {
        return dados;
    }

}
