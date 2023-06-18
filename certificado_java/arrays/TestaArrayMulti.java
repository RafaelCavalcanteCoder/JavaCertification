package certificado_java.arrays;

import java.util.ArrayList;

public class TestaArrayMulti {

	public static void main(String[] args) {
		
	int[][] tabela[]; //podemos contruir arrays de dimendoes , arrays de arrays, quantas dimensoes quisermos.
	int [][] cubo[][]; //4 dimensoes
	int [][] hipercubo[][]; //soma os conchetes;
	
	tabela = new int [10][5][];
	cubo= new int [10][][][];
	hipercubo = new int [8][][][];
		
		
	
		
		
		
		
		
	int[][] estranho = new int[5][]; 
	
	estranho[0] = new int[20];
	estranho[1]= new int[10];
	estranho[2]= new int [15]; //coloca posicoes em cima das posiçoes
	estranho[3]= new int[4];
	estranho[4]= new int[4];
	for(int i = 0; i<estranho.length;i++) {
		System.out.println(estranho[i].length);
	}
	
	
	
}
}

