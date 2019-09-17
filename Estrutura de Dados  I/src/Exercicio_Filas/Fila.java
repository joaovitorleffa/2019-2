package Exercicio_Filas;

public class Fila {
    int tamanho;
    int inicio;
    int fim;
    int total;
    int vetor[]; //contêiner para armazenar os elementos
        Fila (int tam) { //construtor da classe
            inicio = 0;
            fim = 0;
            total = 0;
            tamanho = tam;
            vetor = new int [tam];
        }
    // verifica se a fila está vazia
    public boolean vazia() {
            if (total == 0) {
                return true; //fila vazia
            } else {
                return false; //fila não está vazia
            }
    }
    // verifica se a fila está cheia
    public boolean cheia() {
            if (total >= tamanho) {
                return true; //fila cheia
            } else {
                return false; //fila não está cheia
            }
    }
    // enfileirar
    public void enfileirar(int elemento) {
            if (!cheia()) { //se a fila não estiver cheia ->
                vetor[fim] = elemento;
                fim++;
                total++;
            } else {
                System.out.println("Fila Cheia");
            }
    }
    // desinfileirar
     public void desinfileirar() {
        for (int i = 0; i < total; i++) {
            vetor[i] = vetor[i+1];
        }
        total--;
    }


    // exibe fila
    public void exibeFila() {
            for (int i = 0; i < total; i++) {
                System.out.println("posição: " + i + " / valor " + vetor[i]);
            }
        System.out.println(" ");
    }
}
