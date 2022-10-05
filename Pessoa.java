package IMC;

/* Classe criada para servir de base para os objetos Pessoa
 * author: Pedro Victor
 * Since: 05/10/22
 * */

public class Pessoa {
      
	private String nome;
	private float altura;
	private float peso;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	Pessoa(String nome, float altura, float peso){
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	public void calcularIMCPessoa() {
		
		float imc  = 0;
		
		imc = this.peso / (this.altura * this.altura);
		
		System.out.println("IMC DO " + getNome());
		
		if(imc < 18.5) {
			System.out.println("MUITO MAGRA");
		}else if(imc <= 24.9) {
			System.out.println("NORMAL");
		}else if(imc <= 29.9) {
			System.out.println("SOBREPESO");
		}else if(imc <= 34.9) {
			System.out.println("OBESO GRAU 1");
		}else if(imc <= 39.9) {
			System.out.println("OBESO GRAU 2");
		}else {
			System.out.println("MÓRBIDO");
		}
		
		
		System.out.println("=========================");
		
		
	}
	
}
