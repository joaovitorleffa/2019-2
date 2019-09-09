package Aula05_Exercicios;

import java.util.Scanner;

public class TestaContagem {
    public static void main(String[] args) {
        int inicio, fim, pausa;
        Scanner tc = new Scanner(System.in);
        Contagem contagem = new Contagem();

        System.out.println("Primeira Contagem");
        contagem.contar();

        System.out.println(" ============ ");

        System.out.println("Segunda Contagem \n");
        System.out.println("Digite o fim da contagem: ");
        contagem.contar(fim = tc.nextInt());

        System.out.println(" ============ ");

        System.out.println("Terceira Contagem \n");
        System.out.println("Digite o inicio da contagem: ");
        inicio = tc.nextInt();
        System.out.println("Digite o fim da contagem: ");
        fim = tc.nextInt();
        contagem.contar(inicio, fim);

        System.out.println(" =========== ");

        System.out.println("Quarta contagem \n");
        System.out.println("Digite o inicio da contagem: ");
        inicio = tc.nextInt();
        System.out.println("Digite o fim da contagem: ");
        fim = tc.nextInt();
        System.out.println("Digite a pausa para a exibição: ");
        pausa = tc.nextInt();
        contagem.contar(inicio, fim, pausa);


    }
}
