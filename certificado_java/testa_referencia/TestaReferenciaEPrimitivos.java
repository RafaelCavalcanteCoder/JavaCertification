package certificado_java.testa_referencia;

//verificar pilha de execucao sempre;
class Prova{

    int tempo;
}
public class TestaReferenciaEPrimitivos {
    public static void main(String[] args) {
        //primeiro roda o metodo main
        //depois iniciliza o int i=2;
        //roda o metodo, e o metodo tem um resultado referente o int i =2; passado antes, mas o metodo no escopo pode mudar.
        //depois volta pro main e roda o sysout, e esse valor é o int i=2, refente ao int i de antes.
    Prova prova = new Prova();
     prova.tempo=100;
    testeProva(prova);
     //aqui as mesmas referencias apontam para o mesmo objeto, se muda de um muda do outro
    //quando eu chamo o metodo do tipo referencia um objeto e estou referenciando o mesmo objeto, se altera um altera outro
    testaProva2(prova);//aqui cria um novo objecto e referencia prova.tempo do outro objeto, entao morre la dentro o 520
    System.out.println(prova.tempo); //entao aqui imprimi 210, pois o que ta valendo é essa pq ée o objeto de sempre nao alterou
    int i =2;


   teste(i); // se fosse = i = teste(i), dai sim voltaria o vamos i como referencia e depois imprimia o valor do metodo embaixo
    System.out.println("nao afeta o cara do fora valor do " + i);
    
    }
static void testeProva(Prova prova){
    prova.tempo=210;
}
static void testaProva2(Prova prova){
    prova = new Prova();
    prova.tempo=520;
}
    static void teste(int i){
        i= 5;
        System.out.println(i);
    }
}
