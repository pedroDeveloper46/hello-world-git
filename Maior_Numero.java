import java.util.Scanner;
public class Maior_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("");
        
        int n1, n2, n3;
        int maior, prox  = 0;
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        
        if (n1 >= n2 && n1 >= n3) {
			maior = n1;
		}
        else if (n2 >= n1 && n2>= n3) {
			maior = n2;
		}
        else {
			maior = n3;
		}
        System.out.println("Dentre esses valores o maior é " + maior);
        if (maior == n1) {
			if (n2 < maior && n2 > n3) {
				prox = prox +n2;
			}else {
				prox = prox + n3;
			}
			
		}else if (maior == n3) {
			if (n1 < maior && n1 > n2) {
				prox = prox +n1;
			}else {
				prox = prox + n2;
			}
		}else {
			if (n1 < maior && n1 > n3) {
				prox = prox +n1;
			}else {
				prox = prox + n3;
			}
		}
        
        System.out.println("o valor aproximado de " +  maior +  " foi " +prox);
        
        
	}

}
