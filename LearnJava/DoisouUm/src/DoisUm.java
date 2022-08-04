import java.util.Scanner;

public class DoisUm {

	public static void main(String[] args) {
		//Criando variáveis para o nome dos tres jogadores
		String j1 = " ", j2 = " ", j3 = " ";
		//Criando variáveis para o valor dos três jogadores
		int n1 = 0, n2 = 0, n3 = 0;
		//Criando variáveis para controle
		int i, j;
		//criando um objeto scanner
		Scanner t = new Scanner(System.in);
		
		//Coletando o nome dos jogadores
		for(i = 1; i < 4; i++) {
			System.out.print("Informe o nome do " + i + "º jogador: ");
			if(i == 1) {
				j1 = t.nextLine();
			} else if (i == 2) {
				j2 = t.nextLine();
			} else {
				j3 = t.nextLine();
			}
		}
		
		//Coletando o valor de cada jogador
		i = 1;
		do {
			System.out.print("Informe o valor do " + i + "º jogador(2 ou 1): ");
			j = t.nextInt();
			if(j < 1) {
				System.out.println("Valor inválido! Insira 1 ou 2");
			} else if (j > 2) {
				System.out.println("Valor inválido! Insira 1 ou 2");
			} else {
				if(i == 1) {
					n1 = j;
					i++;
				} else if (i == 2) {
					n2 = j;
					i++;
				} else {
					n3 = j;
					i++;
				}
			}
			
		} while (i < 4);
		
		//Comparando os valores dos jogadores e mostrando quem ganhou
		if (n1 == n2) {
			if(n1 == n3) {
				System.out.print("Jogo empatado!!");
			} else {
				System.out.print("O vencedor é: " + j3);
			}
		} else {
			if(n1 == n3) {
				System.out.print("O vencedor é: " + j2);
			} else {
				System.out.print("O vencedor é: " + j1);
			}
		}
		t.close();
	}

}
