package IMC;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa("Pedro", 1.69F,100F);
		
		pessoa.calcularIMCPessoa();
		
		Pessoa p1 = new Pessoa("Carlos", 1.65F,53);
		p1.calcularIMCPessoa();
		

	}

}
