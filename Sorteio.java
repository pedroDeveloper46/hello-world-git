import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Sorteio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada l = new Lampada();
		Scanner in = new Scanner(System.in);
		System.out.println("1 para ligar");
		System.out.println("2 para desligar");
		System.out.println("A Lampada está ligada");
		int r = in.nextInt();
		
		if (r== 2 || r == 1) {
			l.Lamp(r);
			System.out.println("Deseja continuar?? s/n");
			String res = in.next();
			
				while (res.equals("s")) {
					//*enquanto a resposta for igual a "s" o sistema continuará em execução 
					
					r = 0;
					System.out.println("1 para ligar");
					System.out.println("2 para desligar");
					
					r = in.nextInt();
					l.Lamp(r);
					System.out.println("Deseja continuar?? s/n");
					res = "";
					res = in.next();
				}
				if (res.equals("n")) {
					System.out.println("FIM");
				}
			
		
		
		
		
		
		
		
		}
			
			
			
			
			
		else {
			System.out.println("ERROR");
		}
		
		
		
			
		
	
	  }
       
       
       
	
	}

