package certificado_java.operadores;

class Cliente{
	String nome;
	public Cliente(String nome) {
		this.nome=nome;
	}
	public boolean equals(Object o){ //sobrescrevendo o metodo equals. equals default nao é esse.
		Cliente outro = (Cliente)o;
		return this.nome.equals(outro.nome);
	}
}

public class TestaComparacaoEquals {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Mario");
		Cliente c2 = new Cliente ("Guilherme");
		Cliente c3= new Cliente ("Guilherme");
		
		System.out.println(c1.equals(c3));
		System.out.println(c2.equals(c3)); //equals verifica se o mesmo conteúdo tem em outro variavel
		
	}

}
