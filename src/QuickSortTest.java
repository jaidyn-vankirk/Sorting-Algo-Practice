import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuickSortTest {

	@Test
	void regularTest() {
		int[] a = {23, 5, 65, 2, 89, 90, 25, 3, 78};
		Algorithms algie = new Algorithms();
		a = algie.randomQuickSort(a, 0, a.length - 1);
		int[] correct = {2, 3, 5, 23, 25, 65, 78, 89, 90};
		for(int i = 0; i < a.length; i ++) {
			assertTrue(a[i] == correct[i]);
		}
	}
	
	@Test
	void anotherRegularTest() {
		int[] a = {23, 5, 65, 2, 89, 90, 25, 3, 78, 47};
		Algorithms algie = new Algorithms();
		a = algie.randomQuickSort(a, 0, a.length - 1);
		int[] correct = {2, 3, 5, 23, 25, 47, 65, 78, 89, 90};
		for(int i = 0; i < a.length; i ++) {
			assertTrue(a[i] == correct[i]);
		}
	}
	
	@Test
	void emptyArrayTest() {
		int[] a = {};
		Algorithms algie = new Algorithms();
		a = algie.randomQuickSort(a, 0, a.length - 1);
		assertTrue(a.length == 0);
	}
	
	@Test
	void oneElementArrayTest() {
		int[] a = {1};
		Algorithms algie = new Algorithms();
		a = algie.heapSort(a, a.length - 1);
		assertTrue(a[0] == 1);
	}
	
	@Test 
	void twoElementTest(){
		int[] a = {2,1};
		Algorithms algie = new Algorithms();
		a = algie.randomQuickSort(a, 0, a.length -1);
		assertTrue(a[0] == 1 && a[1] == 2);
	}
	
	@Test
	void threeElementTest() {
		int[] a = {2,3,1};
		Algorithms algie = new Algorithms();
		a = algie.randomQuickSort(a, 0, a.length - 1);
		assertTrue(a[0] == 1 && a[1] == 2 && a[2] == 3);
	}

}
