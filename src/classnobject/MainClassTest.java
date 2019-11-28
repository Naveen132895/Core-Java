package classnobject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainClassTest {

	@Test
	void testAdd() {
		assertEquals(15,MainClass.add(5, 10));
		assertEquals(25,MainClass.add(15, 10));
		assertEquals(5,MainClass.add(15, -10));
		//fail("Not yet implemented");
	}

}
