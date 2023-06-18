package certificado_java.arrays;

import java.util.ArrayList;

public class TestaArrayList {
public static void main(String[] args) {
	
	
	ArrayList <String> nomes = new ArrayList<String>();
	
	 nomes.add("Java");
	nomes.add("JavaC");
	nomes.add("Java");
	
	System.out.println(nomes.contains("Java"));

	
	boolean removeu = nomes.remove("Java"); //quando remove com o mesmo valor, ele remove o primeiro add.
	System.out.println(removeu); //removeu o primeiro "Java"
	System.out.println(nomes.contains("Java")); //aqui o segundo Java add esta na list ainda.
	
	System.out.println(nomes.size());
	
	nomes.toArray(); //converter ArrayList para toArray(); mas converte para um Array tipo Object[]
	//transformando Object em String
	
	String[] mudouPraString = nomes.toArray(new String[0]); //o to.Array converte ArrayList para Object, e este muda Object para String.
	
	mudouPraString[0] = "rafael";
	
	mudouPraString[1] = "oi";
	nomes.add("Java");
	
	System.out.println(mudouPraString[0]);

	System.out.println(mudouPraString[1]);
	
	ArrayList<String> tudo = new ArrayList<>();
	
	ArrayList<String> paises = new ArrayList<>();
	
	paises.add("Brasil");
	
	paises.add(0,"Espanha"); //consigo incluir a posicao //inclui o elemento

	tudo.addAll(nomes); //inclui o array nomes para array tudo
	tudo.addAll(paises); //inclui tudo no array Tudo.
	
	tudo.remove(1); //posso passar a posicao que eu quero remover;
	System.out.println(tudo.size()); //aqui verfiica quantas inicializacao tem na array tudo
	
	System.out.println(tudo.get(3));  //consigo verficar qual posicao eu quero pra ver o valor.
	
	
	nomes.set(0, "Java");  //eletroca o elemento que esta na posição pelo novo elemento. ele tira o que esta na posiçao e coloca esse aqui.
	
	System.out.println(nomes.get(0)); //pega tem esta na posição 0 e volta com o nome.
	System.out.println(nomes.contains("Java")); // verifica se tem "Java" devolve true or false.
	System.out.println(nomes.indexOf("Jaa")); //achar o elemento na posição
	System.out.println(nomes.lastIndexOf("Java")); //e numera a ultima posição, observada no parametro.
	
	}



	
	
	
}
