import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class CalculaImposto {
    public static void main(String[] args) {
        double valorTransacao;
        double valorVenal;
        double percentualImposto;
        double maiorValor;
        double valorFinal;
        String leitura;

        leitura = JOptionPane.showInputDialog("Digite o valor da transação: ");
        valorTransacao = Double.parseDouble(leitura);
        maiorValor = valorTransacao;
        leitura = JOptionPane.showInputDialog ("Digite o valor Venal: ");
        valorVenal = Double.parseDouble(leitura);
        if (valorVenal > maiorValor) {
            maiorValor = valorVenal;
        }
        leitura = JOptionPane.showInputDialog("Digite o valor do imposto: ");
        percentualImposto = Double.parseDouble(leitura);

        double valorImposto = (maiorValor * percentualImposto / 100);
        valorFinal = maiorValor + valorImposto;
        System.out.println("Valor do imposto a ser pago: " + valorImposto);
        System.out.println("Valor total a ser pago: " + valorFinal);



    }
}
