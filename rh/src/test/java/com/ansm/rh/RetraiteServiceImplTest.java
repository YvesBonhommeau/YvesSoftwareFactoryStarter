package com.ansm.rh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.ansm.rh.service.RetraiteService;
import com.ansm.rh.service.RetraiteServiceImpl;

@SpringBootTest
public class RetraiteServiceImplTest {
	
	private RetraiteServiceImpl retraiteService = new RetraiteServiceImpl();
	
	@Test
	public void testSexeFemme() {
		// Initialisation du test
		String sexe = "F";
		int anneeNaissance = 1990;
				
		// Appel du service 
		int resultat = retraiteService.getAnneeDepartRetraite(sexe, anneeNaissance );
		
		// Vérification / Assertion
				
		assertEquals(2050, resultat);
		
	}

	@Test
	public void testSexeHomme() {
		// Initialisation du test
		String sexe = "M"; 
		int anneeNaissance = 1990;
		
		// Appel du service 
		int resultat = retraiteService.getAnneeDepartRetraite(sexe, anneeNaissance);
		
		// Vérification / Assertion
				
		assertEquals(2052, resultat);
	}
		
}
