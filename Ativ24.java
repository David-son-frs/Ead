package AtivEAD;

import java.util.Scanner;

public class Ativ24 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Lista dos numeros pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);;
            }

        }
    }
}
