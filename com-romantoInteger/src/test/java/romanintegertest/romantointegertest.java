package romanintegertest;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import romantointeger.romantointeger;

public class romantointegertest {

	private romantointeger romantointeger;

	@Before
	public void setUp() throws Exception {
		romantointeger = new romantointeger();
	}


	@Test public void romanToIntegerI() { int
		romanI=romantointeger.convertInt("I"); assertEquals(1, romanI); }


	@Test public void romanToIntegerV() { int
		romanV=romantointeger.convertInt("V"); assertEquals(5, romanV); }

	@Test public void romanToIntegerX() { int
		romanX=romantointeger.convertInt("X"); assertEquals(10, romanX); }

	@Test public void romanToIntegerL() { int
		romanL=romantointeger.convertInt("L"); assertEquals(50, romanL); }

	@Test public void romanToIntegerC() { int
		romanC=romantointeger.convertInt("C"); assertEquals(100, romanC); }

	@Test public void romanToIntegerD() { int
		romanD=romantointeger.convertInt("D"); assertEquals(500, romanD); }

	@Test public void romanToIntegerM() { int
		romanM=romantointeger.convertInt("M"); assertEquals(1000, romanM); }


	@Test
	public void romanToIntegerIII() {
		int romanIII=romantointeger.convertInt("III");
		assertEquals(3, romanIII);
	}

	@Test
	public void romanToIntegerMCMXCIV() {
		int romanMCMXCIV=romantointeger.convertInt("MCMXCIV");
		assertEquals(1994, romanMCMXCIV);
	}
}
