package AtivEAD;

public class Ativ28 {
    public class SomaMatrizForEach {
        public static void main(String[] args) {
            int[][] matriz = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}

            };
            int soma = matriz[0][0];
            for (int[] linha : matriz) {
                for (int elemento : linha) {
                    if (elemento > soma) {
                    }
                }
                System.out.println("O maior numero é: " + soma);
            }
        }
    }
}
