package certificado_java.modificadores_acesso.outropacote;

import certificado_java.modificadores_acesso.ModificadorDeAcesso;

public class Local {
    
    int protetor(){
        return 5;
    }
    public static void main(String[] args) {
        
    
    Outro outro = new Outro();
    outro.protegidinho();
    ModificadorDeAcesso modifica= new ModificadorDeAcesso();
    outro.defauls();
    }

}
