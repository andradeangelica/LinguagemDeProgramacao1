package TP001;

import java.util.Scanner;

/**12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex12 {
    public static void main(String[] args) {

        double altura;
        double raio;
        double volume;
    
        try (Scanner teclado = new Scanner(System.in)) {
    
        System.out.println("Digite a altura do cone : ");
        altura = teclado.nextDouble();

        System.out.println("Digite o raio da base do cone : ");
        raio = teclado.nextDouble();

        }
    
        volume = (3.14*Math.pow(raio,2)*altura)/3;
    
        System.out.println("O volume do cone é  " + volume + "³");
    
    }
}
