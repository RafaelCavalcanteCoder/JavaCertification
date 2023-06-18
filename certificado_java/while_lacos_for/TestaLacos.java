package certificado_java.while_lacos_for;

public class TestaLacos {
	public static void main(String[] args) {
		
		externo :for(int i = 1; i<10; i++) {
			for(int j = 1; j<10; j++){
				System.out.println(i+" * "+ j+ " = " + i*j);
				if(i*j==25) {
					
					break externo; //dei nome pro meu laço for "externo" e uso ele pra dar um break pra quebrar o laço de fora.
				}//pq se der somente break ele quebra o laço mais proximo, nos casos de laços dentro de laços. 
				
			}
		}
		System.out.println("executou aqui");
		
	}
}
		
			//System.out.println("lado externo");
					
			//System.out.println("fora do if"+ i);
			//if(i==5) {
				//System.out.println("entrei no if  e dei break");
				
			
			
			
		
		
	//	System.out.println(" sai do lado e fora do laço");
		
		
		
		
		
		
		//int i = 1;
		
		//while(i<10) {
			//i++;
			
			//if(i==5) {
			//break; // o break sai fora do laço e executa o que esta fora do while.
			//}else { //continue ele volta pro começo.
				//System.out.println("esse é o else" + i);
			
					//System.out.println("fora do while");

		
		
	


