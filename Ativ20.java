package AtivEAD;

import java.util.Scanner;

public class Ativ20 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] matriz = new int[4][4];
            int[] somaLinhas = new int[4];
            int[] somaColunas = new int[4];
            System.out.println("Digite os elementos da matriz 4x4:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    somaLinhas[i] += matriz[i][j];
                    somaColunas[j] += matriz[i][j];
                }
            }
            System.out.println("\nSoma de cada linha:");
            for (int i = 0; i < 4; i++) {
                System.out.println("Soma da linha " + i + ": " + somaLinhas[i]);
            }

            System.out.println("\nSoma de cada coluna:");
            for (int j = 0; j < 4; j++) {
                System.out.println("Soma da coluna " + j + ": " + somaColunas[j]);
            }
            sc.close();
        }
    }

