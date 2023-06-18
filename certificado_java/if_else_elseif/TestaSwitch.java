package certificado_java.if_else_elseif;

public class TestaSwitch {
	public static void main(String[] args) {
		int opcao = 5;
		final int variavel = 2;
		switch(opcao) {
		
		case 1: // só o valor da variavel é colocado aqui, o nome da variavel nao compila. //somente variavel final.
			System.out.println("primeiro 1");
			break; //colocar esse break pra parar execucao quando ativer o valor adequado escolhido da variavel
		case 2: 
			System.out.println("primeiro 2");
		case 3:
			System.out.println("terceira 3");
		default://default executa quando nenhum outro case é executado, e nao importa a ordem que esta, porem a ordem que esta executa o que esta abaixo
			System.out.println("nao caiu em nenhum case. valor default continou a execucao nao dei break");
			//break;
		case 4:
			System.out.println("executou depois do default pq estou abaixo e nao deu break.");
		}
		
		
	}

}
