import java.util.Random;

public class Pedra_Papel_Tesoura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //1 = papel
	   //2 = tesoura
	   //3 = pedra
	   
	   Random r = new Random();
      
       int n1 = 0, n2  = 0, emp = 0;
       for (int i = 1; i < 6; i++) {
    	   int j1 = r.nextInt(4);
           int j2 = r.nextInt(4);
    	   if (!(j1 == 0) && !(j1 == 4) && !(j2 == 0) && !(j2 == 4)) {
    		   
    			 if (j1 == 1 && j2 == 2) {
    				System.out.println("JOGADOR 1: PAPEL");
    				System.out.println("JOGADOR 2: TESOURA");
    				System.out.println("JOGADOR 2 VENCEU!!!");
    				n2++;
    				
    			}else if (j1 == 1 && j2 == 3) {
    				System.out.println("JOGADOR 1: PAPEL");
    				System.out.println("JOGADOR 2: PEDRA");
    				System.out.println("JOGADOR 1 VENCEU!!!");
    				n1++;
    			}else if (j1 == 2 && j2 == 1) {
    				System.out.println("JOGADOR 1: TESOURA");
    				System.out.println("JOGADOR 2: PAPEL");
    				System.out.println("JOGADOR 1 VENCEU!!!");
    				n1++;
    			}else if (j1 == 2 && j2 == 3 ) {
    				System.out.println("JOGADOR 1: TESOURA");
    				System.out.println("JOGADOR 2: PEDRA");
    				System.out.println("JOGADOR 2 VENCEU!!!");
    				n2++;
    			}else if (j1 == 3 && j2 == 1) {
    				System.out.println("JOGADOR 1: PEDRA");
    				System.out.println("JOGADOR 2: PAPEL");
    				System.out.println("JOGADOR 2 VENCEU!!!");
    				n2++;
    			}else if (j1 == 3 && j2 == 2) {
    				System.out.println("JOGADOR 1: PEDRA");
    				System.out.println("JOGADOR 2: TESOURA");
    				System.out.println("JOGADOR 1 VENCEU!!!");
    				n1++;
    			}else if (j1 == j2) {
    				System.out.println("EMPATE");
    				emp++;
    			}
    		}
	}
       System.out.println("O JOGADOR 1 TEVE " + n1 + " VITÓRIAS");
       System.out.println("O JOGADOR 2 TEVE " + n2 + " VITÓRIAS");
       System.out.println("TEVE " + emp + " EMPATES");
	}

}
