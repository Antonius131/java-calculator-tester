package org.generation.italy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcolatriceTest {

	public static Calcolatrice calc;
	
	@BeforeAll
	static void init() {
		
		calc = new Calcolatrice(2, 2);
	}
	
	
	@Test
	@DisplayName("Testing add method")
	void addTest() {
		
		float sum = calc.add(2, 2);
		assertEquals(4, sum, "somma inattesa");
	}
	
	@Test
	@DisplayName("Testing sybtract method")
	void subTest() {
		
		float diff = calc.subtract(2, 2);
		assertEquals(0, diff, "differenza inattesa");
	}
	
	@Test
	@DisplayName("Testing divide method")
	void divTest() throws Exception{
		
//		float div = calc.divide(4, 0);
//		assertEquals(0.4f, div, "risultato inatteso");
		
		assertThrows(Exception.class, () -> calc.divide(4, 0));
	}

	@Test
	@DisplayName("Testing multiply method")
	void mulTest() {
		
		float mult = calc.multiply(2, 2);
		assertEquals(4, mult, "prodotto inatteso");
	}
}