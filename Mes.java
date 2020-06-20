import java.util.Scanner;
public class Mes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Em que ano você nasceu?");
		int v1 = in.nextInt();
		System.out.println("Em que ano estamos?");
		int v2 = in.nextInt();
		int i = v2 - v1;
		if (i >= 18) {
			System.out.println("Pode votar");
		}else {
			System.out.println("Não pode  ");
		}
	}

}
