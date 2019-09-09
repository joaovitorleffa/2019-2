package Exercicio_Listas_Encadeadas;

public class Lista {
    int quantidade;
    int tam;
    Elemento inicio;
    Elemento fim;

    public boolean adicionaInicio(Elemento elemento) {
        if (inicio == null) {
            inicio = elemento;
            fim = elemento;
            quantidade++;
        } else {
            elemento.proximo = inicio;
            inicio = elemento;
            quantidade++;
        }
        return true;
    }

    public boolean adicionaFim(Elemento elemento) {
        if (inicio == null) {
            inicio = elemento;
            fim = elemento;
            quantidade++;
        } else {

            fim.proximo = elemento;
            fim = elemento;
            quantidade++;
        }
        return true;
    }

    public void mostrar() {
        if (inicio == null) {
            System.out.println("Lista Vazia");
        } else {
            Elemento aux = inicio;
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.proximo;
            }
        }
    }
}
