package Trabalho01_Listas_Lineares;

public class Lista {
    private int tamanho = 100;
    private int quantidade = 0;
    private Aluno[] alunos = new Aluno[tamanho];

    public void adicionaNoFim(Aluno novoAluno) {
        if (alunos[quantidade] == null) {
            this.alunos[quantidade] = novoAluno;
            quantidade++;
        }
    }
}
