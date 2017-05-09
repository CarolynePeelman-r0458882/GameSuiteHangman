package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirkelTest {
	
	private int radius1 = 2;
	private int radius2 = 3;
	private Punt punt1 = new Punt(5,6);
	private Punt punt2 = new Punt(8,7);

	@Test
	public void test_cirkel_met_geldige_middelpunt_en_straal() {
		Cirkel cirkel = new Cirkel(punt1, radius1);
		assertEquals(cirkel.getRadius(), radius1);
		assertEquals(cirkel.getMiddelpunt(), punt1);
	}
	
	@Test (expected = DomainException.class)
	public void test_cirkel_met_middelpunt_null_geeft_exception(){
		Cirkel cirkel = new Cirkel(null, radius1);
	}
	
	@Test (expected = DomainException.class)
	public void test_cirkel_met_straal_kleiner_dan_nul_gooit_exception(){
		Cirkel cirkel = new Cirkel(punt1, -1);
	}
	
	@Test (expected = DomainException.class)
	public void test_cirkel_met_straal_gelijk_aan_nul_gooit_exception(){
		Cirkel cirkel = new Cirkel(punt1, 0);
	}
	
	@Test
	public void test_twee_cirkels_met_zelfde_middelpunt_en_straal_zijn_gelijk(){
		Cirkel c1 = new Cirkel(radius1, punt1);
		Cirkel c2 = new Cirkel(radius1, punt1);
		assertTrue(c1.equals(c2));
	}

	@Test
	public void test_twee_cirkels_met_tweede_cirkel_null_zijn_niet_verschillend(){
		Cirkel c1 = new Cirkel(radius1, punt1);
		Cirkel c2 = null;
		assertFalse(c1.equals(c2));
	}

	@Test
	public void test_twee_cirkels_met_zelfde_straal_en_verschillend_middelpunt_zijn_verschillend(){
		Cirkel c1 = new Cirkel(radius1, punt1);
		Cirkel c2 = new Cirkel(radius1, punt2);
		assertFalse(c1.equals(c2));
	}

	@Test
	public void test_twee_cirkels_met_zelfde_middelpunt_en_verschillende_straal_zijn_verschillend(){
		Cirkel c1 = new Cirkel(radius1, punt1);
		Cirkel c2 = new Cirkel(radius2, punt1);
		assertFalse(c1.equals(c2));
	}
	
	
	
	

}
