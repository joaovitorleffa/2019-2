import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        DecimalFormat data = new DecimalFormat("##.##,####");
        System.out.println("digite uma data");
        Scanner tc = new Scanner(System.in);
        double numero = tc.nextDouble();
        System.out.println(data.format(numero));
    }
}
