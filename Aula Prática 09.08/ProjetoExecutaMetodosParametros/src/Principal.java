import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Criando as variáveis do nosso sistema
		String Nome, Email;
		int Idade;
		
		// Criando o objeto Scanner
		Scanner t = new Scanner(System.in);
		// Obtendo o nome do usuário
		System.out.print("Digite o nome do usuário: ");
		Nome = t.nextLine();
		// Obtendo o email do usuário
		System.out.print("Informe seu email: ");
		Email = t.next();
		// Obtendo a idade do usuário
		System.out.print("Informe sua idade: ");
		Idade = t.nextInt();
		t.close();
		
		//Chamando a nossa classe e enviando os parametros ao método
		ProcessaMensagem executar = new ProcessaMensagem();
		executar.Mensagem(Nome, Email, Idade);
	}

}
