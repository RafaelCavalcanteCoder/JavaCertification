package certificado_java.operadores;

public class TestaPrecedenciaTrocada {
	public static void main(String[] args) {
		int a = 15 *4 +1;
		System.out.println(a);

		int b = 15 *(4 +1); //com o uso dos parenteses () ele executa primeiro o que esta dentro dos parenteses.
		System.out.println(b);
		
		System.out.println(15 + 0 + " , é 150 ? não pois não concatenou o zero e sim somou");
		System.out.println(15 + (0 + " , é 150 ? sim pois usei os parentereses para ler primeiro e depois o outro"));
		System.out.println(("guilherme" + "silveira").length()); //aqui no silveira chamou o metodo la no guilherme nao, usando a 
		//precedencia ( )  dai sim conseguimos executar.
		 
		


	}
	

}
