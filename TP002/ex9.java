/**
 * Discente: ANGÉLICA ALVES ANDRADE
 * Discente: João Dias
 * Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.
 */

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas (M) da matriz (Máximo 10): ");
        int m = scanner.nextInt();

        System.out.print("Digite o número de colunas (N) da matriz (Máximo 10): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizTransposta = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}


