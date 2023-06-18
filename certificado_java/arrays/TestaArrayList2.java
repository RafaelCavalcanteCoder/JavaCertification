package certificado_java.arrays;

import java.util.ArrayList;
import java.util.Iterator;
public class TestaArrayList2 {
	public static void main (String[] args) {
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("java");
		nomes.add("ruby");
		nomes.add("scala");
		
		Iterator<String> it = nomes.iterator(); //iterator é pra percorrer. //coleções , metodo iterator > devolve um Objeto String
		//objeto que sabe percorrer por todos os elementos daquela coleção, idenpendente do tipo da coleção, que percorre todos elementos.
		//pra fazer um loop pra ver todos os elementos utiliza o while.
		
		while(it.hasNext()) { //hasNext pra verificar o elemento e  se tem um proximo, elemento, se tem, ele volta true , se nao false.
			String atual = it.next(); //next devolve um objeto String atual, elemento , next ele que devolve o proximo elemento.
			System.out.println(atual);
			//it.remove(); // alem de percorrer ele consegue remover os elementos.
		}
		System.out.println(nomes.size());  //aqui ele devolve 0;
		
		for(String nome: nomes) { //mesmo coisa que while. ele percorre todas os elementos.
			System.out.println(nome);
		}
		
		Cliente1 gui = new Cliente1(); 
		gui.nome="Guilherme";
		
		ArrayList<Cliente1> cliente1 = new ArrayList<>(); // o a mesma referencia apontaram para o mesmo objeto.
		
		cliente1.add(gui);  //só pode receber a referencia que devolveu o objeto tudo que esta dentro de Cliente1;
		
		System.out.println(gui.nome);
		System.out.println(cliente1.get(0).nome);
		
		
		gui.nome="Rafael";
		System.out.println(cliente1.get(0).nome);
		System.out.println(gui.nome); //muda em 1 muda o outro
		
		
		
		
		
		
		
		
	}

}
