package Listas_Matrizes_For_Each;
import java.util.ArrayList;
import java.util.Scanner;

    public class Atv_11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> lista1 = new ArrayList<>();
            ArrayList<Integer> lista2 = new ArrayList<>();
            ArrayList<Integer> lista3 = new ArrayList<>();
            System.out.println("Digite 5 números para a primeira lista:");
            ArrayList<Integer> lista = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                lista1.add(sc.nextInt());
            }

            System.out.println("Digite 5 números para a segunda lista:");
            for (int i = 0; i < 5; i++) {
                lista2.add(sc.nextInt());
            }
        }
    }


