import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// You could also do this to make this a little cleaner.  
// import static org.mockito.Mockito.*;

import org.mockito.*;


public class RoomTest {
	@SuppressWarnings("unchecked")
	//@Mock
	Room rm=Mockito.mock(Room.class);
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(rm);
		
	}

	@After
	public void tearDown() throws Exception {
		// any necessary teardown - none needed here
	
	}
	
	//Test that method hasItems returns true using stubbing
	@Test
	public void testHasItem(){
		Room mock=Mockito.mock(Room.class);
		Mockito.when(mock.hasItem()).thenReturn(true);
		assertEquals(true,mock.hasItem());
	}
	
	//Test that method hasItem returns false if no items are in the room
	@Test
	public void testHasItem1() {
		assertFalse(rm.hasItem());
		
	}
	
	//Test that method hasItem returns true if room has one item
	@Test
	public void testHasItem2(){
		rm=new Room(true,false,false,false,false);
		assertTrue(rm.hasItem());
	}
	
	//Test that method hasItem returns true if room has three items
	@Test
	public void testHasItem3(){
		rm=new Room(true,true,true,false,false);
		assertEquals(rm.hasItem(),true);
	}
	
	//Test that method hasSugar returns false if room doesn't contain sugar
	@Test
	public void testHasSugar() {
		assertEquals(rm.hasSugar(),false);	
	}
	
	//Test that method hasSugar returns true if room contains sugar
	@Test
	public void testHasSugar2() {
		rm=new Room(true,true,true,true,true);
		assertEquals(rm.hasSugar(),true);	
	}
	
	//Test that method hasCream returns false if room doesn't contain cream
	@Test
	public void testHasCream() {
		assertEquals(rm.hasCream(),false);	
	}
	
	//Test that method hasCream returns true if room contains cream
	@Test
	public void testHasCream2() {
		rm=new Room(true,true,true,true,true);
		assertEquals(rm.hasCream(),true);
	}
	
	//Test that method hasCoffee returns false if room doesn't contain coffee
	@Test
	public void testHasCoffee() {
		assertEquals(rm.hasCoffee(),false);
	}
	
	//Test that method hasCoffee returns true if room contains coffee
	@Test
	public void testHasCoffee2() {
		rm=new Room(true,true,true,true,true);
		assertEquals(rm.hasCoffee(),true);
	}
	
	//Test that method northExit returns false if room doesn't have north exit
	@Test
	public void testNorthExit() {
		assertEquals(rm.northExit(),false);
	}
	
	//Test that method northExit returns true if room has north exit
	@Test
	public void testNorthExit2() {
		rm=new Room(true,true,true,true,true);
		assertEquals(rm.northExit(),true);
	}
	
	//Test that method southExit returns false if room doesn't have south exit
	@Test
	public void testsouthExit() {
		assertEquals(rm.southExit(),false);
	}
	
	//Test that method southExit returns true if room has south exit
	@Test
	public void testsouthExit2() {
		rm=new Room(true,true,true,true,true);
		assertEquals(rm.southExit(),true);	
	}
	
	//Test that method getDescription returns a string that contains "You see a" when room doesn't contain anything
	@Test
	public void testgetDescription(){
		String temp1="You see a";		
		rm=new Room(false,false,false,false,false);
		assertTrue(rm.getDescription().contains(temp1));
	}
	
	//Test that method getDescription returns a string that contains "leads North" when room has a north and south exit
	@Test
	public void testgetDescription2(){
		String temp1="leads North";		
		rm=new Room(false,false,false,true,true);
		assertTrue(rm.getDescription().contains(temp1));
	}
	
	//Test that method getDescription returns a string that contains "leads South" when room has a north and south exit
	@Test
	public void testgetDescription3(){
		String temp1="leads South";		
		rm=new Room(false,false,false,true,true);
		assertTrue(rm.getDescription().contains(temp1));
	}
	
	//Test that method getDescription returns Yes using stubbing
	@Test
	public void testgetDescription4(){
		Room mock=Mockito.mock(Room.class);
		Mockito.when(mock.getDescription()).thenReturn("Yes");
		assertEquals("Yes",mock.getDescription());
	}
}
