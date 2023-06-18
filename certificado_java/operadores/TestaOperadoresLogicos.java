package certificado_java.operadores;

public class TestaOperadoresLogicos {

	public static void main(String[] args) {
		
		String s1 = "s2";
		String s2 = "s" + "2";
		
	
		System.out.println(s1==s2);
		
		
		
		
		System.out.println(1==1  & 1>2); // e.   V e F = V , V e F = V
		System.out.println(1==1 | 1>2); //ou se 1 for verdadeiro = verdadeiro.
		System.out.println(1==1 ^ 1>2); //ou exclusivo, se V F = V ,  se V V = F  ,  se F F = F.
		System.out.println(!(1==1)); //caso o que esta dentro dos parenteses () seja verdadeiro ele volta falso, se for falso volta true;
		
		//short Circuit || && , ele nao executa o outro lado caso seja false. ^ não existe SC pra ou exclusivo.
	}
}
