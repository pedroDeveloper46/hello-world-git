import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Mercado_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner in = new Scanner(System.in);
           DecimalFormat df = new DecimalFormat("###,##0.00");
           Mercado m = new Mercado();
           String caixa;
           String produto;
           int quat = 0;
           double preco = 0;
           double total = 0, troco = 0, restante = 0;
           double valor = 0;

           
           System.out.println("Deseja abrir o caixa??");
           caixa = in.next();
           while(caixa.equals("sim")) {
        	   caixa = "";
        	   System.out.println("Digite o nome do Produto");
        	   produto = in.next();
        	   System.out.println("Digite o Preço");
        	   preco = in.nextDouble();
        	   System.out.println("Digite a quantidade que irá levar");
        	   quat = in.nextInt();
        	   
        	   total += m.Total(quat, preco);
        	   System.out.println("Deseja continuar comprando?");
        	   caixa = in.next();
        	   if (caixa.equals("não")) {
				System.out.println("Total a Pagar: " + df.format((total)));
				System.out.println("Digite o valor Pago: ");
				valor = in.nextDouble();
			}
        	 
        	   if (valor > total) {
					troco = valor - troco;
					System.out.println("Troco: " +troco);
					System.out.println("Compra Finalizada!!");
				}else if (valor < total) {
					restante = total - valor;
					System.out.println("Ainda resta: " + restante);
					
					
					while (restante >= valor) {
						valor = 0;
						System.out.println("Pague o restante");
						valor = in.nextDouble();
                        if (valor > restante) {
                        	troco = valor - restante; 
							System.out.println("Troco:" +troco);
						}else if (restante > valor) {
							
							restante = restante - valor;
							valor = 0;
							System.out.println("Restante: "  + restante);
							
							
						}else if (restante == valor) {
							System.out.println("Compra Finalizada!!!!");
						}						
					}
				}else if(valor == total) {
					System.out.println("Compra Finalizada!!");
				}
        	   
           }
           
     
          
		}
           
           
          
           
           	

}
