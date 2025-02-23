package Listas_Matrizes_For_Each;

import java.util.Scanner;

public class Atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int maiornumero = 0, menornumero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

        }

        for (int i = 0; i < 5; i++) {
            if (numeros[i] > maiornumero) {
                maiornumero = numeros[i];
            }
            if (numeros[i] < menornumero) {
                menornumero = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maiornumero);
        System.out.println("O menor número é: " + menornumero);

        sc.close();
    }
}
