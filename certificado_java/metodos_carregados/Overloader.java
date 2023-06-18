package certificado_java.metodos_carregados;

//resumo : sobrecargas de metodos só é feito quando o numero de argumentos parametros sao diferentes.
 //nao adianta trocar somente o modificador de acesso nao vai compilar,
 //tbm nao compila quando os parametros são ambiguos, quando o compilador tenta espeficiar mas nao consegue pois um leva ao outro.
 //primeiro deixa tudo mais espeficico possivel , depois tenta generalizar, mas se nos 2 tentar fazer isso nao vai conseguir


public class Overloader {
    
public void metodo1(int a){
    System.out.println("int");
}
public void metodo1 (double b){
    System.out.println("double");
}
public void metodo2(double a, int b){
    System.out.println("double2, int2");
}
public void metodo2(int b, double a){
    System.out.println("int2, double2");
}
public void metodo3(String a,String b ){
System.out.println("String, String");
}
public void metodo3(Object a , Object b){
System.out.println("Object, String");
}
public void metodo4(Object a, String b){
    System.out.println("Object , String");
}
public void metodo4(String a, Object b){
    System.out.println("String, Object");
}
}
class TestaOverload{

public static void main (String [] args){

new Overloader().metodo1(12);//aqui chama o mais espefico o int, mesmo tendo double
new Overloader().metodo1((short) 1);//cabe tbm se chamar um (short) cabe no int
new Overloader().metodo1((float) 123); //aqui se chamar um float ele chama o mais espefico onde cabe no double
new Overloader().metodo2(2, 2.2); //se nao espeficiar pelo menos 1 como double vai dar erro de compilação ambiguidade.
new Overloader().metodo2(1, 2.2);//chamou o mais espefico
new Overloader().metodo3("Rafael", "Cavacalcante");
new Overloader().metodo3("Ola", new Object() );//aqui ele generaliza pois String pode ser um Obecjet, mas não ao contrario
new Overloader();//metodo4("oi", "oi"); //aqui nao compila pois o compilador nao consegue generalizar. nao sabe qual metodo chama

}


}