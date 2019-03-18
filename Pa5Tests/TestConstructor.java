package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConstructor {

	@Test
	void testDefault() {
		SortedIntList list = new SortedIntList();
		assertEquals("S:[]", list.toString());
	}
	
	@Test
	void testUnique() {
		SortedIntList list = new SortedIntList(true);
		assertEquals("S:[]U", list.toString());
	}
	
	@Test
	void testUniqueFalse() {
		SortedIntList list = new SortedIntList(false);
		assertEquals("S:[]", list.toString());
	}
	
	@Test
	void testCapacity() {
		SortedIntList list = new SortedIntList(24);
		assertEquals("S:[]", list.toString());
	}
	

}
