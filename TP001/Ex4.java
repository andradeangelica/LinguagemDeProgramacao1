package TP001;

import java.util.Scanner;

/** 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. 
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex4 {
    public static void main(String[] args) {
        
        double base;
        double altura;
        double area;
        
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o valor da altura do triângulo = ");
            altura = teclado.nextDouble();
            
            System.out.println("Digite o valor da base do triângulo = ");
             base = teclado.nextDouble();
        }

        area = base*altura/2;
        
        System.out.printf("A área do triângulo é: " + area);
    }
}
