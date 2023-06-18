package certificado_java.operadores;

public class TestaAtribuicaoMultipla {
	public static void main(String[] args) {
		int a = 15, b = 20, c = 30;
		
		b=c;
		b+=c;
		a= (b=c)+1;
		a=b=c;
		System.out.println(b);
}
	
	
}
