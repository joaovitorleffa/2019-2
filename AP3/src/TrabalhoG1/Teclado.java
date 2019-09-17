package TrabalhoG1;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.util.Objects;
import java.util.Scanner;

public class Teclado {

    static Object validaCom(int opcao) {
        boolean repetir = true;
        String texto;
        Object objeto = null;
        Scanner tc = new Scanner(System.in);
        while(repetir) {
            try {
                texto = tc.next();
                switch (opcao) {
                    case 1 : {
                        objeto = Integer.parseInt(texto);
                        break;
                    }
                    case 2 : {
                        objeto = Float.parseFloat(texto);
                        break;
                    }
                    case 3 : {
                        objeto = Double.parseDouble(texto);
                        break;
                    }
                    case 4 : {
                        objeto = texto;
                        break;
                    }

                    case 5 : {
                        objeto = texto.charAt(0);
                        break;
                    }
                }
                repetir = false; //quebra o loop
            } catch(Exception erro) {
                System.out.print("Valor invalido! Digite novamente: ");
            }
        }
        return objeto;
    }

    static int lerInt() {
        System.out.print("Digite um inteiro: ");
        int numero = (int)validaCom(1);
        return numero;
    }

    static int lerIntCom(String mensagem) {
        System.out.print(mensagem + ": ");
        int numero = (int)validaCom(1);
        return numero;
    }

    static float lerFloat() {
        System.out.print("Digite um float: ");
        float Float = (float)validaCom(2);
        return Float;
    }

    static float lerFloatCom(String mensagem) {
        System.out.println(mensagem + ": ");
        float Float = (float)validaCom(2);
        return Float;
    }

    static double lerDouble() {
        System.out.print("Digite um double: ");
        double Double = (double)validaCom(3);
        return Double;
    }

    static double lerDoubleCom(String mensagem) {
        System.out.print(mensagem + ": ");
        double Double = (double)validaCom(3);
        return Double;
    }

    static String lerString() {
        System.out.print("Digite uma string: ");
        String palavra = validaCom(4).toString();
        return palavra;
    }

    static String lerStringCom(String mensagem) {
        System.out.println(mensagem + ": ");
        String palavra = validaCom(4).toString();
        return palavra;
    }

    static String validaEmailCom(String email) {
        try {
            if (email.contains("@")) {
                return email;
            }
        } catch (Exception ex) {
            System.out.println("O Email não é valido!");
            return null;
        }
        return null;
    }

    static String formataTelefoneCom(String telefone) {
        try {
            MaskFormatter telefoneFormat = new MaskFormatter("(##) # ####-####"); //define o formato de exibição através da classe MaskFormatter
            JFormattedTextField txtPhone =  new JFormattedTextField(telefoneFormat); //txtPhone responsável por realizar a formatação
            txtPhone.setText(telefone); // setText aplica a formatação
            if (telefone.length() == 11) {
                return txtPhone.getText(); // getText retorna o telefone formatado
            }
        } catch (Exception ex) {
            return null;
        }
        return null;
    }

    static String formataDataCom(String data) {
        data = data.trim(); //retira os espaços
        try {
            MaskFormatter dataFormat = new MaskFormatter("##/##/####");
            JFormattedTextField txtData = new JFormattedTextField(dataFormat);
            txtData.setText(data);
            if (data.length() == 8) {
                return txtData.getText();
            }
        } catch (Exception ex) {
            return null;
        }
        return null;
    }



}
