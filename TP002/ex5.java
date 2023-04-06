/**
 * Discente: ANGÉLICA ALVES ANDRADE
 * Discente: João Dias
 * Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
 */

public class ex5 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2];

        matriz[0][0] = 01;
        matriz[0][1] = 02;
        matriz[1][0] = 03;
        matriz[1][1] = 04;
        matriz[2][0] = 05;
        matriz[2][1] = 06;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

