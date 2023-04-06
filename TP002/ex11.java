/**
 * Discente: ANGÉLICA ALVES ANDRADE
 * Discente: João Dias
 * Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.
 */

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz quadrática (Máximo 10): ");
        int ordem = scanner.nextInt();

        int[][] matriz = new int[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int determinante = calcularDeterminante(matriz);

        System.out.println("Determinante da matriz: " + determinante);
    }

    public static int calcularDeterminante(int[][] matriz) {
        int ordem = matriz.length;

        if (ordem == 1) {
            return matriz[0][0];
        } else if (ordem == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        } else {
            int determinante = 0;

            for (int i = 0; i < ordem; i++) {
                int[][] submatriz = new int[ordem - 1][ordem - 1];

                for (int j = 1; j < ordem; j++) {
                    for (int k = 0; k < ordem; k++) {
                        if (k < i) {
                            submatriz[j - 1][k] = matriz[j][k];
                        } else if (k > i) {
                            submatriz[j - 1][k - 1] = matriz[j][k];
                        }
                    }
                }

                determinante += matriz[0][i] * Math.pow(-1, i) * calcularDeterminante(submatriz);
            }

            return determinante;
        }
    }
}

