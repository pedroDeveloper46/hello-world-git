import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       System.out.println("Digite um numero");
       int numero = in.nextInt();
       for (int i = 2; i < numero; i++) {
		if (numero % i > 0 ) {
			if (i == numero - 1) {
				System.out.println(numero + " é primo");
			}else {
				if (i == numero -1) {
                    System.out.println("Não é primo");
				}
			}
		}
	}
              
     
}
	
}