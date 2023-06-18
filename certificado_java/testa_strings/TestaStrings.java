package certificado_java.testa_strings;

public class TestaStrings {

	public static void main(String [] args) {
		String s = "rafael";
		s = s.toUpperCase(); //cria uma nova string referencia e volta ;
		System.out.println(s);
		System.out.println(s.charAt(2)); //acessar a posição;
		System.out.println(s.length());//metodo que devolve o tamanho da string;
		System.out.println("".isEmpty());// vazia ? true;
		System.out.println("rafel".isEmpty());//nao esta vazio;
		System.out.println("        ".isEmpty());// espaço conta como caractere
		s=s +"da";
		
		String nomeDireto="JAVA";
		String nomeIndireto = new String("Java");
		
		char[] nome= new char[] {'j','a','v','a'};
		String nome1= new String(nome);
		StringBuilder nome2= new StringBuilder(nome1);
		
		String nomeNulo=null;
		
		String nomeDaProva ="Certificação"+ " "+ "java"; //concatenado;
		String nomeDaProvaNulo=nomeDaProva +" " +nomeNulo;
		
		System.out.println(nomeDaProvaNulo);
		System.out.println(nome2);
		System.out.println(nomeIndireto);
		System.out.println(nomeDaProva);
		System.out.println("eis me aqui concatenando" + nomeDaProvaNulo + nome2 +nomeIndireto+nomeDaProva);
		
		
		
	}
}
