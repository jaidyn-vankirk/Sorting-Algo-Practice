import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadixSortTest {

	@Test
	void test() {
		int[] a = {23, 5, 65, 2, 89, 90, 25, 3, 78};
		Algorithms algie = new Algorithms();
		a = algie.radixSort(a, 2);
		int[] correct = {2, 3, 5, 23, 25, 65, 78, 89, 90};
		for(int i = 0; i < a.length; i ++) {
			assertTrue(a[i] == correct[i]);
		}
	}
	
	@Test
	void thousandsPlaceTest() {
		int[] a = {23, 5, 125, 65, 2, 890, 89, 670, 90, 25, 1220, 3, 78, 47, 1002, 45, 67};
		Algorithms algie = new Algorithms();
		a = algie.radixSort(a, 4);
		int[] correct = {2, 3, 5, 23, 25, 45, 47, 65, 67, 78, 89, 90, 125, 670, 890, 1002, 1220};
		for(int i = 0; i < a.length; i ++) {
			assertTrue(a[i] == correct[i]);
		}
	}
	
	@Test
	void emptyArrayTest() {
		int[] a = {};
		Algorithms algie = new Algorithms();
		a = algie.radixSort(a, 0);
		assertTrue(a.length == 0);
	}
	
	@Test
	void oneElementArrayTest() {
		int[] a = {1};
		Algorithms algie = new Algorithms();
		a = algie.radixSort(a, 1);
		assertTrue(a[0] == 1);
	}
	
	@Test 
	void twoElementTest(){
		int[] a = {2,1};
		Algorithms algie = new Algorithms();
		a = algie.radixSort(a, 1);
		assertTrue(a[0] == 1 && a[1] == 2);
	}
	
	@Test
	void threeElementTest() {
		int[] a = {2,3,1};
		Algorithms algie = new Algorithms();
		a = algie.radixSort(a, 1);
		assertTrue(a[0] == 1 && a[1] == 2 && a[2] == 3);
	}

}
