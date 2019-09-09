import javax.swing.*;
import java.awt.*;

public class CalculaMedia {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double notaTrabalho;
        double media;
        String leitura;

        leitura = JOptionPane.showInputDialog("Digite a Nota da Prova 1: ");
        nota1 = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite a Nota da Prova 2: ");
        nota2 = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite a Nota do Trabalho");
        notaTrabalho = Double.parseDouble(leitura);

        media = (nota1 + nota2 + notaTrabalho) / 3;

        if (media >= 6) {
            System.out.println("Sua nota: " + media + " Parabéns você foi aprovado!");
        } else {
            System.out.println("Sua nota: " + media + " Você foi Reprovado! Estude mais da Próxima ;)");
        }
    }
}
