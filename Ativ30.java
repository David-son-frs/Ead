package AtivEAD;

public class Ativ30 {
    public static void main(String[] args) {
                int[] numeros = {1, -2, 3, -4, 5, -6, 7, -8};
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] < 0) {
                        numeros[i] = 0;
                    }
                }
                System.out.println("Lista após substituir negativos por zero:");
                for (int numero : numeros) {
                    System.out.print(numero + " ");
                }
            }
        }