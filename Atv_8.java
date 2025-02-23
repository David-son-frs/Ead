package Listas_Matrizes_For_Each;
import java.util.ArrayList;

import java.util.Scanner;

public class Atv_8 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ArrayList<Integer> lista = new ArrayList<>();

                for (int i = 0; i < 8; i++) {
                    System.out.print("Digite o " + (i + 1) + "º número: ");
                    lista.add(sc.nextInt());
                }

                System.out.println("Números em ordem crescente:");
                for (int num : lista) {
                    System.out.println(num);
                }

                sc.close();
            }
        }