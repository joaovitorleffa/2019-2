package Aula05_Exercicios;

public class Contagem {
    public void contar () {
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }

    public void contar (int fim) {
        for (int i=1; i<=fim; i++) {
            System.out.println(i);
        }
    }

    public void contar (int inicio, int fim) {
        for (int i=inicio; i<=fim; i++) {
            System.out.println(i);
        }
    }

    public void contar (int inicio, int fim, int pausa) {
        try { Thread.sleep(pausa);
            for (int i = inicio; i <= fim; i++) {
                System.out.println(i);
            }
        } catch (InterruptedException ex) { }
    }
}
