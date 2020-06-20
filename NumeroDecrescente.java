import java.util.Scanner;
public class NumeroDecrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("");
        int var = in.nextInt();
        while (var >= 0) {
        	System.out.println(var);
			var = var -1;
			
		}
        
	}

}
