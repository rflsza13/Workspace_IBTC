import java.util.Scanner;

public class DoisUm {

	public static void main(String[] args) {
		//Criando variáveis para o nome dos tres jogadores
		String jogador[] = new String [3];
		//Criando variáveis para o valor dos três jogadores
		int n[] = new int[3];
		//Criando variáveis para controle
		int i, j;
		//criando um objeto scanner
		Scanner t = new Scanner(System.in);
		
		//Coletando o nome dos jogadores
		for(i = 0; i < 3; i++) {
			System.out.print("Informe o nome do " + (i + 1) + "º jogador: ");
			jogador[i] = t.nextLine();
		}
		
		//Coletando o valor de cada jogador
		i = 0;
		do {
			System.out.print("Jogador " + jogador[i] + ", informe um valor (2 ou 1): ");
			j = t.nextInt();
			if(j < 1) {
				System.out.println("Valor inválido! Insira 1 ou 2");
			} else if (j > 2) {
				System.out.println("Valor inválido! Insira 1 ou 2");
			} else {
				n[i] = j;
				i++;
			}
			
		} while (i < 3);
		
		//Comparando os valores dos jogadores e mostrando quem ganhou
		if (n[0] == n[1]) {
			if(n[0] == n[2]) {
				System.out.print("Jogo empatado!!");
			} else {
				System.out.print("O vencedor é: Jogador " + jogador[2]);
			}
		} else {
			if(n[0] == n[2]) {
				System.out.print("O vencedor é: Jogador " + jogador[1]);
			} else {
				System.out.print("O vencedor é: Jogador " + jogador[0]);
			}
		}
		t.close();
	}

}
