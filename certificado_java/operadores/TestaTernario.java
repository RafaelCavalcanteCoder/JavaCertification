package certificado_java.operadores;

public class TestaTernario {
	public static void main(String[] args) {
		
		int i = 5;
		int resultado = (i==5) ? 100:5 ;
		int resultado2 = (resultado==100) ? 123 : 0; //aqui só aceita int.
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(i==5 ? "100":0); //no sysout pode fazer string e int
		
		Object resultado3 =(resultado2==resultado) ? 	"verdade" : "mentira"; //object aceita tudo.
		System.out.println(resultado3);
		String idadeM ="maior de 18 anos";
		String idadeI ="menor de 18 anos";
		int x = 18;
		Object resultadoIdade = (x>=18) ? idadeM : idadeI;
		Object resultadoIdade1 = (x<18) ? idadeM : idadeI;
		Object resultadoIdade2 = (x==18) ? idadeM : idadeI;
		System.out.println(resultadoIdade);
		System.out.println(resultadoIdade1);
		System.out.println(resultadoIdade2);
		
		
		
		

	}
	
}
