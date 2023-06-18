package certificado_java.arrays;

public class TestaArray2 {
	public static void main(String[] args) {
	
		Cliente1 cliente[]=new Cliente1[10];
		
		//System.out.println(cliente[0].nome); //tem que inicializar o algum valor em nome
		
		for(int i = 0;i<cliente.length;i++) {
			cliente[i] = new Cliente1(); // a cada vez que faz um loop
			cliente[i].nome="mario";// a cada posição de i da array, chama a variavel nome e recebe "mario";
			System.out.println(cliente[i].nome);
		}
		
		for(Cliente1 c : cliente) { //c recebe tudo que tem dentro de cliente e mando impri
		System.out.println(c.nome);
		}


		Cliente1 clientes2[]= new Cliente1[10];
		clientes2[0]= new Cliente1();
		clientes2[1]= new ClienteEspecial();
		
		
	// clientes2[1].nome="rafael";
	 //System.out.println(clientes2[1].nome);
	 
	 Cliente1 guilherme = new Cliente1();
	 
	 guilherme = clientes2[0]; //aqui eu fiz as duas referencias a um objeto apontar para o mesmo objeto, dai quando muda 1 muda os 2;
	 
	 guilherme.nome="rafael"; //atribui valor a variavel nome, e tbm a referencia clientes2[0] aponta para o mesmo objeto.
	 
	 System.out.println(clientes2[0].nome); //imprimi "rafael" // pois estao apontando para o mesmo objeto.
		System.out.println(guilherme.nome); //imprimi "rafael
		
		clientes2[1] = guilherme;//apartir daqui essas 2 referencias apontando para o mesmo objeto.
		
		clientes2[1].nome="oliveira"; //atribui uma string para a variavel nome, onde apartir disso as 2 referencias a objeto sao mudam.
		//pois o o objeto é o mesmo.
		
		System.out.println(guilherme.nome);
		System.out.println(clientes2[1].nome);
		
		
	//	int valores[]= new int[10]; não posso fazer um casting de tipos primitivos.
	//	long numeros[]=(long[]) valores; //nao consigo atribuiu
		
		
		String nomes[]= {"Mario", "Guilherme"}; //variaveis do tipo referencia consigo atribuir operador de atribuicao
		Object objetos[] = new Object[2];
		
		objetos=nomes; //aqui as mesmas referencias apontam para o mesmo objeto. /consigo atribuir/
		
		nomes[0]="rafael";
		objetos[1]="ola";
		System.out.println(objetos[0]);
		System.out.println(objetos[1]);
		
		for(Object o :nomes) {
			System.out.println(o);
		}
		
		
		
		
	}
	
	
}
class Cliente1{
	String nome;
	
}

class ClienteEspecial extends Cliente1{

}