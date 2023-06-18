package certificado_java.acessar_variaveis;

public class TestaCicloDeVida {

	public static void main(String[] args) {
		Carro c =new Carro(); //pra criar um objeto precisa chamar o construtor;, 1 Carro criado. uma flexa que referencia um Carro.
		c.ano=2015;
		new Carro(); //2 carros foram criados. nao consigo acessar. pois nao tenho variable para referenciar.
		c =new Carro();//aqui foi criado um nova referencia de um objeto, e a antiga Carro c não é mais acessada. e jogada fora.
		c.ano=2014;
		c.modelo="ferrai";
		c=null; //referenciando nada null; 2 objetos inacessiveis;
		System.out.println("valor é "+c);
		System.out.println(c.ano);
		System.out.println(c);
		System.out.println(c);
		//a = new Carro(); impossivel pois a varible nao foi referenciada a nenhuma classe.
		
		if(15>10) {
			Carro c2 = new Carro();
			c2.ano=2015; //consigo acessar a referencia de um objeto (variable) por esta dentro do escopo fora dele nao consigo mais.
		}//c2 não esta mais acessivel.
		//c2.ano=2015; //não consigo acessar a referenciade de um objeto c2 pois esta fora do escopo. o bloco que foi definida.
		
		//pra ser criado a referencia de um objeto chama-se o construtor;
		//ACESSIVEL: enquanto é referenciado diretamente ou indiretamente.
		//inacessível: sem refenrecias diretas ou indiretas;
		
		//depois que referencias a objetos forem inacessiveis o GARBAGE COLLECTOR arranca fora da memoria, joga fora a qualquer instante;
		
		//GC não tem como saber quando vai rodar, mas quando ele se torna elegivel, quando : ele se torna inacessivel.
		//gc nao sei, quantos podem 2 , quando foram nao tenho ctz;
		
		
	}
}
