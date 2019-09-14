package Exercicio_Listas_Lineares;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class TestaLista {
    public static void main(String[] args) {
        Elemento elemento1 = new Elemento(1); //atribuindo valor ao inteiro da classe Elemento
        Elemento elemento2 = new Elemento(2);

        Vetor lista = new Vetor(); //instanciando objeto

        Scanner tc = new Scanner(System.in);

        int opcao;

        do{

            System.out.println("1- Criar Lista");
            System.out.println("2- Inserir no final");
            System.out.println("3- Excluir no final");
            System.out.println("4- Apagar Lista");
            System.out.println("5- Sair");
            opcao = tc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Lista Criada");
                    System.out.println("Tamanho da lista: " + lista.tamanho());
                break;

                case 2:
                    Elemento elemento = new  Elemento(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ")));
                    lista.adiciona(elemento);
                break;

                case 3:
                    lista.remove();
                break;

                case 4:
                    lista.limpaLista();
                break;

            }
        } while (opcao != 5);


        //exemplo do uso dos métodos sem o menu


        System.out.println(lista.tamanho());
        lista.adiciona(elemento1);
        System.out.println(lista.tamanho());
        lista.adiciona(elemento2);
        System.out.println(lista.tamanho());
        lista.remove();
        System.out.println(lista.tamanho());
        lista.limpaLista();
        System.out.println(lista.tamanho());


    }
}
