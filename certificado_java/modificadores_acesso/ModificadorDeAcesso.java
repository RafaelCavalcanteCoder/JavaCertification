package certificado_java.modificadores_acesso;

//4 modificadores de accesos::*
//public o mais aberto, qualquer um acessa;
//protected, qualquer um que me herda ou qualquer um dentro de mim ou qualquer um dentro do meu pacote ME HERDAM.
//default, modificador de acesso quando nao escreve nada, está dentro do pacote ou dentro de mim pra me acessar;
//private só quem esta dentro de mim Pode me ACESSAR.
// CLASSES E INTERFACES PODEM SER PUBLIC OU DEFAULT; construtot atributos\variaveis membros e metodos usam todos modificadores

public class ModificadorDeAcesso {
    
protected String protegido(){
   return "retorna no mesmo pacote ou que herda;";
}
String padrao(){
    return"default só no mesmo pacote ou dele msm.";
}
}
