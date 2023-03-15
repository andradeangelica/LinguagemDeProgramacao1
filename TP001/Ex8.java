package TP001;

import java.util.Scanner;

/** 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros. 

 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex8 {

    public static void main(String[] args) {
        
        double milha;
        double quilometro;
        double milham=1852;
        
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o valor da milha marítima = ");
            milha = teclado.nextDouble();
            
        }

        quilometro = milha*milham;

        System.out.println("Em quilômetros, " + milha + " milhas marítimas equivalem à " + quilometro + " Km");
    }
    
}
