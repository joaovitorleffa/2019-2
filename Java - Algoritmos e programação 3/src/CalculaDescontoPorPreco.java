import java.util.Scanner;

public class CalculaDescontoPorPreco {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Nome do Produto: ");
        String nomeProduto = tc.next();
        System.out.println("Valor do Produto: ");
        double valorProduto = tc.nextDouble();

        double valorFinal;

        if (valorProduto < 50) {
            System.out.println("Nome do produto: " + nomeProduto);
            System.out.println("Valor do produto: " + valorProduto);
            System.out.println("Esse produto não possui desconto!");
        } else if (valorProduto >= 50 && valorProduto < 200) {
            valorFinal = (valorProduto - (valorProduto * 5/100));
            System.out.println("Nome do produto: " + nomeProduto);
            System.out.println("Valor do produto: " + valorProduto);
            System.out.println("Valor do produto com desconto: " + valorFinal);
        } else if (valorProduto < 500) {
            valorFinal = (valorProduto - (valorProduto * 6/100));
            System.out.println("Nome do produto: " + nomeProduto);
            System.out.println("Valor do produto: " + valorProduto);
            System.out.println("Valor do produto com desconto: " + valorFinal);
        } else if (valorProduto < 1000) {
            valorFinal = (valorProduto - (valorProduto * 7/100));
            System.out.println("Nome do produto: " + nomeProduto);
            System.out.println("Valor do produto: " + valorProduto);
            System.out.println("Valor do produto com desconto: " + valorFinal);
        } else if (valorProduto > 1000) {
            valorFinal = (valorProduto - (valorProduto * 8/100));
            System.out.println("Nome do produto: " + nomeProduto);
            System.out.println("Valor do produto: " + valorProduto);
            System.out.println("Valor do produto com desconto: " + valorFinal);
        } else {
            System.out.println("Valor informado não é válido!");
        }
    }

}
