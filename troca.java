import java.util.Scanner;
public class troca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 20 numeros");
        int[] vetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
			vetor[i] = in.nextInt();
		}
        int aux = 0;
        aux = vetor[19];
        vetor[19] = vetor[0];
        vetor[0] = aux;
        for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
