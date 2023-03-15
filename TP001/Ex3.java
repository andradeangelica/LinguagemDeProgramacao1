package TP001;

import java.util.Scanner;

/** 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex3 {
    public static void main(String[] args) {
        
        double diagonal;
        double area;
        
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o valor da diagonal do quadrado = ");
            diagonal = teclado.nextDouble();
            
        }

        area = diagonal*diagonal/2;
        
        System.out.printf("A área do quadrado é: " + area);
    }
}
