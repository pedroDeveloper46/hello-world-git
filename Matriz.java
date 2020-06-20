import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("");
		int m[][] = new  int[3][2]; 
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				
				m[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (m[i][j] %  2 == 0) {
					System.out.println( m[i][j]);			
				}
				
				
			}

		}
		
		
	}

}
