package Aula05_Metodos.Exemplos;

import java.util.Scanner;

public class Metodos {
    public  static void mostraTamanho (int[] vetor) {
        System.out.println("Tamanho do vetor " + vetor.length);
    }

    public static void lerVetor (int[] vetor) {
        Scanner tc = new Scanner(System.in);
        for (int i=0; i<vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = tc.nextInt();
        }
    }

    public static void mostrarVetor (int[] vetor) {
        for (int i=0; i<vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }

    public static void preencher (int[] vetor, int maximo) {

        for (int i=0; i<vetor.length; i++) {
            vetor[i] = (int) (Math.random() *  maximo);
        }
    }

    public static boolean procurar (int[] vetor, int buscar) {
        for (int i=0; i<vetor.length; i++) {
            if (vetor[i] == buscar) {
                return true;
            }
        }
        return false;
    }
}
