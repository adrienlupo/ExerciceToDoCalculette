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
		float result = 0f;
		List <Float> list = new ArrayList<Float>();
		list.add(a);
		list.add(b);
		float expected = 1.0f;
		Calculette calculette = new Calculette();
		
		
		try {
			result = calculette.divide(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(expected,result);
		
	}

}
