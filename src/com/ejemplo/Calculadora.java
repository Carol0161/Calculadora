package com.ejemplo;

public class Calculadora {
	
	public int sumar(int a, int b) {
		return a + b;
	}
	
	public int restar(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b) {
		// comentario para detectar cambios cuatro
		return a * b;
	}
	
	public int dividir(int a, int b) {
		if ( b==0 )
			throw new IllegalArgumentException ("No es posible la division entre cero");
		return a/b;
	}

}
