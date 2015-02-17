import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

// You could also do this to make this a little cleaner.  
//import static org.mockito.Mockito.*;

public class PlayerTest {


	
	@SuppressWarnings("unchecked")
	//@Mock
	Player py=Mockito.mock(Player.class);
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(py);
		
	}

	@After
	public void tearDown() throws Exception {
		// any necessary teardown - none needed here
	
	}

	//Test if method hasAllItems() returns false if Player has no items
	@Test
	public void testHasAllItems() {
		assertFalse(py.hasAllItems());
	}
	
	//Test if method hasAllItems() returns true if Player has all items
	@Test
	public void testHasAllItems1() {
		py=new Player(true,true,true);
		assertTrue(py.hasAllItems());
	}
	
	//Test if method hasAllItems returns false if Player only has two items
	@Test
	public void testHasAllItems2() {
		py=new Player(true,false,true);
		assertFalse(py.hasAllItems());	
	}
	
	//Test if method hasAllItems returns false if Player only has one item
	@Test
	public void testHasAllItems3() {
		py=new Player(true,false,false);
		assertFalse(py.hasAllItems());
	}
	
	//Test if method drink returns false if Player has no items
	@Test 
	public void testDrink(){
		assertFalse(py.drink());
	}
	
	/*Order for Player's items:
		Player(boolean sugar, boolean cream, boolean coffee) 
	*/
	
	//Test if method drink returns false if Player has two items
	@Test
	public void testDrink1(){
		py=new Player(true,true,false);
		assertFalse(py.drink());
	}
	
	//Test if method drink returns false if Player has one item
	@Test
	public void testDrink2(){
		py=new Player(true,false,false);
		assertFalse(py.drink());
	}
	
	//Test if method drink returns true if Player has all three items
	@Test
	public void testDrink3(){
		py=new Player(true,true,true);
		assertTrue(py.drink());
	}
	
	//Test if method drink returns false if Player has two items
	@Test
	public void testDrink4(){
		py=new Player(true,false,true);
		assertFalse(py.drink());
	}
	
	//Test if method drink returns false if Player has two items
	@Test
	public void testDrink5(){
		py=new Player(false,true,true);
		assertFalse(py.drink());
	}
	
	//Test if method drink returns false if Player has one item
	@Test
	public void testDrink6(){
		py=new Player(false,false,true);
		assertFalse(py.drink());
	}
	
	//Test if method drink returns false if Player has one item
	@Test
	public void testDrink7(){
		py=new Player(false,true,false);
		assertFalse(py.drink());
	}
}
