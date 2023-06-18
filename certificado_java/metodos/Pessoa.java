package certificado_java.metodos;

public class Pessoa {
	
	String nome;
	int idade;
	public String getNome() { //quando devolve algo, não precisa usar o que devolveu;
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome, int idade) { //metodo que recebe argumento tem que passar todos os argumentos que pedem;
		this.nome=nome; 
		this.idade = idade;
	}
	public void metodo() {
	System.out.println(this.getNome());//estou chamando o metodo getNome que esta dentro do Objeto Pessoa. eu posso. this para reforça
	}

}
