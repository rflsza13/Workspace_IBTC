import java.util.Scanner;

public class ApresentarResultadoCalculado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner t = new Scanner(System.in);
	String status = " ";
	
	System.out.print("Informe o nome do aluno: ");
	String nome = t.nextLine();
	
	System.out.print("Informe a 1ª nota do aluno: ");
	int nota1 = t.nextInt();
	
	System.out.print("Informe a 2ª nota do aluno: ");
	int nota2 = t.nextInt();
	
	float media = (nota1 + nota2) / 2;
	
	if(media <= 5) {
		status = "Reprovado!!";
	} else {
		status = "Aprovado!!";
	}
	
	System.out.println("O aluno " + nome + " obteve a média " + media + " e foi " + status);
	}

}
