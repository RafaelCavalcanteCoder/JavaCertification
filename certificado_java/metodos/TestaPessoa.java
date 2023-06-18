package certificado_java.metodos;

public class TestaPessoa {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.nome="Gulherme"; // p referencia a objeto Pessoa e  acessando diretamente uma variable membro. e dando um valor a ela. 
		System.out.println(p.nome);//imprimento o nome guilherme;
		p.setNome("Rafael", 15);//acessando atraves de um metodo. //passando argumentos;
		
		String qualNome = p.getNome(); //chamar um metodo que devolve algo, atribui o resultado do metodo a uma varible tipo String.
		System.out.println(qualNome);
		System.out.println(p.getNome());
		System.out.println(p.getIdade()); 
		p.metodo();
		
	}
	

}
