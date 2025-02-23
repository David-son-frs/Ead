package Listas_Matrizes_For_Each;

import java.util.Scanner;

public class Atv_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        double media = 0;
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os seis numeros para descobrir a media"+i);
            numeros[i] = sc.nextInt();
            soma = soma + numeros[i];
            System.out.println("A media dos numeros é " + media);
            media = (double) soma / numeros.length;
        }
        sc.close();
    }
}
