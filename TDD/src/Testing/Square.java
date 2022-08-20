package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Square {

	@Test
	public void test() {
		App obj = new App();
		int ans = obj.square(5);
		
		assertEquals(25,ans);
	}

}
