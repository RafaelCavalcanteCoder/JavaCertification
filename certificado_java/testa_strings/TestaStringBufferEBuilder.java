package certificado_java.testa_strings;

public class TestaStringBufferEBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Rafael"); //maneiras de passar uma strng.
		
		sb.append(" - "); //adiciona caracteres add stirng la dentro.
		sb.append("Ensino e Inovação");
		System.out.println(sb); //chama o toString.
		
		StringBuilder sb2 = new StringBuilder(50); //o tamanho inicial é 50. array
		
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder(sb);//Builder não sincroniza, 
		sb3.append("e Farmacia");
		System.out.println(sb3);
		sb3.append(" x ");
		sb3.append(sb);
		System.out.println(sb3);
		
	}

}
