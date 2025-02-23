package AtivEAD;

import java.util.Scanner;

public class Ativ23 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[] numeros = {10, 20, 30, 40, 50};
                System.out.print("Digite o valor para multiplicar os elementos: ");
                int valor = sc.nextInt();
                System.out.println("Lista original multiplicada pelo valor fornecido:");
                for (int numero : numeros) {
                    System.out.println(numero * valor);
                }
                sc.close();
            }
        }