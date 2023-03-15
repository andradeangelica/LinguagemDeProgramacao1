package TP001;

import java.util.Scanner;

/**11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. 

 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex11 {

    public static void main(String[] args) {

        double diametro;
        double raio;
        double area;
    
        try (Scanner teclado = new Scanner(System.in)) {
    
        System.out.println("Digite o diâmetro do circulo : ");
        diametro = teclado.nextDouble();

        }
    
        raio = diametro/2;
        area = 3.14*Math.pow(raio,2);
    
        System.out.println("A área do círculo é:  " + area + "²");
    
    }
    
}
