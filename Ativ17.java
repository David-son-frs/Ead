package AtivEAD;

import java.util.Scanner;

public class Ativ17 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[][] matriz = new int[3][3];
                System.out.println("Digite os elementos da matriz 3x3:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = sc.nextInt();
                    }
                }
                System.out.print("Digite o número escalar para multiplicação: ");
                int escalar = sc.nextInt();

                int[][] matrizResultante = new int[3][3];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matrizResultante[i][j] = matriz[i][j] * escalar;
                    }
                }
                System.out.println("\nMatriz resultante após multiplicação pelo escalar " + escalar + ":");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(matrizResultante[i][j] + " ");
                    }
                    System.out.println();
                }
                sc.close();
            }
        }