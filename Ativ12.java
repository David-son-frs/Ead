package AtivEAD;

import java.util.Scanner;

public class Ativ12 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[][] matriz = new int[3][3];
                int soma = 0;

                System.out.println("Digite os elementos da matriz 3x3:");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                    }
                }

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        soma += matriz[i][j];
                    }
                }

                System.out.println("A soma de todos os elementos da matriz é: " + soma);
                scanner.close();
            }
        }