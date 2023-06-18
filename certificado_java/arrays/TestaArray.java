package certificado_java.arrays;

class Cliente {

}

public class TestaArray {
//array é um objeto.
	public static void main(String[] args) {
		int idade[] = new int [10];//todas as posições são de valor default =0 quantidade de array [quantidades x 123]
		int idades[] = new int [] {02,4,6,8,10};//nºpares todas as posições são de valor default =0 quantidade de array [quantidades x 123]
		idades[4]=10; //a 4º posição vale 10; apartir dessa declaração
		System.out.println(idades[4]); //imprimindo a 4º posição com valor 10. //se pegar posição que nao tem da erro.

		//alem de variables tipo int, podemos usar array posiçõs outros tipos de variaveis, igual a esta cliente,
		Cliente clientes[] = new Cliente[] {new Cliente(), null,  new Cliente() }; 
		System.out.println("array de clientes "+clientes[0]); //criou um novo objeto mas não tem variavel referenciando.
		System.out.println("array posicao idade "+idades[0]); //para acessar a posição do array que quero acessar, começando por 0;
		idades[2]=123;
		System.out.println("array declarada individualmente "+idades[2]);
		
		
		
		int idade2[] = {0,2,4,6,8,10,12,14,16,18,20}; //abreviação pode usarm mas só pode inicializar e declarar na mesma linha.
		int idade3[];
		//idades3[] = {0,2,4,6,8};//assim não pode pois a array foi declarada antes.
System.out.println("verifique posiçoes"+idade2.length); //o tamnho do array, é usado pra ver quantas posições tem dentro da do array idade2.
	
		for(int i =0;i<idade2.length; i++) { // o mais indicado é esse. esse length é o tamnho do array, para percorrer um array;java
			System.out.println(idade2[i]); // para verificar quantas posiçoes tem, utilizando for ele vai percorer todas posiões e me da o valo
			// de cada aarray
			
			
			
			for(int idade5 : idades) { //fazer uma leitura passando por todos array. para cada valor que tem dentro de idades coloca dentro de 
				//idades5;
				System.out.println("o que vem aqui"+idade5);
				
				
				int b = 200;
				
				for(int a = 0; a<b; a++) {
					System.out.println(a);
				}
				
				
				
			int caixa[] = new int[10];
				
				caixa[9] = 50;
				
				System.out.println(caixa[9]);
			
				
	}		
}			
				
	}}		
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			//4 pontos importantes sobre arrays sao:
			// Declarar 
			/* Inicializar
			 * Acessar
			 * Percorrer
			 * 
			 * Inicialização: Array é um objeto entao dando new cria um objeto. e tem que ser inicializada.
			 * Instanciar um Array
			 * 
			 * 
			 */
		



	


