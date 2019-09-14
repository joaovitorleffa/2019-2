package Trabalho_Listas_Lineares;

import Exercicio_Listas_Encadeadas.Elemento;

import java.util.Scanner;

public class Aluno {
    //private Aluno[] lista = new Aluno[tamanho];
    private int tamanho = 0;
    String codigo;
    String nome;
    String telefone;
    String email;
    double notaG1;
    double notaG2;

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nNome: " + nome +
                "\nTelefone: " + telefone +
                "\nEmail: " + email +
                "\nNota G1: " + notaG1 +
                "\nNota G2: " + notaG2;
    }

    public void criarLista() {

    }

    public void ler() {
        Scanner tc = new Scanner(System.in);
        System.out.print("\nDigite o código: ");
        codigo = tc.next();
        System.out.print("Digite o nome: ");
        nome = tc.next();
        System.out.print("Digite o telefone: ");
        telefone = tc.next();
        System.out.print("Digite o email: ");
        email = tc.next();
        System.out.print("Digite a nota G1: ");
        notaG1 = tc.nextDouble();
        System.out.print("Digite a nota G2: ");
        notaG2 = tc.nextDouble();
    }

    public Aluno[] adicionarNoFim(Aluno aluno, Aluno[] lista, int quantidade) {
        aluno.ler(); //chama o metodo ler
        //this.lista[quantidade] = aluno;
        quantidade++;
        return lista;
    }


    public static void listarRegistros(Aluno[] lista, int quantidade) {
        int i;
        System.out.println("Registro = " + quantidade);
        for (i = 0; i < quantidade; i++) {
            System.out.println(lista[i]);
        }
    }



}
