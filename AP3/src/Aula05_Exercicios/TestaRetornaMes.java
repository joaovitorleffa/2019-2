package Aula05_Exercicios;

import javax.swing.*;
import java.util.Scanner;

public class TestaRetornaMes {
    public static void main(String[] args) {
        RetornaMes mes = new RetornaMes();
        String leitura;
        int numMes, codigo;

        JOptionPane.showMessageDialog(null, "Descubra o mês");
        do {
            mes.getMesPorExtenso(codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ", "0- Parar | 1-Portugês | 2-Inglês")),
                    numMes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: ")));
        } while (codigo != 0);
    }
}
