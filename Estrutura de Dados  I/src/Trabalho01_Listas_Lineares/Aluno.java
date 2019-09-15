package Trabalho01_Listas_Lineares;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aluno {
    private String codigo;
    private String nome;
    private String telefone;
    private String email;
    private double notaG1;
    private double notaG2;
    private double media;

    public void lerAluno() {
        Scanner tc = new Scanner(System.in);
        System.out.print("\nDigite o código: ");
        this.codigo = tc.next();
        System.out.print("Digite o nome: ");
        this.nome = tc.next();
        System.out.print("Digite o telefone: ");
        this.telefone = tc.next();
        System.out.print("Digite o email: ");
        this.email = tc.next();
        System.out.print("Digite a nota G1: ");
        this.notaG1 = tc.nextDouble();
        System.out.print("Digite a nota G2: ");
        this.notaG2 = tc.nextDouble();
        media = (this.notaG1 + (this.notaG2 * 2)) / 3;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public double getNotaG1() {
        return notaG1;
    }

    public double getNotaG2() {
        return notaG2;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nNome: " + nome +
                "\nTelefone: " + telefone +
                "\nEmail: " + email +
                "\nNota G1: " + notaG1 +
                "\nNota G2: " + notaG2;
    }

    public String retornaComMedia() {
        DecimalFormat formatador = new DecimalFormat("0.00");
        return "Nome: " + nome + "\nMédia: " + formatador.format(media) + "\n";
    }
}
