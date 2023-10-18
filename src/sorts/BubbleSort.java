package sorts;
/**
 * @author: Ryan Clarkson
 */
public class BubbleSort {
    	static void bubbleSort(int[] array) {
		int alength = array.length-1;
		boolean swap;
		for (int a = 0; a<alength; a++) {
			swap = false;
			for(int b = 0; b<alength-a-1; b++) {
				if (array[b]>array[b]+1) {
					int temp = array[b];
					array[b] = array[b]+1;
					array[b+1] = temp;
					swap = true;
				}

			}
			if (!swap) {
				break;
			}
		}
		System.out.println(array);
	}

}
