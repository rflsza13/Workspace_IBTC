import java.util.Scanner;
public class CalculoValores {

	public static void main(String[] args) {
		/*
		// Criando uma variável, vinculado a um Scanner
		System.out.println("Prezado(a) usuário(a), informe seu nome: ");
		
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		
		System.out.println(nome + ", Seja Bem-Vindo a nossa instituição!"); 
		
		*/
		Scanner t = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int num1 = t.nextInt();
		System.out.print("Informe o Segundo número: ");
		int num2 = t.nextInt();
		
		int rest = num1 * num2;
		System.out.println("O resultado é: " + rest);
				
	}

}
