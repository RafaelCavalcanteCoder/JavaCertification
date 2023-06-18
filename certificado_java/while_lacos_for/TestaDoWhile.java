package certificado_java.while_lacos_for;

public class TestaDoWhile {
public static void main(String[] args) {
	
	int i=1;
	while(i<10) //executa aqui até a condição dar false.
		System.out.println(i++);
	
	
	int j=1;
			do { //depois passa pra ca e primeira executa o codigo na sequencia das linhas. 
		System.out.println(j);
		j++;
			} while(j<10); // do while executa uma vez pq a condição vem depois. //executa até aqui dar false. na condiçção.
	}
}

