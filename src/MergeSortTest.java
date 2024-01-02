import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeSortTest {

	@Test
	void regularNumbersTest() {
		int[] test = {65, 2, 4, 67, 8, 846, 90, 78, 39, 884, 98};
		Algorithms algie = new Algorithms();
		int[] correct = {2, 4, 8, 39, 65, 67, 78, 90, 98, 846, 884};
		test = algie.mergeSort(test, 0, (test.length - 1));
		for(int i = 0; i < test.length; i++) {
			assertTrue(test[i] == correct[i]);
		}
	}
	
	@Test
	void negativeNumbersTest() {
		Algorithms algie = new Algorithms();
		int[] a = {-12, 30, -4, 5, -67, 80, 99, -68};
		a = algie.mergeSort(a, 0, (a.length - 1));
		int[] correct = {-68, -67, -12, -4, 5, 30, 80, 99};
		for(int i = 0; i < a.length; i ++) {
			assertTrue(a[i] == correct[i]);
		}
	}

	@Test
	void emptyArrayTest() {
		Algorithms algie = new Algorithms();
		int[] a = {};
		algie.mergeSort(a, 0, 0);
		assertTrue(a.length == 0);
	}
	
	@Test
	void oneItemTest() {
		Algorithms algie = new Algorithms();
		int[] a = {1};
		algie.mergeSort(a, 0, (a.length - 1));
		assertTrue(a.length == 1 && a[0] == 1);
	}
	
	@Test
	void twoItemTest() {
		Algorithms algie = new Algorithms();
		int[] a = {2,1};
		algie.mergeSort(a, 0, (a.length - 1));
		assertTrue(a.length == 2 && a[0] == 1 && a[1] == 2);
	}
}
