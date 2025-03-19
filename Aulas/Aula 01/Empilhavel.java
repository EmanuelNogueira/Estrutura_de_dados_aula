public interface Empilhavel {
    //operações principais
    void empilhar(Object dado); //push
    Object desempilhar(); //pop
    Object espiar(); //peek
    void atualizar(Object dado); //update
    
    //operações auxiliares
    Boolean estaCheia(); //isFull
    Boolean estaVazia(); //isEmpty
    String imprimir(); //print

}

/* CONJUNTO ESTRUTURAS DE DADOS:
C - Create 
R - Read 
U - Update
D - Delete 
S - Sort (ordenar)

-----------------------------------------

TIPOS DE DADOS:
- Numéricos:
    - Inteiros:
        - unsigned int
        - tinyint, smallint
        - int
        - long, longint, bigint
    - Ponto flutuante:
        - float
        - double
    - Ponto fixo
- String
- Char
- Lógico:
    - boolean, bool
- Vetor, array, matriz unidimensional
- Ponteiro
- Objeto
*/