package exercicios;

	
	import java.util.Scanner;

	public class quadrado {

	  public static void main(String[] args) {
	  
	    Scanner sc = new Scanner(System.in);
	    
	    // L� o tamanho do lado do quadrado
	    System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
	    int lado = sc.nextInt();
	    
	    
	    // Verifica se o tamanho do lado est� dentro do intervalo permitido
	    if (lado < 1 || lado > 20) {
	      System.out.println("Tamanho inv�lido! O tamanho deve estar entre 1 e 20.");
	      return;
	    }
	    
	    // Imprime o quadrado com asteriscos e espa�os em branco
	    for (int i = 1; i <= lado; i++) {
	      for (int j = 1; j <= lado; j++) {
	        if (i == 1 || i == lado || j == 1 || j == lado) {
	          System.out.print("*");
	        } else {
	          System.out.print(" ");
	        }
	      }
	      System.out.println();
	    }
	  }
	}
	



