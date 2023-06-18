package certificado_java.if_else_elseif;

public class TestaComparaIfs {
	public int metodo(int x) {
		if(x>200) {
			return 10;
		} else
			throw new RuntimeException();
		
	}
	
	public static void main(String[] args) {
		boolean autentico =true;
		
		
		if(autentico) { // a expressao que vai aqui dentro sempre tem que ser uma expressao que resultante em um boolean uma expressao True or False.
			System.out.println("Ok");
		}else {
			System.out.println("Não Autorizado");
		}
		
		
		int a = 1, b = 2;
		
		if(a==b) { //esta verificando, se valor atribuiu no a é igual do b. coisa que não é pois 1 nao é == a 2. 
			System.out.println("True");
		} else {
			System.out.println("False");

		}
		boolean valor = true;
		
		if(valor=false) { //aqui eu atribuiu o false na variavel valor, dai ela so imprime no else.
			System.out.println("true");
		}
		
		boolean v =true;
		
		if(v)
			System.out.println("v  ok ");
		else if(valor) {
			System.out.println("false");
		}else if(!valor) {
			System.out.println("negado");
		}else {
			System.out.println("caso nao deu nenhum de cima deu esse");
		}
		if(autentico)
			System.out.println("autentico"); //imprime so esta linha 
		else 
			System.out.println("falhou"); //quando nao tem chaves ele imprimi somente esta linha 
		System.out.println("nao outro atribuido a nada;"); // imprime pq esta fora do codigo
		
		int numero = 100;
		
		if (numero>200) {
			System.out.println("100 é maior que 200");
		}else if(numero >=101){
			System.out.println("else if");
		}
		else {
			System.out.println("100 não é maior que 200");
		}
		
		int value = 100;
		
		if(value>100)
			System.out.println("compilou maior que 100");
		else if(value == 101)
			System.out.println("compilou igual a 100 else if");
		else if (value >929)
			System.out.println("compilou value é maior que 99");
		else if (value <10)
			System.out.println("compilou value é menos que 200");
		else if (value <=90)
			System.out.println("compilou menor ou igual a 100"); //o codigo vai lendo cada linha , qual ele se encaixar ele para e nao executa o resto.
		else
			System.out.println("nada disso");
		
	
		int x = 100;
		if(x>200)
			if(x<400)
				if(x>300)
					System.out.println("a");
				else
					System.out.println("b");
			else System.out.println("c");
		
		
		
	}
	
	
	
	
	

}
