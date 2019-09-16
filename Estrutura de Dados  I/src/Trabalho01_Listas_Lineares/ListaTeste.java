package Trabalho01_Listas_Lineares;

import java.util.Scanner;

public class ListaTeste {
    public static void main(String[] args) {
        int opcao;
        Scanner tc = new Scanner(System.in);
        Lista lista = new Lista();


        do {
            System.out.println("\n1- Criar Lista");
            System.out.println("2- Incluir no fim");
            System.out.println("3- Incluir no início");
            System.out.println("4- Incluir após um nome");
            System.out.println("5- Consultar por nome");
            System.out.println("6- Excluir do início");
            System.out.println("7- Excluir do fim");
            System.out.println("8- Excluir por código");
            System.out.println("9- Listar registros");
            System.out.println("10- Listar com médias");
            System.out.println("11- Sair");
            opcao = tc.nextInt();
            switch (opcao) {
                case 1 : {
                    lista = lista.criarLista();
                    break;
                }
                case 2 : {
                    System.out.println("\n***** Incluindo no fim *****");
                    Aluno novoAluno = new Aluno();
                    novoAluno.lerAluno();
                    lista.adicionaNoFim(novoAluno);
                    break;
                }
                case 3 : {
                    Aluno novoAluno = new Aluno();
                    novoAluno.lerAluno();
                    lista.adicionaNoInicio(novoAluno);
                    break;
                }
                case 4 : {
                    System.out.print("\nDigite o nome do Aluno: ");
                    String nomeAluno = tc.next();
                    Aluno novoAluno = new Aluno();
                    System.out.println("\nDigite os dados: \n");
                    novoAluno.lerAluno();
                    lista.adicionaAposNome(novoAluno, nomeAluno);
                    break;
                }
                case 5 : {
                    System.out.print("\nDigite um nome: ");
                    String nomeParaBusca = tc.next();
                    lista.consultarPorNome(nomeParaBusca);
                    break;
                }
                case 6 : {
                    lista.exluirDoInicio();
                    break;
                }
                case 7 : {
                    lista.excluirDoFim();
                    break;
                }
                case 8 : {
                    System.out.print("Digite o código: ");
                    String codigoParaExcluir = tc.next();
                    lista.excluirPorCodigo(codigoParaExcluir);
                }
                case 9 : {
                    lista.listarRegistros();
                    break;
                }
                case 10 : {
                    lista.listarComMedias();
                }
                case 11 : {
                    break;
                }
            }
            if (opcao < 1 || opcao > 12) {
                System.out.println("Opção inválida!");
            }
        } while(opcao != 11);
    }
}
