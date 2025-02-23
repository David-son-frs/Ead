package Listas_Matrizes_For_Each;

public class Atv_6 {
    public static void main(String[] args) {
                int[] vetor = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
                int[] resultado = new int[vetor.length];
                int index = 0;

                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] % 2 == 0) {
                        resultado[index++] = vetor[i];
                    }
                }

                for (int i = 0; i < index; i++) {
                    System.out.println(resultado[i]);
                }
            }
        }

