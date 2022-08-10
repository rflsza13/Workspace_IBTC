import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2;
		ProcessaCalculos p = new ProcessaCalculos();
		Scanner t = new Scanner(System.in);
		System.out.println("Suuper Cálculo");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.print("Informe a opção desejada: ");
		int i = t.nextInt();
		System.out.print("Informe o primeiro número: ");
		n1 = t.nextDouble();
		System.out.print("Informe o segundo número: ");
		n2 = t.nextDouble();
		t.close();
		switch(i) {
		case 1:
			p.Adicao(n1, n2);
			break;
		case 2:
			p.Subtracao(n1, n2);
			break;
		case 3:
			p.Divisao(n1, n2);
			break;
		case 4:
			p.Multiplicacao(n1, n2);
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}

}
