import java.util.Scanner;
public class SalarioCDesconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Digite os salários ");
		Double[] sala = new Double[5];
		for (int i = 0; i < sala.length; i++) {
			sala[i] = in.nextDouble();
			}
         
		for (int i = 0; i < sala.length; i++) {
			if (sala[i] > 1000) {
				sala[i] += sala[i] * 0.10;
				System.out.println("Estes são os salário maiores " + sala[i]);
			}
		}
	}

}
