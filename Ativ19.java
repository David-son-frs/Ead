package AtivEAD;

import java.util.Scanner;

public class Ativ19 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[][] matriz = new int[3][3];
                int[][] matrizTransposta = new int[3][3];
                System.out.println("Digite os elementos da matriz 3x3:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matrizTransposta[j][i] = matriz[i][j];
                    }
                }
                System.out.println("\nMatriz transposta:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(matrizTransposta[i][j] + " ");
                    }
                    System.out.println();
                }
                sc.close();
            }
        }