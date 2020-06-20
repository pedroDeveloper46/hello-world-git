import java.util.Scanner;
public class VetoresImparesEPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       System.out.println("Digite 10 numeros");
       int[] vetor = new int[10];
       for (int i = 0; i < vetor.length; i++) {
		vetor[i] = in.nextInt();
	}
      
       for (int i = 0; i < vetor.length; i++) {
		 if (vetor[i] % 2 == 0) {
			 int[] par= new int[vetor[i]];
			 par[i] = vetor[i];
			 System.out.println(par[i]);
		}
		if (!(vetor[i] %2 == 0)) {
			int[] impar= new int[vetor[i]];
			 impar[i] = vetor[i];
			 System.out.println(impar[i]);
		}
	}
	}

}
