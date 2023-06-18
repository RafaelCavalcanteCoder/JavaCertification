package certificado_java.operadores;

public class ContandoStrings {
	public static void main(String[] args) {
		
	
	String h = new String("hello "); // 2 objetos uma objeto e um "hello" é colocando no pull , h e hello apontado para o mesmo objeto
	String h1 = "hello "; //h1 apontado para o hello , no pool
	String w = "world"; // h1 apontado para world novo objeto criado; "world" pool de strings. h1 nova referencia de objeto
	
	System.out.println("hello ");
	System.out.println(h1+ "world"); //cria-se novo 1 novo objeto "hello world " pq a concatenação junta os 2 e cria com o nome junto
	System.out.println("Hello " == h1);//cria-se novo 1 novo objeto "Hello " pq nao existia Hello. 
			
			
			
			
	}
}
