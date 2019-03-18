import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Sorted_Tests {
	
	@Test
	sorted_Test(){
		SortedIntList s = new SortedIntList(false, 20);
		s.add(3);
		s.add(2);
		s.add(5);
		s.add(3);
		s.add(4);
		s.remove(0);
		s.add(-3);
		s.add(0);
		s.remove(4);
		assertEquals("S:[-3, 0, 3, 3, 5]");
		s.setUnique(true);
		assertEquals("S:[-3, 0, 3, 5]U");
	}
	

}
