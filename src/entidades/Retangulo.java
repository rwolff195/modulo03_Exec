package entidades;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double areaRetangulo() {
		return altura * largura;
	}
	
	public double perimetroRetangulo() {
		return altura * 2 + largura * 2;
	}
	
	public double diagonalRetangulo() {
		return Math.sqrt(altura * altura + largura* largura);
	}

}
