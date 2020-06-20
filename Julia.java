import java.util.Arrays;
import java.util.Scanner;

public class Julia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Olá");
		String v1 = in.nextLine();
		Scanner in1 = new Scanner(System.in);
		String v2 = in1.nextLine();
		

		
		
		
		String[] f1 = v1.split(" ");
		
		
		String[] f2 = v2.split(" ");
		for (String string : f1) {
			for (String string2 : f2) {
				if (string.equals(string2)) {
					System.out.println(string);
				}
			}	
			}
	
		
		
	}
		

}
