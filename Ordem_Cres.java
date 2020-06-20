import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Ordem_Cres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       System.out.println("");
       String n = "v";
       ArrayList<String> lista = new ArrayList();
       lista.add("51925521842");
       lista.add("51924421321");
       lista.add("51924390988");
       
       
      String[] cpf = new String[3];
      System.out.println("Faça o filtro");
      for (int i = 0; i < cpf.length; i++) {
		cpf[i] = in.next();
	}
      
	  for (String string : lista) {
		for (int i = 0; i < cpf.length; i++) {
			if (string.equals(cpf[i])) {
				System.out.println(cpf[i] + " existe");
			}
		}
	}
		
	}	
	}
	
      
	
       
	


