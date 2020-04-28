package reverseNumber;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import reverse.Prefix;

public class Stringprefix {

	private Prefix stringPrefix;
	
	@Before
	public void setUp() throws Exception {
		stringPrefix = new Prefix();
	  }
	
	@Test
	public void emptyStringPrefix() {
		String arr[]= {""};
		String prefix= stringPrefix.commonStringPrefix(arr);
		assertEquals("", prefix);
	}

	@Test
	public void commonStringPrefix() {
		String arr[]= {"Flower","Flight"};
		String prefix= stringPrefix.commonStringPrefix(arr);
		System.out.println(prefix);
		assertEquals("Fl", prefix);
	}
	
	@Test
	public void NotmatchingStringPrefix() {
		String arr[]= {"dog","racecar","car"};
		String prefix= stringPrefix.commonStringPrefix(arr);
		System.out.println(prefix);
		assertEquals("", prefix);
	}
	
	
}
