import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      int qtde1 = 0;
      int qtde2 = 0;
      
      for (int i = 1; i < 4; i++) {
    	  System.out.println("Rodada " + i);
    	  System.out.println("Par ou impar");
    	
          System.out.println("Jogador 1");
          String tipo = in.next();
          if (tipo.equals("impar") || tipo.equals("Impar")) {
        	  int n1 = in.nextInt();
        	  System.out.println("Jogador 2");
              System.out.println("Par");
              int n2 = in.nextInt();
              int soma = n1 + n2;
              int resto = soma % 2;
              if (!(resto == 0)) {
    			System.out.println("jogador 1 venceu");
    			qtde1++;
    		}else {
    			System.out.println("jogador 2 venceu");
    			qtde2++;
    		}
             
    	}else if (tipo.equals("Par") || tipo.equals("par")) {
    		int n1 = in.nextInt();
    		System.out.println("Jogador 2");
            System.out.println("impar");
            int n2 = in.nextInt();
            int soma = n1 + n2;
            int resto = soma % 2;
            if (resto == 0) {
    			System.out.println("jogador 1 venceu");
    			qtde1++;
    		}else {
    			System.out.println("jogador 2 venceu");
    			qtde2++;
    		}
    	}
	}
      System.out.println("O jogador 1 teve " + qtde1+ " de vitorias");

      System.out.println("O jogador 2 teve " + qtde2+ " de vitorias");
      
	}

}
