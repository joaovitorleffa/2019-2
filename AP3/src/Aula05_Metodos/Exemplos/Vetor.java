package Aula05_Metodos.Exemplos;

public class Vetor {
    public static void main(String[] args) {
        int[] vetor = new int[6];

        Metodos.mostraTamanho(vetor);

        Metodos.lerVetor(vetor);

        Metodos.mostrarVetor(vetor);

        if (Metodos.procurar(vetor, 6)) {
            System.out.println("\nEncontrado");
        }

        // Metodos.preencher(vetor, 50);

        // System.out.println("\n");

        //Metodos.mostrarVetor(vetor);
    }
}
