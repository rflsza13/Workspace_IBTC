
public class DadosUsuario {
	public DadosUsuario(){
		
	}
	String Usuario = "";
	String Senha = "";
	
	public int validaSenha() {
		Usuario = FrmPersonas.textUsuario.getText();
		Senha = FrmPersonas.textSenha.getText();
		
		if(Usuario.equals("Rafael") && Senha.equals("123456")) {
			return 1;
		} else {
			return 0;
		}
	}

}
