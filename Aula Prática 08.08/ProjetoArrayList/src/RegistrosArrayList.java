import java.util.ArrayList;

public class RegistrosArrayList {
	public static void main(String[] args) {
		ArrayList<String> pessoas = new ArrayList<String>();
		pessoas.add("Petrolina");
		pessoas.add("Tarciano");
		pessoas.add("Romulo");
		pessoas.add("Adroaldo");
		
		System.out.println(pessoas);
		
		// Localizando um registro dentro de um ArrayList
		
		System.out.println(pessoas.get(2));
		
		//Modificando um registro dentro de um ArrayList
		pessoas.set(3, "Rafael");
		System.out.println(pessoas);	
		
		//Removendo um registro dentro de um ArrayList
		pessoas.remove(0);
		System.out.println(pessoas);
		System.out.println(pessoas.get(0));
		
		//Contando a quantidade de registros de um ArrayList
		System.out.println(pessoas.size());
		
		
	}

}
