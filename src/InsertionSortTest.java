import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

	@Test
	void regularNumberTest() {
		int[] test = {65, 2, 4, 67, 8, 846, 90, 78, 39, 884, 98};
		Algorithms algie = new Algorithms();
		int[] correct = {2, 4, 8, 39, 65, 67, 78, 90, 98, 846, 884};
		test = algie.insertionSort(test);
		for(int i = 0; i < test.length; i++) {
			assertTrue(test[i] == correct[i]);
		}
	}
		@Test
		void negativeNumberTest() {
			Algorithms algie = new Algorithms();
			int[] a = {-12, 30, -4, 5, -67, 80, 99, -68};
			algie.insertionSort(a);
			int[] correct = {-68, -67, -12, -4, 5, 30, 80, 99};
			for(int i = 0; i < a.length; i ++) {
				assertTrue(a[i] == correct[i]);
			}
		}
		
		@Test
		void emptyArrayTest() {
			Algorithms algie = new Algorithms();
			int[] a = {};
			algie.insertionSort(a);
			assertTrue(a.length == 0);
		}
		
		@Test
		void oneItemArrayTest() {
			Algorithms algie = new Algorithms();
			int[] a = {1};
			algie.insertionSort(a);
			assertTrue(a.length == 1 && a[0] == 1);
		}
		
		@Test
		void twoItemArrayTest() {
			Algorithms algie = new Algorithms();
			int[] a = {2,1};
			algie.insertionSort(a);
			assertTrue(a.length == 2 && a[0] == 1 && a[1] == 2);

	}

}
