package certificado_java.operadores;

public class TestaComparacao {
	
	public static void main(String[] args) {
		
		//operadores de comparação:
		/* == igual;
		 * != diferente;
		 * 
		 *>maior 
		 *<menor
		 *>= maior ou igual 
		 * <= menor ou igual
		 */
		
		int idade = 20;
		System.out.println(idade = 1); //eu atribui o valor 1 na variavel do tipo int idade. //não foi uma comparação;
		System.out.println(idade==20); //aqui sim eu comparei verifiquei se a variavel idade é IGUAL a 20; volta true.
		
		System.out.println(true==true); //não pode misturar boolean com numero ou boolean com referencias, ou Strings.
		System.out.println(true!=false); //cada um dos tipos só podem ser comparados entre si;
		
	
		
		
		
		
		System.out.println(1d==1f); //não importanta o tipo da variable o valor passado  é o  considerado 1==1;
		System.out.println(1!=1);
		System.out.println(2>=1);
		System.out.println(2<=1);
		System.out.println(2>1);
		System.out.println(2<1);
		
		

		
	}

}
