import java.util.Scanner;
public class Salario_maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double maior = 0;
     double[] salario = new double[10];
     System.out.println("  ");
     
     for (int i = 0; i < salario.length; i++) {
		salario[i] = in.nextDouble();
		
		}
      for (int i = 0; i < salario.length; i++) {
    	  for (int j = 0; j < salario.length; j++) {
  			if (!(salario[i] == salario [j])) {
  				if (salario[i] > salario[j]) {
  					maior = salario[i];
  				}
  				else {
  					maior = salario[j];
  				}
  			}
	}
		
		
	}
     
     
     
     System.out.println("O maior salario é " + String.format("%.2f", maior));
	}
     
	
}





