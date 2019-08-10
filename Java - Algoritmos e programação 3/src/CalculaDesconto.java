import java.util.Scanner;

public class CalculaDesconto {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valor = tc.nextDouble();
        System.out.println("Digite o percentual de desconto");
        double desconto = tc.nextDouble();
        desconto = valor * desconto /100;
        double valorFinal = valor - desconto;
        System.out.println("Desconto: " + desconto);
        System.out.println("Valor do produto com desconto: " + valorFinal);
    }
}