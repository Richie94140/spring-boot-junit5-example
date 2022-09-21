/**
 * 
 */
package example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author orsys
 *
 */
class Testtoto {
	
public Calculatriceservice calculatriceservice=new Calculatriceservice();
	
	
	
	
	/**
	 * @throws java.lang.Exception
	 */
	//@BeforeAll
	void setUpBeforeClass()  {
	
	
	
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	//@AfterAll
	void tearDownAfterClass()  {
	}

	@Test
	void testSoustraction() {
			
		//etape1 initialisation des paramètres d'entrée
				int a=27;
				int b=8;
			//étape2 appel du service à tester et stockage du résultat
				int resultat=calculatriceservice.soustraction(a, b);
				
			//étape3 vérification assertion
			//assertEquals(expected,actual);
				assertEquals(19,resultat);
				assertTrue(resultat>0);
	}
	
	@Test
	void testSomme() {
		
	//etape1 initialisation des paramètres d'entrée
		int a=27;
		int b=8;
	//étape2 appel du service à tester et stockage du résultat
		int resultat=calculatriceservice.somme(a, b);
		
	//étape3 vérification assertion
	//assertEquals(expected,actual);
		assertEquals(35,resultat); 
		
	}
		
	@Test
		void testTemplate() {
			
		//etape1 initialisation des paramètres d'entrée
			int a=27;
			int b=8;
		//étape2 appel du service à tester et stockage du résultat
			int resultat=calculatriceservice.somme(a, b);
			
		//étape3 vérification assertion
		//assertEquals(expected,actual);
			assertEquals(35,resultat);
				
	
	
}}
