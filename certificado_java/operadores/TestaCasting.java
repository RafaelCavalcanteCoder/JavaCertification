package certificado_java.operadores;

public class TestaCasting {
	public static void main(String[] args) {
		double d=15.3;
		int i = (int) d; //casting , pegar um tipo mais abragente e colocando em um tipo menos abrangete, mas ele arredonda.
		System.out.println(i);
		long x = 1231312321111111111l;
		int y=(int) x; //aqui imprime um numero bem aleatorio pq eu fiz um casting atribui um long em um int, coisa que sem casting n da
		System.out.println(y);
		
	}

}
