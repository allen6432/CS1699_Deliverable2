import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;

public class CoffeeMakerTest {
	
	@Mock
	CoffeeMaker mockedCoffeeMaker = Mockito.mock(CoffeeMaker.class);
	
	// Test that method runArgs in CoffeeMaker.java returns 0 if a string is inputed
	@Test
	public void runArgstest() {
		String n = "testString";
		int returnVal = mockedCoffeeMaker.runArgs(n);
		assertEquals(returnVal, 0);
	}
}