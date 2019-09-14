package Trabalho_Listas_Lineares;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int tamanho = 100;
        int quantidade = 0;
        int opcao;


        //Aluno[] lista = new Lista[tamanho];
        //Aluno[] lista = new Aluno[tamanho];

        Scanner tc = new Scanner(System.in);

        do{
            System.out.println("\n1- Criar Lista");
            System.out.println("2- Incluir no final");
            System.out.println("3- Incluir no início");
            System.out.println("4- incluir após um nome");
            System.out.println("5- Consultar por nome");
            System.out.println("6- Excluir do início");
            System.out.println("7- Excluir do fim");
            System.out.println("8- Excluir por código");
            System.out.println("9- Listar todos os registros");
            System.out.println("10- Listar com médias finais");
            System.out.println("11- Sair");
            opcao = tc.nextInt();

            switch (opcao) {
                case 1 : {
                    //lista = Lista.criaLista(tamanho);
                    break;
                }

                case 2 : {
                    Aluno registroDeAluno = new Aluno();
                    //lista = registroDeAluno.adicionarNoFim(registroDeAluno, lista, quantidade);
                    quantidade ++;
                    break;
                }

                case 9 : {
               //     Aluno.listarRegistros(lista, quantidade);
                }


            }

        } while (opcao > 0 && opcao < 12 );

    }
}
