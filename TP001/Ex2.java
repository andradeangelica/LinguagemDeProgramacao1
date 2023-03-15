package TP001;

import java.util.Scanner;

/** 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado. 
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex2 {
    public static void main(String[] args) {
        
        double aresta;
        double area;
        
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o valor da aresta do quadrado = ");
            aresta = teclado.nextDouble();
            
        }

        area = aresta*aresta;
        
        System.out.printf("A área do quadrado é: " + area);
    }
}
