package certificado_java.operadores;

public class TestaOperadorDeReferencia {
	public static void main(String[] args) {
		String nome = "Guilherme";
		int tamanho = nome.length(); //lenght conta as letras. ele o PONTO . é o operador de referencia, pra fazer referencia a algo.
		System.out.println(nome);
		String nome1= "rafael" + " " + tamanho + "Cavalcante" + " "; //concatenação; 
		System.out.println(nome1);
	}

}
