package TP001;

import java.util.Scanner;

/**15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex15 {

    public static void main(String[] args) {

        double cotacao;
        double dolar;
        double real;
    
        try (Scanner teclado = new Scanner(System.in)) {
    
        System.out.println("Digite o valor da cotação do dólar: ");
        cotacao = teclado.nextDouble();

        System.out.println("Digite a quantidade em dólar : ");
        dolar = teclado.nextDouble();

        }
    
        real = cotacao*dolar;
    
        System.out.println("O valor do dólar convertido em real é: " + real );
    
    }
    
}
