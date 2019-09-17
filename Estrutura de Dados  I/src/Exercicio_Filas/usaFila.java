package Exercicio_Filas;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.InternetHeaders;

import javax.swing.*;

public class usaFila {
    static Fila F = new Fila(10); // instaciando a classe fila
    int i = 0;
    int valor;

    public static void main(String[] args) {
        int opcao = 1;
        while (opcao != 4) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção \n"
            + "1- Inserir um elemento na fila\n" + "2- Excluir elemento da fila \n" + "3- Exibir elementos da fila\n"
            + "4- Sair\n"));
            int valor;
            switch (opcao) {
                case 1 : {
                    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Enfileirar elemento\n"
                    + "Digite um valor"));
                    F.enfileirar(valor);
                    break;
                }
                case 2 : {
                    F.desinfileirar();
                }
                case 3 : {
                    F.exibeFila();
                }
            }
        }
    }
}
