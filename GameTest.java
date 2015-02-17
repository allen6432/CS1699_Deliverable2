import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;

public class GameTest {
	
	@Mock
	Game mockedGame = Mockito.mock(Game.class);
	
	// Test that method doSomething() in Game.java using "S"
	@Test
	public void GamedoSomethingtest() {
		String m = "S";
		int returnVal = mockedGame.doSomething(m);
		assertEquals(returnVal, 0);
	}
	
	// Test that method doSomething() in Game.java using "H"
	@Test
	public void GamedoSomethingtest2() {
		String m = "H";
		int returnVal = mockedGame.doSomething(m);
		//assertEquals(returnVal, 0);
		assertTrue(returnVal == 0);
	}
		
	// Test that method doSomething() in Game.java using "i"
	@Test
	public void GamedoSomethingtest3() {
		String m = "i";
		int returnVal = mockedGame.doSomething(m);
		//assertEquals(returnVal, 0);
		assertSame(returnVal, 0);
	}
	
	// Test stubbing by entering "D" into doSomething()
	@Test
	public void GamedoSomethingtest4() {
		Game mock = Mockito.mock(Game.class);
		Mockito.when(mock.doSomething("D")).thenReturn(1);
		assertEquals(1, mock.doSomething("D"));
	}
}