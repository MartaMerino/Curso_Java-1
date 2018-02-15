package com.incyde;

public class Principal {
	
	public static void main(String[] args) {
		Cuadrado[] cuadrados = new Cuadrado[3];
		cuadrados[0] = new Cuadrado();
		cuadrados[1] = new Cuadrado();
		cuadrados[2] = new Cuadrado();
		
		cuadrados[0].color = "Blanco";
		cuadrados[1].color = "Amarillo";
		cuadrados[2].color = "Rojo";
		
		cuadrados[0].dibujar();
		cuadrados[1].dibujar();
		cuadrados[2].dibujar();
		
		mainBasico(args);
	}
	public static void mainBasico (String[] args) {
		Cuadrado cuadradoMarta = new Cuadrado();
		cuadradoMarta.lado = 2f;
		cuadradoMarta.color = "Azul";
		System.out.println("El perimetro es " + cuadradoMarta.perimetro());
		System.out.println("El area es " + cuadradoMarta.area());
		System.out.println("Dibujando " + cuadradoMarta.toString());
		
		
	}
	
}
