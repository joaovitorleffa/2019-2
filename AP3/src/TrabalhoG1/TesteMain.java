package TrabalhoG1;

import java.util.Scanner;

public class TesteMain {
    public static void main(String[] args) {
        String email, telefone, data;
        Scanner tc = new Scanner(System.in);

        Teclado.lerIntCom("Digite o numero");

        email = Teclado.lerStringCom("Digite um email");
        email = Teclado.validaEmailCom(email);
        System.out.println(email);

        telefone = Teclado.lerStringCom("Digite o número de telefone");
        telefone = Teclado.formataTelefoneCom(telefone);
        System.out.println(telefone);

        data = Teclado.lerStringCom("Digite a Data");
        data = Teclado.formataDataCom(data);
        System.out.println(data);

    }
}
