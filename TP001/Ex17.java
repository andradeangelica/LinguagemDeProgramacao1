package TP001;

import java.util.Scanner;

/**17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex17 {
    public static void main(String[] args) {

        double x;
        double y;
        double resultado;
    
        try (Scanner teclado = new Scanner(System.in)) {
    
        System.out.println("Para calcular a potencia, digite o valor da base: ");
        x = teclado.nextDouble();

        System.out.println("Agora digite o valor do expoente: ");
        y = teclado.nextDouble();

        }
    
        resultado = Math.pow(x, y);
    
        System.out.println("Resultado: " + resultado );
    
    }
}
