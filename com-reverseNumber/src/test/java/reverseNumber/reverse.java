package reverseNumber;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import reverse.ReverseNumber;

public class reverse {

	private ReverseNumber reverseNum;
	
	@Before
	public void setUp() throws Exception {
		reverseNum = new ReverseNumber();
    }
	
	@Test
	public void checkPositiveNumberReverse() {
		int reverseNumber= reverseNum.reverse(1236);
		assertEquals(6321, reverseNumber);
	}

	@Test
	
	public void checkNegativeNumberReverse() {
		int reverseNumber= reverseNum.reverse(-1234);
		
		assertEquals(-4321, reverseNumber);
	}
	
	
	
}
