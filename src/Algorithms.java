import java.util.Random;

/**
 * Contains the sorting algorithms: bubble sort, merge sort, insertion sort, heap sort, random quick sort, 
 * radix sort, and counting sort.
 * 
 * All of these algorithms are based on pseudocode found in Introduction to Algorithms 4th edition by Thomas Cormen,
 * Charles Leiserson, Ronald Rivest, and Clifford Stein.
 */

public class Algorithms {
	
	/*
	 * It goes through all of the elements in the array from the beginning. j starts at the end of the array
	 * and goes to i. During this, it is switching the elements until the lowest element from i to j is in
	 * i's position. Then i moves on to the next slot.
	 */
	public int[] bubbleSort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			for (int j = (a.length - 1); j > i; j--) {
				if (a[j] < a[j - 1]) {
					int hold = a[j];
					a[j] = a[j-1];
					a[j-1] = hold;
				}
			}
		}
		return a;
	}
	
	/*
	 * Merge sort divides the array until each sub array has 1 element. Merge is then called
	 * which puts it back together.
	 * p is the beginning index of the array.
	 * r is the end of the array
	 * q is the middle of the array
	 */
	public int[] mergeSort(int[] a, int p, int r){	
		if (a.length == 0 || a.length == 1) {
			return a;
		}
		int q = (p+r)/2;
		if(p < q || q+1 < r) {	//Stops recursion when there is only one element.
			mergeSort(a, p, q);	//Uses recursion on the right side of the list.
			mergeSort(a, q+1, r);	//Uses recursion on the left side of the list.
		}
		merge(a, p, q, r);
		return a;
	}
	
	/*
	 * Merge puts the divided array above back together in sorted order by creating different arrays
	 * and putting those elements in the new arrays and back into the original array.
	 */
	private void merge(int[] a, int p, int q, int r) {
		int lLength = q - p+1;
		int rLength = r - q;
		int[] left = new int[lLength];	//New arrays called left and right.
		int[] right = new int[rLength];
		for(int i = 0; i < left.length; i++) {	//Populates the array with the correct values.
			left[i] = a[p + i];
		}
		for(int i = 0; i < right.length; i++) {
			right[i] = a[q + i + 1];
		}
		int i = 0; //Indexes the smallest remaining element in the left.
		int j = 0; //Indexes the smallest remaining element in the right.
		int k = p; //k indexes the location in A to fill
		
		while (i < left.length && j < right.length) {
			if(left[i] <= right[j]) {	//Tests to if it pulls from the left list first.
				a[k] = left[i];
				i++;
			} else {		//Here it pulls from the right.
				a[k] = right[j];
				j++;
			}
			k++;
		}
		/*
		 * If one list has finished, it pulls from the list that hasn't. All of the values should already be
		 * sorted so there is no need to compare.
		 */
		while (i < left.length) {
			a[k] = left[i];
			i ++;
			k ++;
		}
		while (j < right.length) {
			a[k] = right[j];
			j++;
			k++;
		}
	}
	/*
	 * Starts at the beginning of the list. Everything up until i should be sorted. The array shifts all the 
	 * previous values to properly place the new one. The new value gets placed and i gets incremented to sort
	 * the next value in the list.
	 */
	public int[] insertionSort(int[] a) {
		for(int i = 1; i < a.length; i ++) {
			int key = a[i];			//Key is the value we are placing in the sorted subarray.
			int j = i - 1;
			while( j >= 0 && a[j] > key) {	//Shifting the sorted values
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;	//Places the element.
		}
		return a;
	}
	
	/*
	 * Uses build max heap to create and store a max heap in the given array. It then pops the root off and
	 * places it at the end of the list. It then restores order by using max heapify. it does the same thing
	 * but places it in the n-1 slot and then n-2 until n = 1.
	 */
	public int[] heapSort(int[] a, int n) {
		a = buildMaxHeap(a, n);
		int heapSize = n;
		for(int i = n - 1; i > 0; i--) {
			int hold = a[i];
			a[i] = a[0];
			a[0] = hold;
			heapSize--;
			a = maxHeapify(a, 0, heapSize);
			
		}
		return a;
	}
	
	/*
	 * Uses max heapify to build a max heap out of a given array.
	 */
	private int[] buildMaxHeap(int[] a, int n){
		for(int i = (n/2) - 1; i >= 0; i--) {
			a = maxHeapify(a, i, n);
		}
		return a;
	}
	
	/*
	 * Uses recursion to restore order for a given size.
	 */
	private int[] maxHeapify(int[] a, int i, int heapSize) {
		int lIndex = (2*i) + 1; //Gets index of the left child.
		int rIndex = (2*i) + 2;	//Index of the right child.
		int largest = i;	//Holds the largest value of the 3.
		if(lIndex < heapSize && a[lIndex] >a[largest]) {	//Left child is bigger
			largest = lIndex;
		}
		if(rIndex < heapSize && a[rIndex] > a[largest]) {	//Right child is bigger
			largest = rIndex;
		}
		if(largest != i) {	//If one is larger, it switches it and recursively calls itself on the parent that was switched with a child.
			int hold = a[i];
			a[i] = a[largest];
			a[largest] = hold;
			maxHeapify(a, largest, heapSize);
		}
		
		return a;
	}

	/*
	 * Picks a random number between p and r then puts it at the end of the list. It then calls partition.
	 */
	private int randomizedPartition (int[] a, int p, int r) {
		Random rand = new Random();
		int i = -1;
		while(p > i) {
			i = rand.nextInt(r);
		}
		int hold = a[r];
		a[r] = a[i];
		a[i] = hold;
		return partition(a, p, r);
	}
	
	/*
	 * Sorts the elements into two subarrays. One is elements smaller than r and the other is elements larger than p.
	 * It then puts the last element as a divider of the 2 subarrays and returns the index.
	 */
	private int partition(int[] a, int p, int r) {
		int x = a[r];	//Divider
		int i = p;	//Beginning of the list
		for(int j = p; j < r; j ++) {//Checks all the elements in the list.
			if (a[j] <= x){	//If an element is small than x, it moves it to i. x will be placed at the last i.;
				int hold = a[j];
				a[j] = a[i];
				a[i] = hold;
				i++;
			}
		}
		int hold = a[i];	//Places x at i.
		a[i] = a[r];
		a[r] = hold;
		return i;
	}
	/*
	 * Uses recursive calls to itself to sort a list.
	 */
	public int[] randomQuickSort(int[] a, int p, int r) {
		if (p < r) {
			int q = randomizedPartition(a, p, r);
			randomQuickSort(a, p, q-1);
			randomQuickSort(a, q+1, r);
		}
		return a;
	}
	
	/*
	 * Uses counting sort to go digit by digit and sort the elements.
	 */
	public int[] radixSort(int[] a, int d) {
		for(int i = 0; i < d; i++) {
			int num = (int) (Math.pow(10, i));	//Finds the correct digit.
			a = countingSort(a, num);
		}
		return a;
	}
	
	/*
	 * Uses the array c to get the indexes of where the elements of a will go in b. Will return the array
	 * in sorted order for that digit.`
	 */
	private int[] countingSort(int[] a, int place) {
		int[] b = new int[a.length];
		int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for(int i = 0; i < a.length; i ++) {	//Finding and adding 1 to the proper digit spot. 
			int num = (a[i]/place)%(10);
			c[num] ++;
		}
		int amount = -1;
		for(int i = 0; i < c.length; i ++) { //Now correctly indexes the digit array(c).
			amount = amount + c[i];
			c[i] = amount;
		}
		for(int i = a.length - 1; i >= 0; i--) { //Uses the index from c to correctly map the place the number it is in array b.
			int num = (a[i]/place)%(10);
			b[c[num]] = a[i];
			c[num]--;	//Increments the index spot.
		}
		return b;
	}

}
