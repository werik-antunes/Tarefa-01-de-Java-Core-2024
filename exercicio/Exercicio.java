package exercicio;
import java.util.Scanner;

public class Exercicio {
public static void main(String[] args) {
	
	//1) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número sucessor.
	
	System.out.println("Digite um número para saber o seu sucessor :");
	
	Scanner sc = new Scanner(System.in);
	
	int numero = sc.nextInt();
	int resultado = numero + 1;
	
	System.out.println("O número sucessor do " + numero + " é " + resultado);
	sc.close();
}
}
