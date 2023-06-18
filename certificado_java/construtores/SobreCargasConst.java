package certificado_java.construtores;


class Livro{

Livro(String... a){
System.out.println("imprime");
}
Livro(){

     System.out.println("sem argumentos");   
}
Livro(int i){
this();//só pode colcoar this uma vez em cada construtor, e tem que ser na primeira linha
System.out.println("chamando construtor do livro() sem argumentos");
}

Livro(int a, double b){
    this(retorno());
    System.out.println("aqui ta retornando o cosntrutor que tem retorno com metodo do tipo String.");
}
static String retorno(){
    return "só pode chamar metodo dentro do construtor this() se for static";
}

}

public class SobreCargasConst {
    public static void main(String[] args){
    Livro livro= new Livro();//aqui chama o construtor sem argumentos, pois ele chama o mais especifico.
    Livro l =new Livro(9);
    Livro li = new Livro(1, 2.2);//aqui ta criando uma referencia pra um objeto que tem que passar argumento no cosntrutor,
    // e esse construtor chama o construtor que retorna uma String que retorna um metodo que imprime uma string.

    }
}
