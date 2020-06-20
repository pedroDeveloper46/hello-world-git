
public class Lampada {
      public boolean ligado;
      public boolean desligado;
      
      public void Lamp(int n) {
    	  if (n == 1) {
		    System.out.println("Lampada ligada");
		}else if (n == 2) {
			System.out.println("Lampada Desligada");
		}else {
			System.out.println("ERROR");
		}
      }
}
