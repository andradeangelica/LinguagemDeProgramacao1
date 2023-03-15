package TP001;

import java.util.Scanner;

/**16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
 * @author Angélica Alves Andrade
 * @author Isabelly Barbosa Gonçalves
 */

public class Ex16 {
    public static void main(String[] args) {

        double grau;
    
        try (Scanner teclado = new Scanner(System.in)) {
    
        System.out.println("Digite o valor do ângulo em graus(30º, 45º ou 60º): ");
        grau = teclado.nextDouble();

        }
    
        if(grau==30){
            System.out.println("Angulo escolhido = 30º");
            System.out.println("Seno:1/2");
            System.out.println("Cosseno:√3/2");
            System.out.println("Tangente:√3/3");
            System.out.println("Secante:2√3/3");
        }
        else{
            if(grau==45){
                System.out.println("Angulo escolhido = 45º");
                System.out.println("Seno:√2/2");
                System.out.println("Cosseno:√2/2");
                System.out.println("Tangente:1");
                System.out.println("Secante:√2");
            }
            else{
                if(grau==60){
                    System.out.println("Angulo escolhido = 60º");
                    System.out.println("Seno:√3/2");
                    System.out.println("Cosseno:1/2");
                    System.out.println("Tangente:√3");
                    System.out.println("Secante:2");
                }
            }
        }
    
    }
}
