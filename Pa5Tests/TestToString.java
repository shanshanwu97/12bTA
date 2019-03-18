package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestToString {

	@Test
	void testAdds() {
		SortedIntList list = new SortedIntList();
		list.add(14);
		list.add(24);
		list.add(11);
		list.add(0);
		list.add(12);
		list.add(42);
		list.add(1);
		list.add(101);
		assertEquals("S:[0, 1, 11, 12, 14, 24, 42, 101]", list.toString());
	}
	
	@Test
	void testUniques() {
		SortedIntList list = new SortedIntList(true);
		list.add(14);
		list.add(24);
		list.add(11);
		list.add(0);
		list.add(12);
		list.add(42);
		list.add(42);
		list.add(1);
		list.add(14);
		list.add(24);
		list.add(24);
		list.add(24);
		list.add(0);
		list.add(101);
		assertEquals("S:[0, 1, 11, 12, 14, 24, 42, 101]U", list.toString());
	}

}
