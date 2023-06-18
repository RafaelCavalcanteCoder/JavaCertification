package certificado_java.retornos;
public class ClasseComMetodos {


int getNumeros() throws RuntimeException{
    int a =70;
 throw new RuntimeException("Retornando alguma coisa nao obrigatorio return nesse caso");

}

int getNumero( final int a, int b){
   return b =20;
    //return a=20 * //variavel local final não pode ter seu valor trocado;
}

String getNome( int a){ //metodo com Retorno sempre precisa do Return o tipo da assinatura;
    if(a>0) return "Ola";
    else if (a<2) return "oi";
    return "Nada";
}

void primitivo(Object o){

}


// modificadores de gerais;
//final* se a classe for herdade o metodo nao poderar ser reescrito.
//abstract só a definição do metodo só a assinatura do metodo sem corpo.
//static , metodo pertence a Classe, não ao objeto.
//syncronatic acesso ao metodo é sincronizado, ele bloqueia diversas trade pra acessar esse metodo.



}

class TestaMetodos{
    public static void main(String[] args){

        ClasseComMetodos n = new ClasseComMetodos();
        n.getNumeros();
        n.primitivo(new Object());
        n.primitivo(n); //acontece o polimorfismo
        n.primitivo("Herdam da classe ");

        //Object oi = //n.primitivo(n); //void não da pra guardar dentro de variaveis pq é metodo void.

    }
}