package app.m2i.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import app.m2i.models.Calculette;

class CalculetteTest {

	
	@Test
	void subTest() {
		float a = 2.0f;
		float b = 1.0f;
		List <Float> list = new ArrayList<Float>();
		list.add(a);
		list.add(b);
		float expected = 1.0f;
		Calculette calculette = new Calculette();
		
		float result = calculette.sub(list);
		
		assertEquals(expected,result);
		
	}
	
	@Test
	void divideTest() {
		float a = 2.0f;
		float b = 2.0f;
		float result = 1f;
		List <Float> list = new ArrayList<Float>();
		list.add(a);
		list.add(b);
		float expected = 1.0f;
		Calculette calculette = new Calculette();
	
			try {
				calculette.divide(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		
		assertEquals(expected,result);
		
	}
	
	@Test
	void divideExceptionZero() {
		float a = 2.0f;
		float b = 0.0f;
		List <Float> list = new ArrayList<Float>();
		list.add(a);
		list.add(b);
		Calculette calculette = new Calculette();
		String messageAttendu = "Division par 0";
		
		Exception exception = assertThrows(Exception.class, () -> {
			calculette.divide(list);
		});
		
		String messageObtenu = exception.getMessage();
		
		assertTrue(messageObtenu.contains(messageAttendu));
				
				
	}
	
	
	@Test
	void additionTest() {
		
		
		float a = 1f;
		float b = 1f;
		
		List <Float> list = new ArrayList<Float>();
		list.add(a);
		list.add(b);
		float attendu = 2f;
		Calculette calculette = new Calculette(); 
		
		float result = calculette.sum(list);
		
		assertEquals(attendu, result);
		
	}
	
	@Test
	void multiplicationTest() {
		
		
		float a = 4f;
		float b = 5f;
		
		List <Float> list = new ArrayList<Float>();
		list.add(a);
		list.add(b);
		float attendu = 20f;
		Calculette calculette = new Calculette(); 
		
		float result = calculette.multiply(list);
		
		assertEquals(attendu, result);
		
	}

	@Test
	void factorielleTest() {
		
		
		float a = 3f;		
		float attendu = 6f;
		Calculette calculette = new Calculette(); 
		
		float result = calculette.factorielle(a);
		
		assertEquals(attendu, result);
	}	
	

}
