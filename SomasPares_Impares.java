import java.util.Scanner;
public class SomasPares_Impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int soma = 0;
		int somaImpar = 0;
		
		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
				
			}
		}
		for (int i = 0; i <= 30; i++) {
			if (!(i % 2 == 0)) {
				somaImpar = somaImpar + i;
				
			}
		}
		System.out.println("Soma entre os numeros Pares de 0 ate 30 é igual a " +soma);
		System.out.println("Soma entre os numeros Impares de 0 ate 30 é igual a " +somaImpar);
	}
	

}
