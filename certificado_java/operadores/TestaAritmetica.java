package certificado_java.operadores;


public class TestaAritmetica {
	public static void main(String[] args) {
		String URL="aqui é a soma de um int + um double como double é maior prevalece ele, e eu somei"
				+ "com um numero double ponto flutuante que é 0.0 o resultado da soma voltou um double e eu divide por 0"
				+ "e a o resultado deu numero infinity, caso eu divido int por 0 da erro de compilação não existe";
		int dois = 2;
		byte dez = 10; //byte aceita pq ele é menor e equivale na conta o maior dos tipos, exemplo se tiver uma conta com //
		//byte (-) long , o resultado é um long. pq permanece o maior de todos os tips, e o minimo é um int, não volta abaixo dele//
		//
		
		int doze = dois + dez; // tabela da conversão sempre vai estar com o maior dos tipos e no minimo vai ser um int.
		int oito = dez-dois;
		int vinte = dez *dois; // o resultado da conta é do tipo mais abrangente , nesse caso o tipo int.
		int cinto = dez / dois; // se o resultado por mais que o que esta esperando int cinto não compila.
		int restoDaDivisaoDeCintoPorDois = 5 %2;
		//operações só podem ser feitas com no minimo uma das variaveis do tipo int. byte + byte +short nao compila.
		double divisao1 = 5.0/0; //divisão por zero só pode ser divido por tipo double.
		int soma = 2;
		System.out.println(URL+(soma+0.0)/0); 
		//System.out.println(soma + 0 / 0); //erro de compilaãção pois não podemos dividir um numero inteiro por zero.
		
		
		
		
		
		int a = 2;
		double b =2;
		
		
		
		
		
		
	}

}
