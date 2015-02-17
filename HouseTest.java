import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;

public class HouseTest {
	
/*	Possible Assertions:
 *	assertEquals, assertArrayEquals, assertTrue,
 * 	assertFalse, assertNull, assertNotNull,
 * 	assertSame, assertThat(*something*), assertNotSame,
 * 	fail
 */
	
	@Mock
	House mockedHouse = Mockito.mock(House.class);
	Room rm = Mockito.mock(Room.class);
	
	@Test
	public void getRoomInfotest(){
		String temp1 = "You see a";
		assertEquals(mockedHouse.getCurrentRoomInfo().contains(temp1),true);
	}
	
	@Test
	public void generateRoomstest() {
		int numRoom = 6;
		assertEquals(mockedHouse.generateRooms(numRoom).length, numRoom);
	}
}