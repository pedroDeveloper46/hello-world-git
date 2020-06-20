import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int[] n = new int[3];
        for (int i = 0; i < n.length; i++) {
			n[i] = in.nextInt();
			for (int j = 0; j < n.length; j++) {
				if (n[i] > n[j]) {
					System.out.println(n[i]);
				}
			}
		}
	}
	}


