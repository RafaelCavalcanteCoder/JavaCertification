package certificado_java.metodos;

public class ClasseEmpresa {
	 int Funcionarios;
	 double salariosFuncionarios;
	 double feriasFuncionarios;
	 double despesasDiversas;
	
	 double lucroTotal;
	 double impostos;
	 
	 
	 public void setBonificacao(String ganhou, double salario) {
		 this.salariosFuncionarios += salario;
				 if(salario>=2000) {
					 salario= salario * 0.3;
				 } else {System.out.println("infelizmente você não atingiu a meta, teste no próximo!");
	 }
	 
}
	 
	 public double getBonificacao() {
		 return salariosFuncionarios;
	 }
}