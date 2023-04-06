/**
 * Discente: ANGÉLICA ALVES ANDRADE
 * Discente: João Dias
 * Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta.
 */

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, valor;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        int somaValores = 0;
        int numPositivos = 0;
        int numNegativos = 0;

        do {
            System.out.print("Digite a quantidade de valores (positivo e menor que 20): ");
            n = scanner.nextInt();
        } while (n <= 0 || n >= 20);

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o valor " + i + ": ");
            valor = scanner.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }

            somaValores += valor;

            if (valor > 0) {
                numPositivos++;
            } else if (valor < 0) {
                numNegativos++;
            }
        }

        double mediaAritmetica = (double) somaValores / n;
        double pctPositivos = (double) numPositivos / n * 100;
        double pctNegativos = (double) numNegativos / n * 100;

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Soma dos valores: " + somaValores);
        System.out.println("Média aritmética: " + mediaAritmetica);
        System.out.println("Porcentagem de valores positivos: " + pctPositivos + "%");
        System.out.println("Porcentagem de valores negativos: " + pctNegativos + "%");

        System.out.print("Deseja executar novamente (S/N)? ");
        char resposta = scanner.next().charAt(0);

        while (resposta != 'S' && resposta != 'N') {
            System.out.print("Resposta inválida. Deseja executar novamente (S/N)? ");
            resposta = scanner.next().charAt(0);
        }

        if (resposta == 'S') {
            main(args);
        } else {
            System.out.println("Encerrando programa.");
        }
    }
}

