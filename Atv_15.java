package Listas_Matrizes_For_Each;

import java.util.Scanner;

public class Atv_15 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] matriz = new int[3][3];
            int soma = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }
            //pRECISO APRENDER MELHOR SOBRE 
            for (int i = 0; i < 3; i++) {
                soma += matriz[i][2 - i];
            }

            System.out.println("A soma dos elementos da diagonal secundária é: " + soma);

            sc.close();
        }
    }

