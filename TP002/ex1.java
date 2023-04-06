/**
 * Discente: ANGÉLICA ALVES ANDRADE
 * Discente: João Dias
 * Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.
 */

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroValor, segundoValor;

        System.out.print("Digite o primeiro valor: ");
        primeiroValor = scanner.nextInt();

        do {
            System.out.print("Digite o segundo valor (deve ser 6 que o primeiro): ");
            segundoValor = scanner.nextInt();
        } while (segundoValor <= primeiroValor);

        System.out.println("Valores digitados: " + primeiroValor + " e " + segundoValor);
    }
}
