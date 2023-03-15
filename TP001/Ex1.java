package TP001 ;

import java.util.Scanner;

/** 1.Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex1 {
    public static void main(String[] args) {
        
        double base;
        double altura;
        double area;
        
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o valor da altura do retangulo= ");
            altura = teclado.nextDouble();
            
            System.out.println("Digite o valor da base do retangulo= ");
             base = teclado.nextDouble();
        }

        area = base*altura;
        
        System.out.printf("A área do retângulo é: " + area);
    }
}