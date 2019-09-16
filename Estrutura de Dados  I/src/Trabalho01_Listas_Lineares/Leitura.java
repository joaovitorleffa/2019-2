package Trabalho01_Listas_Lineares;
import java.util.Scanner;

public class Leitura {
    //valida email
    public static String validaEmail(String email) {
        Scanner tc = new Scanner(System.in);
        String resultEmail = email;
        while (!resultEmail.contains("@")) {
            if (!resultEmail.contains("@")) {
                System.out.print("Email inválido! Digite novamente: ");
            }
            resultEmail = tc.next();
        }
        return resultEmail;
    }

    //valida telefone
    public static String validaTelefone(String telefone) {
        Scanner tc = new Scanner(System.in);
        String resultTel = telefone;
        while (resultTel.length() != 11) {
            System.out.print("Número de telefone inválido! Digite novamente: ");
            resultTel = tc.next();
        }
        return resultTel;
    }

    //valida notas
    public static double validaNotas(double nota) {
        Scanner tc = new Scanner(System.in);
        double resultNota = nota;
        while (resultNota > 10 || resultNota < 0) {
            System.out.print("Nota inválida! Digite Novamente: ");
            resultNota = tc.nextDouble();
        }
        return resultNota;
    }
}
