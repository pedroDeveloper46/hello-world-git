import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
public class Paises {
       String nome;
       String capital;
       String dimensao;
       double dim;
       public double getDim() {
		return dim;
	}
	public void setDim(double dim) {
		this.dim = dim;
	}
	public String getDimensao() {
		return dimensao;
	}
	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}

	int numero;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
       
     public void InserirPais(String pais, String cap, String dim, double d ) {
    	 this.nome = pais;
    	 this.capital = cap;
    	 this.dimensao = dim;
    	 this.dim = d;
     } 
     
     public void Pegar() {
    	 System.out.println(nome +", " + capital + ", " + dimensao + "," + dim);
     };
     
     public boolean Verfificar(String name) {
    	 if (name.equals(nome)) {
			System.out.println("O pais " + name + "ja existe");
		}
    	 return true;
    	 
     }
     
       
       
       
}
