package TP001;

import java.util.Scanner;

/**18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex18 {
    public static void main(String[] args) {

        double valor1;
        double valor2;
        double valor3;
        double valor4;
        double valor5;
        double soma;
        double pagamento;
        double troco;
    
        try (Scanner teclado = new Scanner(System.in)) {
    
        System.out.println("Digite o valor do primeiro produto: ");
        valor1 = teclado.nextDouble();

        System.out.println("Digite o valor do segundo produto: ");
        valor2 = teclado.nextDouble();

        System.out.println("Digite o valor do terceiro produto: ");
        valor3 = teclado.nextDouble();

        System.out.println("Digite o valor do quarto produto: ");
        valor4 = teclado.nextDouble();

        System.out.println("Digite o valor do quinto produto: ");
        valor5 = teclado.nextDouble();

        System.out.println("Digite o valor do pagamento: ");
        pagamento = teclado.nextDouble();

        }
    
        soma = valor1+valor2+valor3+valor4+valor5;
        troco = pagamento-soma;
    
        System.out.println("Seu troco é " + troco + "reais" );
    
    }
}
