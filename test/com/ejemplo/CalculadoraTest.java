package com.ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private Calculadora cal;

	@BeforeEach
	public void setUp() throws Exception {
		cal = new Calculadora();
	}
	
	@Test
	public void testSumar() {
		assertEquals(5, cal.sumar(2, 3));
	}
	
	@Test
	public void testRestar() {
		assertEquals(1, cal.restar(4, 3));
	}	
	
	@Test
	public void testMultiplicar() {
		assertEquals(8, cal.multiplicar(2, 4));
	}
	
	
	@Test
	public void testDividir() {
		assertEquals(4, cal.dividir(12, 3));
	}
	
	@Test
	public void testDividirPorCero() {
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {
			cal.dividir(12, 0);// metodo que queremos que lance excepcion
		});

	}
	
	

}
