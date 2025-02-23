package Listas_Matrizes_For_Each;

import java.util.Scanner;

public class Atv_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {10, 25, 30, 50, 75, 100};
        System.out.println("Digite o numero inserido :");
        int numero = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;


                if(encontrado) {
                    System.out.println("O número " + numero + " está presente no vetor!");
                } else {
                    System.out.println("O número " + numero + " não está presente no vetor.");
                }
            }
        }
    }
}
