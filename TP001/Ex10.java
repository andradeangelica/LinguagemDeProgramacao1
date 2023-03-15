package TP001;

import java.util.Scanner;

/**10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit. 

 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex10 {

    public static void main(String[] args) {

        double celcius;
        double fahrenheit;
    
        try (Scanner teclado = new Scanner(System.in)) {
    
        System.out.println("Digite o valor do grau em grau Celcius : ");
        celcius = teclado.nextDouble();

        }
    
        fahrenheit = (celcius*9/5) + 32;
    
        System.out.println("Valor convertido para Fahrenheit:  " + fahrenheit);
    
    }
    
}
