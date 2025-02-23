package Listas_Matrizes_For_Each;

import java.util.Scanner;

public class Atv_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i= 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

            System.out.println("A soma de todos os números é: " + soma);
        }
        sc.close();
    }
}
