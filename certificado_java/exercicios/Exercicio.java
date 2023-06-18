package certificado_java.exercicios;

public class Exercicio {
	public static void main(String[] args) {
		
	
	int[] tabuada = new int[100];
	tabuada[1]=10;
	
	for(int i =1; i<=tabuada[1]; i=i*1+1) {
		System.out.println(i);
	}
		
tabuada[2]=20;
	
	for(int i =2; i<=tabuada[2]; i=i*1+2) {
		System.out.println(i);
	}
tabuada[3]=30;
	
	for(int i =3; i<=tabuada[3]; i=i*1+3) {
		System.out.println(i);
	}
		
	tabuada[4]=-9778921;
	System.out.println(tabuada[4]);
	
	
	
	
	
	
	
	
	
	int caixa[] = new int[20]; //criei uma array com 20 espaços dentro da variavel int caixa, pra eu acessar essa variavel preciso colocar [1]
	
	caixa[0]=1*2*1*-2; //primeira posição
	
	caixa[1]=1-2-3; //segundna posição
	
	caixa[2]=1*2+1+2; //terceira posição
	
	System.out.println(1); //imprimindo a caixa[1].
	
	
	String texto[] = new String[20];
	
	texto[0]= "sou da posição inicial 1 primeira posição";
	texto[1]= "sou da  segunda posição posição";
	texto[19] = "sou a penultima posição";
	
	System.out.println("acessando a 19ª posição da array texto[19]" + texto[19]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}