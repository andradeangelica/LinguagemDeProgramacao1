package TP001;

import java.util.Scanner;

/**9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm

 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex9 {

    public static void main(String[] args) {
    double resistencia;
    double corrente;
    double circuito;

    try (Scanner teclado = new Scanner(System.in)) {

    System.out.println("Digite o valor da resistência : ");
    resistencia = teclado.nextDouble();

    System.out.println("Digite o valor da corrente : ");
    corrente = teclado.nextDouble();
    }

    circuito = resistencia*corrente;

    System.out.println("Valor de circuito elétrico: " + circuito + " V");

}

}

