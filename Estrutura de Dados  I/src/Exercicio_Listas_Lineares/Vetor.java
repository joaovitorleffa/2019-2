package Exercicio_Listas_Lineares;

public class Vetor {
    private Elemento[] elementos = new Elemento[10];
    private int totalElementos = 0;

    public void adiciona (Elemento elemento) {
        this.elementos[totalElementos] = elemento;
        totalElementos++;
        System.out.println("Endereço na memória: " + elemento);
        System.out.println("Tamanho da lista: " + tamanho());
    }

    public void remove () {
        this.elementos[totalElementos] = elementos[totalElementos - 1];
        totalElementos--;
        System.out.println("edenreço na memória: " + elementos);
        System.out.println("Tamanho da lista: " + tamanho());
    }

    public void limpaLista() {
        for (int i=0; i<totalElementos; i++) {
            this.elementos[totalElementos] = elementos[totalElementos-1];
            totalElementos--;
        }
        System.out.println("Tamanho da lista: " + tamanho());
    }

    public int tamanho() {
        return  totalElementos;
    }
}
