package certificado_java.if_else_elseif;

public class Saudacoes {

		
		String nome;
		int idade;

			String idadeMenor18anos(String nome, int a) {
			if(a<18) 
			return "ola" + nome + "você é menor de idade";
			else if (a>=18) 
				return "ola" +nome+ "você é maior de idade";
			else  
				return null;
			}
		}
		

	class Aluno2{
		
		public static void main(String[] args) {
			
			Saudacoes aluno = new Saudacoes();
			
		String nome = aluno.idadeMenor18anos("Rafael", 17);
			System.out.println(nome);
			
			
		
		
		}
	}


