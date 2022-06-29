package com.ansm.rh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.ansm.rh.service.CalculatriceServiceImpl;

@SpringBootTest
public class CalculatriceServiceImplTest {
	
	private CalculatriceServiceImpl calculatriceService = new CalculatriceServiceImpl();
	
	@Test
	public void testAddition() {
		// Initialisation du test
		int x = 100; 
		int y = 32;
		
		// Appel du service 
		int resultat = calculatriceService.addition(x, y);
		
		// Vérification / Assertion
				
		assertEquals(132, resultat);
		
	}
	@Test
	public void testSoustraction() {
		// Initialisation du test
		int x = 100; 
		int y = 32;
		
		// Appel du service 
		int resultat = calculatriceService.soustraction(x, y);
		
		// Vérification / Assertion
				
		assertEquals(68, resultat);
		
	}
}
