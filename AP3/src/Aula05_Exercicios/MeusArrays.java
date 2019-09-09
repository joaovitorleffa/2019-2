package Aula05_Exercicios;

import java.lang.reflect.Array;

public class MeusArrays {
    public static int procuraNumero(int[] array1, int[] array2, int valor) {
        int i, j = 0;
        for (i=0; i< array1.length; i++) {
            if (array1[i] == valor) {
                j++;
                break;
            }
        }

        for (i=0; i<array2.length; i++) {
            if (array2[i] == valor) {
                j++;
                break;
            }
        }
        if (j == 1) {
            return 1;
        } else if (j == 2) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int[] criarArray (int valor) {
        int[] array = new int[valor];
        for (int i=0; i<valor; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }
}
