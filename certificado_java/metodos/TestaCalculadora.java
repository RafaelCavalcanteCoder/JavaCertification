package certificado_java.metodos;

class Calculadora{
	public int soma(int... numeros) { //int... pode receber parametros infinitos, numeros é um args; 
		int soma = 0;
		for(int i = 0; i<numeros.length; i++) {
			soma+=numeros[i];
		}
		return soma;
		
	}
	
}
public class TestaCalculadora {
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		System.out.println(c.soma()); //não é obrigatorio receber parametros; quando for int... ... .. ... ..
		System.out.println(c.soma(1,2,3,1,2,6,2,2,1,7,3,1,123,4,5,8,4,1,1,1,1,1,1,1));
	}

}
