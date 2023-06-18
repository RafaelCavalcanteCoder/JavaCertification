package certificado_java.testa_metodos;

class Param{
	 String getNumero(int a) { //retorno obrigatorio. //espero que o retorno me devolva uma String.
		if(a>0) {
			return "maior";
		} else if (a<0)
		return "menor";
		else
		return "nenhum";
		//ou uma exception ou erro ok
		
			//tem que colocar algum return, quando nao é void.
		
		}
	 void metodo(int a){
		 if(a>0)
		 System.out.println("retorou");
		 else
			 return;
	 }
	
	
	static void primitivo(double a) { //promocoes de tipo primitivos vale pra chamada de metodos byte cabe no > char (n-1)short> int > doublet > float > long > 
		
	}
	void referenciaPolimorfismoString(Object o) {
		return; //ultima expressão do metodo.
		//System.out.println("a"); // não pode colocar algo depois do return;
	}
	
	//variavel com final não pode ter seu valor alterado.
	void teste(final int a, int b) { //não pode inicializar o que esta dentro do parametro. ( int a = 1, int b = 2) <<<<< não pode !;
		b=19;
		//a=10; modificar de acesso para parametro só pode ser usado o final. este não pode ser mais alterado
	}
}

class ClasseComMetodos{
	
	//final se essa classe for herdado esse metodo ele não pode ser sobrescrito
	//abstracted esse metodo é só a definição do metodo sem corpo.
	//static o metodo pertence a classe, o metodo não pertence ao objeto(aquele que cria new )
	//syncronazied acesso ao metodo é sincronizado,
	//
	
	//modificadores de acesso, public, privated, protected só pode ter 1 , se não colocar nada ele é default.
	int getNumero() { //tipo de retorno e nome do metodo são obrigatorios. parametros() quantidade de parametros é opcional 
		return 5; //bloco é o corpo do metodo{}
	}
	
}

public class TestaMetodos {
	public static void main(String[] args) {
		Param p = new Param();
		p.teste(1, 2);
		p.primitivo(1); //void não pode ser atribuido não tem como utlizar o resultado dele pra algma coisa.
		Param.primitivo(1); //static herda da classe não precisa instanciar.
		p.referenciaPolimorfismoString("rafael"); //toda string é objecto polimorfismo.
		p.primitivo('Z'); //'Z' é char e char pode ser promovido para double.
		System.out.println(p.getNumero(1));
		String atrubiu =p.getNumero(123); //quando devolve a String pode atribuir a uma variavel do tipo String.
		System.out.println(atrubiu);
	}

}
