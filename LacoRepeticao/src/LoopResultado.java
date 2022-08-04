import java.util.Scanner;

public class LoopResultado {

	public static void main(String[] args) {
		// Criando uma Tabuada de acordo com um número solicidado ao usuário
		
		Scanner t = new Scanner(System.in);
		System.out.print("Informe o valor que deseja calcular a tabuada: ");
		int num = t.nextInt();
		System.out.println("Tabuada do " + num + ":");
		for(int i = 1; i<= 10; i++) {
			System.out.println( num + " x " + i + " = " + num * i);
		}

	}
}
