package TP001;

import java.util.Scanner;

/** 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.   
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex7 {
    public static void main(String[] args) {
        
        double valor1;
        double valor2;
        double media;

        
        
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o primeiro valor = ");
            valor1 = teclado.nextDouble();

            System.out.println("Digite o segundo valor = ");
            valor2 = teclado.nextDouble();

        }
        media = Math.sqrt(valor1*valor2 );

 
        System.out.printf("A média geométrica é : " + media);
    }
}
