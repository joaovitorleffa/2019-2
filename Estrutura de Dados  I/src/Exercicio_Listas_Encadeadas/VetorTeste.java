package Exercicio_Listas_Encadeadas;

public class VetorTeste {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.tam = 10; //tam: 10; qtd: 0; inicio: null; fim: null

        Elemento elemento1 = new Elemento();

        elemento1.leVetor();
        lista1.adicionaInicio(elemento1);
        Elemento elemento2 = new Elemento();
        elemento2.leVetor();
        lista1.adicionaFim(elemento2);
        lista1.mostrar();


    }
}
