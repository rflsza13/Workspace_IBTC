import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();
		
		int i = 0;
		String fruta;
		while(i < 4) {
			System.out.println("*****************************");
			System.out.println("***** Mercado de Frutas *****");
			System.out.println("** 1 - Cadastrar Frutas    **");
			System.out.println("** 2 - Listar Frutas       **");
			System.out.println("** 3 - Editar Frutas       **");
			System.out.println("** 4 - Sair do Sistema     **");
			System.out.println("*****************************");
			System.out.print("Informe a opção desejada: ");
			i = Integer.parseInt(t.nextLine());
			switch(i) {
			case 1:
				//Cadastrando frutas no ArrayList
				int j = 0;
				while (j == 0) {
					System.out.print("Informe o nome da fruta que deseja adicionar: ");
					fruta = t.nextLine();
					frutas.add(fruta);					
					System.out.print("Deseja cadastrar outra fruta? (1 - sim/ 2 - nao): ");
					int cont = Integer.parseInt(t.nextLine());
					if (cont == 2) {
						j = 1;
					}
				}
				break;
			case 2:
				//Mostrando o conteúdo do ArrayList
				System.out.println(frutas);
				break;
			case 3:
				//Alterando uma fruta cadastrada
				System.out.print("Informe o indice da fruta a ser alterada: ");
				int z = Integer.parseInt(t.nextLine());
				z = z - 1;
				System.out.print("Informe o nome da fruta a ser cadastrada: ");
				String fr = t.nextLine();
				frutas.set(z, fr);
				break;
			case 4:
				// Opção sair do programa
				System.out.println("Saindo do sistema");
				break;
			default:
				System.out.println("Opção Inválida!!");
			}
		}
		t.close();
	}
}
