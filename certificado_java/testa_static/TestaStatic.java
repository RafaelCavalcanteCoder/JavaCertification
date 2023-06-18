package certificado_java.testa_static;

class Moto{
    public static int minhaClasse; //=PADRAO_TOTAL_DE_MOTOS; //não pode acessar uma variavel que foi inicializada depois dessa
    public static final int PADRAO_TOTAL_DE_MOTOS =15 ;
   
    private static int motos;
    private static int  motocas;
    public static String marca;
    public int polimorfimos(){
        return 123123;
    }

public static int totalDeMotos(String possoAcessarVarLocal){ //metodos pode acessar qualquer ordem , pq o metodo é invocado dps
     int numero = 15; //pode criar variavel local só existe aqui.
    marca = "Honda"; //não posso acessar uma coisa static dentro de alguma coisa static dentro desse escopo
    minhaClasse=14;
    int  total = motos+motocas+minhaClasse;
    
    return total;
}
//primeiro inicializa todas as variaveis static com padrao default;
//depois inicializa as varaiveis, e a metodo com a vale 0;
public static int b = getMetodo(); 
public static int getMetodo(){
    return a;
}
public static int a=100;
//só pode criar metodos atributos e querer chamar depois somente de atributos static, metodos static, 
    //Static é da classe e nao do objeto.
    //podemos criar atributos e metodos Statics.
}

public class TestaStatic {
   public int recebeTalCoisa;
    public static void main(String[] args) {    
Moto.totalDeMotos("S");
Object moto =Moto.totalDeMotos("Aqui");
System.out.println(moto);
System.out.println(Moto.b); //aqui da zero 
System.out.println(Moto.a);



Moto moto2 = new HerancaStatic();
System.out.println(moto2.getMetodo()); //mesmo falando que moto2 é um objeto do herancaStatic ele continua chamando da classe Moto.
System.out.println(Moto.getMetodo()); //eu chamo do tipo da variavel e nao do tipo referenciado de tempo de execução
//tipo Moto moto2 = new HerancaStatic(); a
//qualquer metodo que eu chamar moto2.eleVaiTrocar por Moto.EleVaiTrocarAqui();

Moto vamosVer = new HerancaStatic();
System.out.println(vamosVer.polimorfimos() +"aqui imprimi o resultado do metodo do HerancaStatic diferente do Metodo Static");

HerancaStatic diferente = new HerancaStatic();
System.out.println(diferente.polimorfimos());
    }
}
class HerancaStatic extends Moto{

    public static int getMetodo(){ //nao existe sobreescrita de metodos statics.
return 2;
    }

    public int polimorfimos(){
        return 20;
    }


}
