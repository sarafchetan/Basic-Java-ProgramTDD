package gcdnumber;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gcd.gcdnumbers;

public class gcdtest {

	private gcdnumbers gcdNum;
	
	@Before
	public void setUp() throws Exception {
		gcdNum = new gcdnumbers();
    }
	
	@Test
	public void gcdnumber() {
	int number=gcdNum.findGCDNumber(55,121);
	assertEquals(11, number);
	}

	@Test
	public void gcdnumberofOne() {
	int number=gcdNum.findGCDNumber(2,3);
	assertEquals(1, number);
	}
	
	@Test
	public void gcdnumberofZeros() {
	int number=gcdNum.findGCDNumber(0,0);
	assertEquals(0, number);
	}
	
}
