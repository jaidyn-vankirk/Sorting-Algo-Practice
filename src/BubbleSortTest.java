import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	void regularNumbersTest() {
		Algorithms algie = new Algorithms();
		int[] a = {56, 78, 94, 34, 1, 9, 75};
		int[] correct = {1, 9, 34, 56, 75, 78, 94};
		algie.bubbleSort(a);
		for(int i = 0; i < a.length; i ++) {
			assertTrue(a[i] == correct[i]);
		}
	}
	
	@Test
	void negativeNumbersTest() {
		Algorithms algie = new Algorithms();
		int[] a = {-12, 30, -4, 5, -67, 80, 99, -68};
		int[] correct = {-68, -67, -12, -4, 5, 30, 80, 99};
		algie.bubbleSort(a);
		for(int i = 0; i < a.length; i ++) {
			assertTrue(a[i] == correct[i]);
		}
	}
	
	@Test
	void emptyArray() {
		Algorithms algie = new Algorithms();
		int[] a = {};
		algie.bubbleSort(a);
		assertTrue(a.length == 0);
	}
	
	@Test
	void oneItemInArray() {
		Algorithms algie = new Algorithms();
		int[] a = {1};
		algie.bubbleSort(a);
		assertTrue(a.length == 1 && a[0] == 1);
	}
	
	@Test
	void twoItemsInArray() {
		Algorithms algie = new Algorithms();
		int[] a = {2,1};
		algie.bubbleSort(a);
		assertTrue(a.length == 2 && a[0] == 1 && a[1] == 2);
	}

}
