import java.util.Scanner;

public class Aposentadoria {

    public static void main(String[] args) {
        int idade;
        String sexo;
        int anosDeContribuicao;

        Scanner tc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        idade = tc.nextInt();
        System.out.println("Informe seu sexo: (M/F) ");
        sexo = tc.next();
        System.out.println("Informe a quantidade de anos de contribuição: ");
        anosDeContribuicao = tc.nextInt();

        /* if (idade >= 60 && (sexo == "F" || sexo == "f")) {
            System.out.println("Você já tem direito a aposentadoria");
        } else if (idade >= 65 && (sexo == "M" || sexo == "m")) {
            System.out.println("Você já tem direito a aposentadoria");
        } */
        if (sexo == "F" && anosDeContribuicao < 30) {
            System.out.println("Ainda falta " + (30 - anosDeContribuicao) + "anos de contribuição" );
        } else if (sexo == "M" && anosDeContribuicao < 35 ) {
            System.out.println("Ainda falta " + (35 - anosDeContribuicao) + "anos de contribuição");
        } else {
            System.out.println("Você já tem direito a aposentadoria");
        }
    }

}
