package Listas_Matrizes_For_Each;
import java.util.ArrayList;
import java.util.Scanner;

public class Atv_9 {
    public class OrdenarNomes {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> nomes = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o " + (i + 1) + "º nome: ");
                nomes.add(sc.nextLine());
            }

            System.out.println("Nomes em ordem alfabética:");
            for (String nome : nomes) {
                System.out.println(nome);
            }

            sc.close();
        }
    }
}
