package TP001;

import java.util.Scanner;

/** 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado. 
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex5 {
    public static void main(String[] args) {
        
        double diametro;
        double raio;
        double volume;
        
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o valor do diâmetro da esfera = ");
            diametro = teclado.nextDouble();
            
        }

        raio = diametro/2;
        volume = (4*3.14*Math.pow(raio,3))/3;
 
        System.out.printf("O volume da esfera é: " + volume);
    }
}
