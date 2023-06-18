package certificado_java.acessar_variaveis;

public class Carro {
 public static void main(String[] args) {
	
}
	

	
	String modelo;
	int ano;
	
	Carro(){ //pra acessar a variable membro, pode acessar diretamente variables membros, escrevendo o nome delas direto.
		//ou colocar this. caso tenha 2 variable com nome ano.
		ano=2014;
		
	}
	

	void reseta() {
		this.ano=2014; //aqui é this.ano referencia ao ano do metodo que foi invocado.
	}
	
	public String getDadosDeImpressos() {
		return modelo + ": : " + ano;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
		
	
	}
	public boolean metodo() {
		int x = 1;
		int y = 1;
		int d = x/y;
		System.out.println("valor da divisao é " +d);
		return true; 
		
	}
}
