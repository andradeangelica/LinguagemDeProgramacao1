/* Discente: ANGÉLICA ALVES ANDRADE
 * Discente: João Dias
*Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
*sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
*calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
*colunas).*/

import java.util.Scanner;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a ordem da matriz: ");
        int ordem = sc.nextInt();
        
        // Verifica se a ordem é maior que zero e menor ou igual a 10
        if (ordem <= 0 || ordem > 10) {
            System.out.println("A ordem da matriz deve ser entre 1 e 10.");
            return;
        }
        
        double[][] matriz = new double[ordem][ordem];
        
        // Preenche a matriz com os valores digitados pelo usuário
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Digite o elemento [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }
        
        // Calcula a matriz inversa
        RealMatrix matrizReal = new Array2DRowRealMatrix(matriz);
        RealMatrix inversaReal = matrizReal.inverse();
        double[][] inversa = inversaReal.getData();
        
        // Exibe a matriz e a matriz inversa na tela
        System.out.println("\nMatriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz inversa:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(inversa[i][j] + "\t");
            }
            System.out.println();
        }
        
        sc.close();
    }

}

