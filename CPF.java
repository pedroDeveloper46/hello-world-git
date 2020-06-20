import java.util.Arrays;
import java.util.Scanner;
public class CPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner in = new Scanner(System.in);
	   int[] mult = {10,9,8,7,6,5,4,3,2};
	   int[] mult2 = {11, 10,9,8,7,6,5,4,3,2};
	   System.out.println("Digite apenas os primeiros 9 digitos do seu cpf ");
	   String cpf = in.next();
	   int resul = 0;
	   for (int i = 0; i < mult.length; i++) {
		resul += mult[i] * Integer.parseInt(String.valueOf((cpf.charAt(i))));
	}
	 int digito = 0;
	
	 if (resul %11 == 0 || resul %11 == 1) {
		 digito = 0;
		System.out.println("o 10º digito do seu cpf é" + digito);
	}else if (resul %11 == 2 || resul %11 == 3 || resul %11 == 4 || 
			resul %11 == 5 || resul %11 == 6 || resul %11 == 7 || resul %11 == 8 || resul %11 == 9 || resul %11 == 10 ) {
		digito = 11 - (resul %11);
		System.out.println("o 10º digito do seu cpf é " + digito );
	}
	 resul = 0;
	 int digito2 = 0;
	 String novo = cpf + digito;

	for (int i = 0; i < mult2.length; i++) {
		resul += mult2[i] * Integer.parseInt(String.valueOf(novo.charAt(i)));
	}
	int resto = resul %11;
	if (resto == 1 || resto == 0) {
		digito2 = 0;
		System.out.println("o 11º digito do seu cpf é" + digito2);
	}else if (resto == 2 || resto == 3 || resto == 4 || resto == 5 
			|| resto == 6 || resto == 7 || resto == 8 || resto == 9 || resto == 10) {
		digito2 = 11 - resto;
		System.out.println("o 11º digito do seu cpf é " + digito2);
	}
	System.out.println("Seu cpf é " + novo + digito2);
	   
	}

}
