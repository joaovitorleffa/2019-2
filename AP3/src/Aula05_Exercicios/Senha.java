package Aula05_Exercicios;

public class Senha {
    public static int[] geraSenha() {
        int[] senha = new int[8];
        for (int i=0; i<senha.length; i++) {
            senha[i] = (int) (Math.random() * 8);
        }
        return senha;
    }
}
