package AtivEAD;

import java.util.Random;

public class Ativ18 {
    public static void main(String[] args) {
                Random rand = new Random();
                int[][] matriz = new int[4][4];
                int soma = 0;
                int totalElementos = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        matriz[i][j] = rand.nextInt(100);
                        soma += matriz[i][j];
                        totalElementos++;
                    }
                }
                double media = (double) soma / totalElementos;
                System.out.println("Matriz 4x4:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Média de todos os elementos: " + media);
            }
        }