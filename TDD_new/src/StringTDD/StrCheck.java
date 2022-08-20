package StringTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrCheck {

	Example e = new Example();

	@Test
	public void test2char() {	
		assertEquals("AB",e.swap2char("BA"));
	}	
	
	@Test
	public void test4char() {	
		assertEquals("ABCD",e.swap2char("ABDC"));
	}
	
	@Test
	public void test5char() {	
		assertEquals("ABCDE",e.swap2char("ABCED"));
	}
	
	@Test
	public void test1char() {	
		assertEquals("A",e.swap2char("A"));
	}
	
	@Test
	public void test0char() {	
		assertEquals("",e.swap2char(""));
	}




}
