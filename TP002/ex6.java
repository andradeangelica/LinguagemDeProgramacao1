/* Discente: ANGÉLICA ALVES ANDRADE
 * Discente: João Dias
*Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela. */

public class ex6 {
  public static void main(String[] args) {
    String[][] matriz = new String[2][3];

    matriz[0][0] = "Maria";
    matriz[0][1] = "João";
    matriz[0][2] = "Priscila";
    matriz[1][0] = "Daniel";
    matriz[1][1] = "Lucas";
    matriz[1][2] = "Luiza";

    System.out.println("Nomes na matriz:");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}