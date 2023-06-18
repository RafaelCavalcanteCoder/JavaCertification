package certificado_java.exercicios;


public class Exercicio3 {
	
	
	

	private static final int Double = 0;

	public static void main(String[] args) {
		
		double a = 1;
	
		
		for(double i = a; i<=100 ; i++)
			if(i/i==1 && i/1==i && (i*(i/2))==Math.floor(i)) {
				System.out.println( i + "  não é numero primo");
			}else {
				System.out.println(i + "  é numero primo");
			}
		
		
	}
}
