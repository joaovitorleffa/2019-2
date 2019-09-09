import javax.swing.*;
import java.util.Scanner;

public class VerificaLogin {
    public static void main(String[] args) {
        String login = "java8";
        String senha = "java8";
        String tentativaLogin;
        String tentativaSenha;
        int contador = 0;
        do {
            Scanner tc = new Scanner(System.in);

            System.out.println("Login: ");
            tentativaLogin = tc.next();

            System.out.println("Senha: ");
            tentativaSenha = tc.next();

            contador ++;
            System.out.println("Você errou! Você ainda tem " + (3 - contador) + " tentativas");
            if (contador == 3) {
                System.out.println("Você atingiu o número máximo de tentativas");
            }
            if (tentativaLogin == login && tentativaSenha == senha) {
                System.out.println("Login realizado com sucesso!");
            }
        } while ((tentativaLogin != login) || (tentativaSenha != senha) || contador < 2);
    }
}
