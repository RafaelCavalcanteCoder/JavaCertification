package certificado_java.construtores;
class A{
    //primeiro aloca espaço na memoria do objecto já estao inicializa todas as variaveis com primitivos = 0 e String = null;
    //depois chama o valor das variaveis que foi passada.
    //chamar metodos apartir de uma variavel membro e chamar metodo dentro de construtor é muito delicado tem que tomar cuidado
int i =15; // 0
String nome;//null
int tamanho = tamanhoDoSobrenome();//zero
String sobrenome = "Cavalcante"; //null 

A(int a){ 
new B(a);
}



A(String nome){

    this.nome=nome;
}
void imprimeNome(){
    System.out.println(nome.length());//mesma coisa
}
int tamanhoDoSobrenome(){ //depois chama aqui o tamanho e verifica que o valor era null, e null.length(); resulta nullPointerExc
    return sobrenome.length();
}
A(){
    
}

}

class B extends A{
    B(int a){
        System.out.println(a);
    }
B(String mae){
    super(mae);
}

}
public class TestaConstrutores {
    
    public static void main(String[] args){

    
    A b = new A("Ola");
    A a= new A();
    System.out.println(b.i);
    B chama = new B("Rafael");//aqui chama o metodo imprimeNome() que chama o resultado do nome.lenght, não iniciliza pq é null

    A e = new A(1); //aqui eu chamo o construtor do A que passa um numero e esse contrutor cria um novo objecto da Classe B
    //que recebe esse numero e imprime.

    }
}
