package certificado_java.modificadores_acesso.outropacote;

import certificado_java.modificadores_acesso.ModificadorDeAcesso;

public class Outro extends ModificadorDeAcesso {

    protected int protegidinho(){
        return 5;
    }
    int defauls(){
        return 2;
    }

    public static void main(String[] args) {
        ModificadorDeAcesso modifica = new ModificadorDeAcesso();
        Local l = new Local();
        l.protetor();
       
        

    }
}
