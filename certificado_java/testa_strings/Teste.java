package certificado_java.testa_strings;


//os valores padrao sao aplicaveis, variavel membro, instancia, objeto, atributos. 
class Motor{
	
}

class Carro{
	int ano;//zero
	char primeiraLetra;//zero
	boolean usado; //false;
	Motor motor;//valor de referencia é null;
	String marca;//null;
	
}
public class Teste {

	public static void main(String[] args) {

	//	boolean argumentos;

		
		int x = 0xF__F; //numeros inteiros; // se colocar 0 vai pra base octal; hexa decimal XA, base BINARIA= 0b0 ou 1;
		double  y= 10.2d; //numeros com casas decimais; posso colocar um d para identificar que é variavel numerica double;
		long l =13L;//para indentificar valor literal posso colocar L;
		float f = 12.1f;  //para indentificar valor literal posso colocar f;
		long numeroLongo = 1_562_764_453_123_992l; //numero gigante pode colocar por ___ para representar valores em qualquer pais.
		char c = 'A'; 
		int idade = 1;//kamyCase;
		int
		IDADE 
		=2; //diferente pq ele le maisculo e minusculo.
		int Idade = 3;
		System.out.println("aqui "+IDADE);
		
		int idadE; //variavel tem que ser atribuida um valor. 
		idade=15;
		System.out.println(idade);
		
		Carro carro = new Carro(); //valor default de uma variavel numerica são 0 ;
		
		System.out.println(carro.ano); //quando crio uma referencia de um objeto Carro (modelo) os valores de variaveis membro sao 0;
		
		System.out.println(carro.primeiraLetra); //char é valor 0, não é impresso.
		System.out.println(carro.usado);
		System.out.println("valor de uma referencia "+carro.motor); //valor é null
		System.out.println("valor da String referenciada é "+carro.marca);//valor é null
		
		
	}

}

/* short e char é o mesmo tamanho mas char é só positivo,
 * int é maior, long é maior ainda,
 * double  e float:  pontos flutuantes; valores especiails infitios menos infirnito e numeros invalidos. NaN;
 * boolean não é númerico. false or true.
 * palavras reservadas são de letras minusculas; 
 * posso usar colocar ção$$_ numero no começo nao pode ser palavra. na variable*/
