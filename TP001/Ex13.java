package TP001;

import java.util.Scanner;

/**13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
(em s) que serão digitados. 
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex13 {
    public static void main(String[] args) {

        double inicial;
        double aceleracao;
        double tempo;
        double finalv;
    
        try (Scanner teclado = new Scanner(System.in)) {
    
        System.out.println("Digite a velocidade inicial em m/s: ");
        inicial = teclado.nextDouble();

        System.out.println("Digite o valor da aceleração em m/s² : ");
        aceleracao = teclado.nextDouble();

        System.out.println("Digite o tempo de percurso em s : ");
        tempo = teclado.nextDouble();

        }
    
        finalv = inicial + (aceleracao*tempo);
    
        System.out.println("A velocidade final é de " + finalv );
    
    }
}
