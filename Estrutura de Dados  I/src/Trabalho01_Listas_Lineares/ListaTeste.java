package Trabalho01_Listas_Lineares;

import java.util.Scanner;

public class ListaTeste {
    public static void main(String[] args) {
        int opcao;
        Scanner tc = new Scanner(System.in);
        Lista lista = new Lista();
        opcao = tc.nextInt();

        do {
            switch (opcao) {
                case 1 : {
                    //Lista lista = new Lista();
                    break;
                }
                case 2 : {
                    Aluno novoAluno = new Aluno();
                    novoAluno.lerAluno();
                    lista.adicionaNoFim(novoAluno);
                    break;
                }
            }
        } while(opcao != 11);
    }
}
