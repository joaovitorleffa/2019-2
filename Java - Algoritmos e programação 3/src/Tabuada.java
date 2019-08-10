import java.util.Scanner;
import java.lang.String;
public class Tabuada {
    public static void main(String[] args) {
        int opcao;
        Scanner tc = new Scanner(System.in);

        do {
            System.out.println("Informe um numero: ");
            int num = tc.nextInt();
            for (int i = 0; i <= 10; i++) {
                int result = num * i;
                System.out.println(num + " X " + i + " = " + result);
            }
            System.out.println("Deseja realizar outra tabuada? (1 - sim / 2 - nao) ");
            opcao = tc.nextInt();
        } while (opcao == 1);
    }
}
