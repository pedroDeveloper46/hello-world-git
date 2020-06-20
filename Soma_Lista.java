import java.util.Scanner;
public class Soma_Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner in = new Scanner(System.in);
       
       String var = " ";
       System.out.println(" ");
       
       int soma = 0;
       var = in.next().replace(";", "");
     
       //var = var.replace(";", "");
       
       
       for (int i = 0; i < var.length(); i++) {
    	  soma += Integer.parseInt( String.valueOf(var.charAt(i)));
       }
       System.out.println(soma);
	}

}
