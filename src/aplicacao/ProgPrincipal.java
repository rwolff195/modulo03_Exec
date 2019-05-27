package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class ProgPrincipal {

	public static void main(String[] args) {
	/*
	Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de
	sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado 
	*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("***Entre com os dados do Retângulo***");
		System.out.print("Entre com a altura: ");
		retangulo.altura = sc.nextDouble();
		System.out.print("Entre com a Largura: ");
		retangulo.largura = sc.nextDouble();
		
		double area = retangulo.areaRetangulo();
		double perimetro = retangulo.perimetroRetangulo();
		double diagonal = retangulo.diagonalRetangulo();
		
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Perimetro: %.2f%n", perimetro);
		System.out.printf("Diagonal: %.2f%n", diagonal);

	}

}
