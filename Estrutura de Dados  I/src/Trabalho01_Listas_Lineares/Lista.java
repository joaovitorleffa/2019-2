package Trabalho01_Listas_Lineares;

public class Lista {
    private int tamanho = 100;
    private int quantidade;
    private Aluno[] alunos = new Aluno[tamanho];

    //1 - criar lista
    public Lista criarLista() {
        Lista lista = new Lista();
        System.out.println("==== Lista criada com sucesso =====");
        this.quantidade = 0;
        return lista;
    }

    //2 - adicionar no fim
    public void adicionaNoFim(Aluno novoAluno) {
        if (alunos[quantidade] == null) {
            this.alunos[quantidade] = novoAluno;
            this.quantidade++;
        }
    }

    //3 - adicionar no inicio
    public void adicionaNoInicio(Aluno novoAluno) {
        System.out.println("\n***** Incluindo no Início *****");
        if (this.quantidade == 0) {
            alunos[0] = novoAluno;
        } else {
            for (int i = this.quantidade; i >= 0; i--) {
                alunos[i + 1] =  alunos[i];
            }
            alunos[0] = novoAluno;
            this.quantidade ++;
        }
    }

    //4 - incluir após um nome
    public void adicionaAposNome(Aluno novoAluno, String nome) {
        int i, aux = 1;
        for (i = this.quantidade -1 ; i >= 0; i--) {
            if (alunos[i].getNome().trim().equals(nome)) {
                aux = i+1;
                break;
            }
        }
        for (i = this.quantidade; i >= aux; i--) {
            alunos[i + 1] = alunos[i];
        }
        alunos[aux] = novoAluno;
        this.quantidade++;
    }

    //5 - consultar por nome
    public void consultarPorNome(String nome) {
        for (int i = 0; i < this.quantidade; i++) {
            if (alunos[i].getNome().trim().equals(nome)){
                System.out.println(alunos[i]);
                break;
            }
        }
    }

    //6 - excluir do inicio
    public void exluirDoInicio() {
        System.out.println("\n***** Excluindo do início *****");
        for (int i = 0; i < this.quantidade; i++) {
            alunos[i] = alunos[i + 1];
        }
        this.quantidade--;
    }

    //7 - excluir do fim
    public void excluirDoFim() {
        System.out.println("\n***** Excluindo do fim *****");
        alunos[this.quantidade -1] = null;
        this.quantidade--;
    }

    //8 - excluir por código
    public void excluirPorCodigo(String codigo){
        System.out.println("\n***** Excluindo por codigo *****");
        int aux = 100;
        for (int i = 0; i < this.quantidade; i++) {
            if (alunos[i].getCodigo().trim().equals(codigo)) {
                aux = i;
            }
        }
        if (aux != 100) {
            for (int i = aux; i < this.quantidade; i++) {
                alunos[i] = alunos[i + 1];
            }
            this.quantidade--;
        } else {
            System.out.println("\nCódigo não Encontrado!");
        }
    }

    //9 - Listar registros
    public void listarRegistros () {
        int i;
        System.out.println("=========================");
        for (i = 0; i < this.quantidade; i++) {
            System.out.println(alunos[i] + "\n");
        }
        System.out.println("=========================\n");
    }

    //10 - Listar com médias fianis
    public void listarComMedias() {
        System.out.println("\n***** Alunos e suas médias finais *****");
        if (alunos[0] == null) System.out.println("Lista Vazia!");
        for (int i = 0; i < this.quantidade; i++) {
            System.out.println(alunos[i].retornaComMedia());
        }
    }
}