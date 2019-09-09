package Aula05_Exercicios;

import java.util.Scanner;

public class TestaMeusArrays {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite o tamanaho  que deseja: ");;
        int valor = tc.nextInt();
        int[] array1 =  MeusArrays.criarArray(valor);

        System.out.println("Digite o tamanho que deseja: ");
        valor = tc.nextInt();
        int[] array2 = MeusArrays.criarArray(valor);

        System.out.println("Digite um valor");
        valor = tc.nextInt();
        int resultado = MeusArrays.procuraNumero(array1, array2, valor);

        System.out.println("Procurando valores nos Arrays...");

        if (resultado == 1) {
            System.out.println("Valor encontrado em um dos Arrays");
        } else if (resultado == 2) {
            System.out.println("Valor encontrado nos dois Arrrays");
        } else if (resultado == 0) {
            System.out.println("Valor não foi encontrado");
        }
    }
}
