import javax.swing.*;

public class CalculaResistencia {
    public static void main(String[] args) {
        double RE;
        double maior, menor;
        String leitura;

        leitura = JOptionPane.showInputDialog("Resistência 01: ");
        double r1 = Double.parseDouble(leitura);
        maior = r1;
        menor = r1;
        leitura = JOptionPane.showInputDialog("Resistência 02: ");
        double r2 = Double.parseDouble(leitura);
        if (r2 > maior) {
            maior = r2;
        }
        if (r2 < menor) {
            menor = r2;
        }
        leitura = JOptionPane.showInputDialog("Resistência 03");
        double r3 = Double.parseDouble(leitura);
        if (r3 > maior) {
            maior = r3;
        }
        if (r3 < menor) {
            menor = r3;
        }
        leitura = JOptionPane.showInputDialog("Resistência 04");
        double r4 = Double.parseDouble(leitura);
        if (r4 > maior) {
            maior = r4;
        }
        if (r4 < menor) {
            menor = r4;
        }

        RE = r1 + r2 + r3 + r4;
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Resistência Equivalente: " + RE);
    }
}
