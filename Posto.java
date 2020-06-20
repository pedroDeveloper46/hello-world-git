import java.util.Scanner;
public class Posto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(" ");
		
        double alc;
        double gas;
        alc = in.nextDouble();
        gas = in.nextDouble();
        
        double gasp = 0;
        gasp = gas * 0.7;
        if (alc < gasp) {
			System.out.println("ÁLCOOL");
		}else {
			System.out.println("GASOLINA");
		}
        
	}

}
