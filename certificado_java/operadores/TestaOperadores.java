package certificado_java.operadores;
import java.util.ArrayList;
import java.util.List;

public class TestaOperadores {
	
	public static void main(String[] args) {
		//operador de atribuição com referencia esta copiando a referencia; as 2 referencias esta apontando para o mesmo objeto em mem
		ArrayList<String> lista = new ArrayList<String>(); //são as mesmas referencias apontando para um objeto em memoria;
		List<String> lista2 = lista; //são as mesmas referencias apontando para um objeto em memoria; //não atribui;
		 
			
		//operador de atribuição de valor ( int a = 125 ; int b = 182) b=a; está copiando a o valor; copia da direita para esquerda.
		
		int a = 100;
		long b = 2000;
		short c = 11;
		byte d = 5;
		char e = 2; //char não pode colocar dentro de outra operadores. só pra int e long;
		a=e;
		a=d;
		//d=a; //não pode colocar operadores mais abrangentes em operadores menos abrangentes;
		//tipo menos abrangente para o mais abrangente pode ;! ao contrario nao compila.
		//byte char e short, verifica se o numero é valido.
		double f =30.2;
		float g = 21.4f;
		
		 byte b1 = 10;  //compilna numero baixo;
		// byte b2 = 200; //não compila numero estoura o byte;
		 
		char c1 = 10; //compila numero inteiro positivo;
	//	char c2 = -20; //não compila, char não pode ser negativo;
		
		 
		
	}

}
