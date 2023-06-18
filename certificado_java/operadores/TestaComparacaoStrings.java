package certificado_java.operadores;

public class TestaComparacaoStrings {
	public static void main(String[] args) {
		
		
		
	
	String nome1 = "Rafael"; //será colocada no pool de Strings se uma string com o mesmo conteúdo já existe ele a reutiliza,
	//evitando criar dois objetos exatamente iguais na memotria,
	String nome2 = "Rafael";
	String nome3 = new String ("Rafael"); //strings criadas com o new não sao colocadas no pool automatico entao criase outro objeto 
	
	System.out.println(nome1==nome3); //false pq um é criado com literal e outro com new. não tem as 2 string apontando pro msm objt
	
	class TestaMetodo{
		
		public static void main(String[] args) {
			
			
		//(nome1.equals(nome3)); // true aqui faz ver se o conteúdo é igual ao outro. conteudo que esta dentro da variavel,
	// e não o a posição de memória diferente

	String a = "a";
	String abc = a +"b" + "c"; // se um dos lados for varaiavel um resultado é uma nova String que não esta no Pool (false)
	String ab = "a" +"b";// se os dois lados da concatenação forem literais o resultado é literal para o o Pool (true)

	System.out.println(ab == "ab"); // false
	
	String texto = "um texto qualquer"; //String literaria vai estar no pool
	String txt = texto.substring(3,8); //String que chama metodo texto.substrig() cria um novo objeto vai pra memoria. o txt é nova ref
	System.out.println(txt==texto);
	System.out.println(txt);
	System.out.println(texto);
	System.out.println(texto.toLowerCase()==texto);//aqui é quando eu comparado uma String com outra chamando o metodo, quando é o msm/
	// conteúdo e o metodo é chamado mas esse metodo nao altera conteúdo ele nao modifica. dai ele é o msm ==
	System.out.println(texto.toString()==texto); 

	
	
	
	
	
	
	
		}
		}
	
	}
	
	}
