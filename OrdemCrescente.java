import java.util.Arrays;
import java.util.Scanner;
public class OrdemCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner in = new Scanner(System.in);
	   System.out.println(" ");
	   int aux;
       int[] n = new int[5];
       for (int i = 0; i < n.length; i++) {
		n[i] = in.nextInt();
	}
       for (int i = 0; i < n.length; i++) {
		for (int j = 0; j < n.length; j++) {
			if (n[i] < n[j]) {
			  aux = n[j];
			
			  n[j] = n[i];
			  n[i] = aux;
			  			
			}
		}
	}
      System.out.println(Arrays.toString(n).replace("[", "")
    		  .replace("]", ""));
      
	}

}
