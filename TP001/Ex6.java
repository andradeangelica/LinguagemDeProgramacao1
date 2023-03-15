package TP001;

import java.util.Scanner;

/** 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.  
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex6 {

    public static void main(String[] args) {
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite a primeira nota = ");
            nota1 = teclado.nextDouble();

            System.out.println("Digite a segunda nota = ");
            nota2 = teclado.nextDouble();

            System.out.println("Digite a terceira nota = ");
            nota3 = teclado.nextDouble();

            System.out.println("Digite a quarta nota = ");
            nota4 = teclado.nextDouble();
            
        }

        media = (nota1+nota2+nota3+nota4)/4;
 
        System.out.printf("A média aritmética é : " + media);
    }
    
}
