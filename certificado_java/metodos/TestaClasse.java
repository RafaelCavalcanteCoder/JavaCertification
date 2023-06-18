package certificado_java.metodos;

public class TestaClasse {
	
	public static void main(String[] args) {
		
	ClasseEmpresa funcionarioX = new ClasseEmpresa();
	
	funcionarioX.setBonificacao("Fernando", 3000);
	
	funcionarioX.getBonificacao();
	System.out.println(funcionarioX.getBonificacao());
		
	}

}
