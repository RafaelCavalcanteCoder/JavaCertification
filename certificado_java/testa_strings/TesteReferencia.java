package certificado_java.testa_strings;

class ObjetoMeu {
	
	int valor;
}

public class TesteReferencia {

	public static void main (String[] args) {
		
		ObjetoMeu objeto1 = new ObjetoMeu();
		objeto1.valor =10; //objeto atribuiu valor no atributo que foi 10.
		ObjetoMeu objeto2 = objeto1; //cria uma nova referencia para o mesmo objeto
		//objeto1 e objeto 2 apontam para o mesmo OBJETO>> e se trocar de um altera o de outro.
		
		objeto1.valor= objeto1.valor +5;
		System.out.println("objeto1 o valor é "+ objeto1.valor);
		System.out.println("objeto2 o valor é "+ objeto2.valor);
		
		
		
		
		int a =10; //tipo primitivo;
		int b = a; //b vale 10, mas são 2 valores 10, a =10 e b =10 agora; variavel primitiva copia quando referencia a outra.
		a = a+10;
		System.out.println(a);
		System.out.println(b); //b vale 10 , mas são 10 diferentes.
		
	
		
		
		
	}
	
	
	}
